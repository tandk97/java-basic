package 연산자;

import javax.swing.JOptionPane;

public class 내년나이계산 {

	public static void main(String[] args) {
		// 입력
		String age = JOptionPane.showInputDialog("올해 나이 입력");
		// 처리
		// age + 1; // "100" + 1 ==> "1001"
		// 숫자로 변환해주세요.
		int age2 = Integer.parseInt(age);
		int age3 = age2 + 1;
		// 출력
		JOptionPane.showMessageDialog(null, "내년 나이는 " + age3);

	}

}
