package 연습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// 적정 몸무게 구하기
		String height = JOptionPane.showInputDialog("키가 얼마인가요?");
		double height1 = Double.parseDouble(height);
		double good = (height1 - 100) * 0.9;
		JOptionPane.showMessageDialog(null, "적정 몸무게는 " + good);
	}

}
