package 연습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class 게시판DAO {

	public void insert(String NO, String TITLE, String CONTENT, String WRITER) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";

			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "insert into BBSP values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, NO);
			ps.setString(2, TITLE);
			ps.setString(3, CONTENT);
			ps.setString(4, WRITER);

			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "게시물 작성 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(String NO) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "DELETE FROM BBSP WHERE NO=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, NO);

			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "게시물 삭제 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(String NO, String TITLE, String CONTENT, String WRITER) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "UPDATE BBSP SET TITLE = ?, CONTENT = ?, WRITER = ? WHERE NO = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, TITLE);
			ps.setString(2, CONTENT);
			ps.setString(3, WRITER);
			ps.setString(4, NO);

			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "게시물 수정 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public BBSVO search(String NO) {
		BBSVO bag = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "select * FROM BBSP WHERE NO=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, NO);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String no = rs.getString(1);
				String TITLE = rs.getString(2);
				String CONTENT = rs.getString(3);
				String WRITER = rs.getString(4);

				bag = new BBSVO();
				bag.setNo(no);
				bag.setTitle(TITLE);
				bag.setContent(CONTENT);
				bag.setWriter(WRITER);
			} else {
				JOptionPane.showMessageDialog(null, "검색 결과가 없습니다");
			}

			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}

	public ArrayList<BBSVO> list() {
		// box
		ArrayList<BBSVO> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공.@@@@");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. db연결 성공.@@@@@@");
			String sql = "select * from BBSP";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공.@@@@@");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String no = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				System.out.println("검색한 결과>>" + no + " " + title + " " + content + " " + writer);
				BBSVO bag = null;
				bag = new BBSVO();
				bag.setNo(no);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
				list.add(bag);
				System.out.println("리스트에 들어간 가방수 >> " + list.size());
			}
			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
