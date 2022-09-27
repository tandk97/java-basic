package 복습;

import javax.swing.JOptionPane;

public class 복습2 {

	public static void main(String[] args) {
		// 입력
		String height = JOptionPane.showInputDialog("키 입력");
		// 처리
		double height2 = Double.parseDouble(height); // 실수
		// 자바는 연산시 하나라도 실수이면 결과는 무조건 실수
		double result = (height2 - 100) * 0.9;
		// 출력
		JOptionPane.showMessageDialog(null, "적정 몸무게는 " + result);
	}

}
