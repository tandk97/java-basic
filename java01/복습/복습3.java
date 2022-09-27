package 복습;

import javax.swing.JOptionPane;

public class 복습3 {

	public static void main(String[] args) {
		// 입력
		String com = JOptionPane.showInputDialog("통신사");
		String tel = JOptionPane.showInputDialog("전화번호");
		String name = JOptionPane.showInputDialog("이름");
		// 처리 , 결합연산자인 경우는 하나가 String이므로 String
		String total = "당신의 정보" + com + tel + name;
		System.out.println(total);

	}

}
