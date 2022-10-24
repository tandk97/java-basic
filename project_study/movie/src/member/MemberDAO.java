package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// 데이터베이스 연결하기, 데이터베이스안에 삽입하기, 삭제하기, 수정하기, 검색하기 기능을 구현해 주는 클래스
public class MemberDAO {

	// 필드 선언(변수)
	String driver = "com.mysql.cj.jdbx.Driver";
	String url = "jdbc:mysql://localhost:3306/movie";
	String userid = "root";
	String password = "1234";

	Connection conn = null; // 연결
	Statement stmt = null; // sql문에 전달
	PreparedStatement pstmt = null; // sql문 전달(나중에 ? ? 안에 데이터를 추가할 수 있음)
	ResultSet rs = null; // DB의 처리 결과를 받을 때

	// 메서드 구현
	public void insertMember(String id, String name, String pwd, String phoneNumber) {
		// DB에 자료를 삽입하기
		try {
			conn = DriverManager.getConnection(url, userid, password);
			String query = "insert into member(id, name, pwd, phoneNumber) values( ?, ?, ?, ? )";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, pwd);
			pstmt.setString(4, phoneNumber);
			pstmt.executeUpdate(); // 삽입, 삭제, 수정
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} // last catch

		} // finally

	} // public void insertMember

	public boolean checkID(String id) {
		// 아이디 중복 체크하기
		boolean result = false;
		try {
			conn = DriverManager.getConnection(url, userid, password);
			String query = "select id from member where id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(); // 검색
			if (rs.next()) {
				result = true;
			} else {
				result = false;
			} // if, else
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} // last catch
		} // finally
		return result;
	} // public boolean checkID

	public int login(String id, String pwd) {
		// 로그인 하기 - id와 pwd를 member 테이블 안에 있는지 DB에 보내서 있는지 확인하기
		try {
			conn = DriverManager.getConnection(url, userid, password);
			String query = "select pwd from member where id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString(1).contentEquals(pwd)) {
					return 1;
				} else {
					return 0;
				}
			}
			return 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;

	}

	public ArrayList<MemberDTO> select() {
		// DB안에서 모든 자료 검색하기
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(url, userid, password);
			String query = "select * from member ";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setPwd(rs.getString("pwd"));
				dto.setPhoneNumber(rs.getString("phoneNumber"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public void deleteMember(String id) {
		// 해당하는 아이디 찾아서 삭제하기
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DriverManager.getConnection(url, userid, password);
			String query = "delete from member where id=? ";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			int n = pstmt.executeUpdate();
			if (n == 1)
				System.out.println("삭제 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void update(String id, String name, String pwd, String phoneNumber) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DriverManager.getConnection(url, userid, password);
			String query = "update member set name = ?, pwd=?, phoneNumber=? where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, pwd);
			pstmt.setString(3, phoneNumber);
			pstmt.setString(4, id);
			int n = pstmt.executeUpdate();
			if (n == 1)
				System.out.println("수정 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public MemberDTO search(String id) {
		// 해당 id사람만 조회하기
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDTO dto = new MemberDTO();
		try {
			conn = DriverManager.getConnection(url, userid, password);
			String query = "select * from member where id=? ";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setPwd(rs.getString("pwd"));
				dto.setPhoneNumber(rs.getString("phoneNumber"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}

} // public class MemberDAO
