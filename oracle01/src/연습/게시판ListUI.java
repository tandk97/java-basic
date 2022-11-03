package 연습;
import java.util.ArrayList;
public class 게시판ListUI {
	public static void main(String[] args) {
		게시판DAO dao = new 게시판DAO();
		ArrayList<BBSVO> list = dao.list();
		System.out.println("검색한 회원수>>  " + list.size());
		for (int i = 0; i < list.size(); i++) {
			BBSVO bag = list.get(i);
			System.out.println(bag.getNo());
			System.out.println(bag.getTitle());
			System.out.println(bag.getContent());
			System.out.println(bag.getWriter());
			System.out.println("-------------------");
		}
//		for (MemberVO bag : list) { //for-each
//			System.out.println(bag.getId());
//			System.out.println(bag.getPw());
//			System.out.println(bag.getName());
//			System.out.println(bag.getTel());
//			System.out.println("-------------------");
//		}
	}
}