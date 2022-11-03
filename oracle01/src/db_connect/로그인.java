package db_connect;

import javax.swing.JOptionPane;

public class 로그인 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		
		MemberDAO dao = new MemberDAO();
		
		MemberVO bag = new MemberVO();
		
		bag.setId(id);
		bag.setPw(pw);
		int result = dao.login(bag);
		if(result == 1) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

}
