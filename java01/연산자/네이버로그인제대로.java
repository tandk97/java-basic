package 연산자;

import javax.swing.JOptionPane;

public class 네이버로그인제대로 {

	public static void main(String[] args) {
		// db에 저장된 가입할 때의 id/pw
		String id = "root";
		String pw = "pass";

		// 로그인할 때 입력 id/pw
		String id2 = JOptionPane.showInputDialog("로그인 id");
		String pw2 = JOptionPane.showInputDialog("로그인 pw");

		// String은 기본형이 아니어서 값을 비교할 때에 연산자를 쓸 수 없다.
		if (id.equals(id2) && pw.equals(pw2)) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패");
		}
	}

}
