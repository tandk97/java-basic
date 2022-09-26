package 연습;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// 가로 세로 입력 받기
		String a = JOptionPane.showInputDialog("가로 길이를 입력하세요");
		String b = JOptionPane.showInputDialog("세로 길이를 입력하세요");
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		// 출력
		JOptionPane.showMessageDialog(null, "사각형의 면적은" + a1 * b1);

	}

}
