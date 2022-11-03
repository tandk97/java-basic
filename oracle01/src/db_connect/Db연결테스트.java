package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Db연결테스트 {

	public static void main(String[] args) {
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

		String sql = "insert into member2 values ('water', 'water', 'water', '070-6665-4515')";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. sql문 객체 생성");

		int result = ps.executeUpdate();
		System.out.println("4. sql문 DB 서버로 전송 성공>> " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
