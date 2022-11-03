package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	// 기능 한개당 메서드 1개
	public void insert(String id, String pw, String name, String tel) {
//	public void insert(MemberVO bag) {
		// 자바에서 DBMS를 연결하려고 함
		// JDBC 프로그래밍 절차 4단계
		// 1. 드라이버 설정 - 드라이버(커넥터) 로딩
		// db의 유형, 버전에 따라 매우 많고 필요할 때 다운로드 받아 써야 함
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정

			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공");

			String sql = "insert into member2 values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			// ?에 변수에 저장해놓은 값을 String으로 넣어주는 코드 작성
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
//			ps.setString(1, bag.getId());
//			ps.setString(2, bag.getPw());
//			ps.setString(3, bag.getName());
//			ps.setString(4, bag.getTel());
			System.out.println("3. sql문 객체 생성");

			int result = ps.executeUpdate();
			System.out.println("4. 삽입 sql문 DB 서버로 전송 성공>> " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(String id) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공");

			String sql = "DELETE FROM member2 WHERE id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. sql문 객체 생성");

			int result = ps.executeUpdate();
			System.out.println("4. 삭제 sql문 DB 서버로 전송 성공>> " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public MemberVO search(String id) {
		System.out.println("id : " + id);
		MemberVO bag = null; // 쓰레기값 ==> 변수 초기화 시켜줘야함
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공");

			String sql = "select * FROM member2 WHERE id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. sql문 객체 생성");

			ResultSet rs = ps.executeQuery();
			if (rs.next()) { // 결과값이 true이면
				System.out.println("검색결과가 있음");
				String id2 = rs.getString(1);
				String pw = rs.getString("pw");
				String name = rs.getString(3);
				String tel = rs.getString(4);
				System.out.println("검색한 결과>> id : " + id2 + " / pw : " + pw + " / name : " + name + " / tel : " + tel);
				// UI에서 사용자가 검색한 결과를 볼 수 있어야 한다.
				// 4개의 데이터를 UI에게 return 해주자
				// 1) 가방 만들기 2) 데이터 넣기 3) return(전달)

				bag = new MemberVO();
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
			} else {
				System.out.println("검색 결과가 없습니다");
			}
			// System.out.println("4. 검색 sql문 DB 서버로 전송 성공>> " + rs.next());

			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	} // search 메서드 끝

	public int login(MemberVO bag) {
		System.out.println(bag);
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공");

			String sql = "select * FROM member2 WHERE id=? and pw=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			System.out.println("3. sql문 객체 생성");

			ResultSet rs = ps.executeQuery();
			if (rs.next()) { // 결과값이 true이면
				System.out.println("검색결과가 있음");
				result = 1;
			} else {
				System.out.println("검색 결과가 없습니다");
			}
			// System.out.println("4. 검색 sql문 DB 서버로 전송 성공>> " + rs.next());

			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public ArrayList<MemberVO> list() {
		// box
		ArrayList<MemberVO> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공.@@@@");
			// 2. db연결 mySQL: school, oracle: xe
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. db연결 성공.@@@@@@");
			// 3. sql문을 만든다.
			String sql = "select * from member2";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공.@@@@@");
			// 4. sql문을 db서버에 보낸다. --> 결과가 어떻게 되었는지 자바프로그램 알려줌.
			ResultSet rs = ps.executeQuery(); // r의 결과는 table, cud는 숫자(실행된row수) //1
			while (rs.next()) { // 결과값이 true이면!!
				String id2 = rs.getString(1); // 컬럼의 순서 1번 id값 추출
				String pw = rs.getString("pw");
				String name = rs.getString(3);
				String tel = rs.getString(4);
				System.out.println("검색한 결과>>" + id2 + " " + pw + " " + name + " " + tel);
				MemberVO bag = null; // 쓰레기값!!--> 변수 초기화시켜주어야함.!
				bag = new MemberVO();
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				list.add(bag);
				System.out.println("리스트에 들어간 가방수 >> " + list.size());
			}
			// db처리와 관련된 메모리 할당된 것 해제시켜주자.
			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 메서드의 처리를 다 끝내고, 결과를 보내줘라는 개념. 맨 끝에 써야함.
		return list;
	} // list
}