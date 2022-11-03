package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MemberDAO {

	public MemberVO search(String id) {
		MemberVO bag = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 연결

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";

			Connection con = DriverManager.getConnection(url, user, password); // DB에 연결

			String sql = "select * FROM MEMBER WHERE MEMBER_ID=?"; // SQL문 생성
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			ResultSet rs = ps.executeQuery(); // 검색을 위한 데이터 패킷 만들기
			if (rs.next()) {
				String id1 = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String date = rs.getString(4);
				String tel = rs.getString(5);
				String mr = rs.getString(6);
				int tm = rs.getInt(7);
				String loan = rs.getString(8);

				bag = new MemberVO();
				bag.setId(id1);
				bag.setPw(pw);
				bag.setName(name);
				bag.setDate(date);
				bag.setTel(tel);
				bag.setMr(mr);
				bag.setTm(tm);
				bag.setLoan(loan);

				JOptionPane.showMessageDialog(null, "검색이 완료되었습니다 ");
			} else {
				JOptionPane.showMessageDialog(null, "검색 결과가 없습니다");
			}
			rs.close();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	} // 1. end search

	public void insert(String id, String pw, String name, String date, String tel, String mr, int tm, String loan) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 연결

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";

			Connection con = DriverManager.getConnection(url, user, password); // DB에 연결
			String sql = "insert into MEMBER values (?, ?, ?, ?, ?, ?, ?, ?)"; // SQL문 생성
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, date);
			ps.setString(5, tel);
			ps.setString(6, mr);
			ps.setInt(7, tm);
			ps.setString(8, loan);

			ps.executeUpdate(); // DB에 저장
			JOptionPane.showMessageDialog(null, "회원 정보 저장 완료"); // 저장됐다고 알려주기
			ps.close(); // 메모리 종료
			con.close(); // 메모리 종료
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // 2. end insert

	public void update(String id, String pw, String name, String date, String tel, String mr, int tm, String loan) {
		try {
			System.out.println(pw + name);
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 연결

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";

			Connection con = DriverManager.getConnection(url, user, password); // DB에 연결

			String sql = "UPDATE MEMBER SET MEMBER_PW = ?, MEMBER_NAME = ?, MEMBER_AGE = ?, MEMBER_TEL = ?, MEMBER_MR = ?, MEMBER_TM = ?, MEMBER_LOAN = ? WHERE MEMBER_ID = ?"; // SQL문
																																												// 생성
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, pw);
			ps.setString(2, name);
			ps.setString(3, date);
			ps.setString(4, tel);
			ps.setString(5, mr);
			ps.setInt(6, tm);
			ps.setString(7, loan);
			ps.setString(8, id);

			ps.executeUpdate(); // DB에 반영
			JOptionPane.showMessageDialog(null, "회원 정보 수정 완료"); // 수정 완료 했다고 알려주기
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // 3. end update

	public void delete(String id) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 연결

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";

			Connection con = DriverManager.getConnection(url, user, password); // DB에 연결

			String sql = "DELETE FROM MEMBER WHERE MEMBER_ID=?"; // SQL문 생성
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			ps.executeUpdate(); // DB에 반영
			JOptionPane.showMessageDialog(null, "회원 정보 삭제 완료"); // 삭제했다고 알려주기
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // 4. end delete

	public ArrayList<MemberVO> list() {
		ArrayList<MemberVO> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 연결

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";

			Connection con = DriverManager.getConnection(url, user, password); // DB에 연결

			String sql = "select * from MEMBER"; // SQL문 생성
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery(); // 데이터 패킷 만들기
			while (rs.next()) {
				String id1 = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String date = rs.getString(4);
				String tel = rs.getString(5);
				String mr = rs.getString(6);
				int tm = rs.getInt(7);
				String loan = rs.getString(8);
				MemberVO bag = null;
				bag = new MemberVO();
				bag.setId(id1);
				bag.setPw(pw);
				bag.setName(name);
				bag.setDate(date);
				bag.setTel(tel);
				bag.setMr(mr);
				bag.setTm(tm);
				bag.setLoan(loan);
				//System.out.println("List VO : " + bag);
				list.add(bag);
			}
			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	} // end list

} // end MemberDAO