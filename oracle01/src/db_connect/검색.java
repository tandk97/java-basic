package db_connect;

import javax.swing.JOptionPane;

public class 검색 {

	public static void main(String[] args) {
		// 입력하는 화면을 ui 파일에 만들기
		String id = JOptionPane.showInputDialog("검색할 아이디 입력");
		
		// 입력한 데이터를 DB에 넣기
		// DB의 member2 테이블에 넣고싶음
		// ==> MemberDAO 사용하면 됨
		
		MemberDAO dao = new MemberDAO();
		MemberVO bag = dao.search(id);
		JOptionPane.showMessageDialog(null, bag);
		dao.search(id); // 메서드 이름 위에서 ctrl+클릭하면 원본으로 이동
		
	}

}
