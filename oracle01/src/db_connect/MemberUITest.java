package db_connect;

import javax.swing.JOptionPane;

public class MemberUITest {

	public static void main(String[] args) {
		// 입력하는 화면을 ui 파일에 만들기
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		String name = JOptionPane.showInputDialog("이름 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력");
		
		// 입력한 데이터를 DB에 넣기
		// DB의 member2 테이블에 넣고싶음
		// ==> MemberDAO 사용하면 됨
		
		MemberDAO dao = new MemberDAO();
		dao.insert(id, pw, name, tel);
		JOptionPane.showMessageDialog(null, id + "성공적으로 회원가입됨");
		
		// 삭제
		String id1 = JOptionPane.showInputDialog("탈퇴할 아이디 입력");
		dao.delete(id1);
		
	}

}
