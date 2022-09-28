package 연습;

import javax.swing.JOptionPane;

public class 암호대기_점심메뉴 {

	public static void main(String[] args) {
		// 암호대기 ppt 247 1번
		String pwc = JOptionPane.showInputDialog("암호 입력");
		if(pwc.equals("pass")) {
			JOptionPane.showMessageDialog(null, "들어오세요");
		} else {
			JOptionPane.showMessageDialog(null, "나가세요");
		}
		
		// 점심 메뉴 ppt248 3번
		String 점심 = JOptionPane.showInputDialog("당신이 먹고 싶은 점심 메뉴는?(짜장면, 라면, 회");
		
		switch(점심) {
		case "짜장면" :
			JOptionPane.showMessageDialog(null, "중국집으로 가요");
			break;
		case "라면" :
			JOptionPane.showMessageDialog(null, "분식집으로 가요");
			break;
		case "회" :
			JOptionPane.showMessageDialog(null, "횟집으로 가요");
			break;
		default : 
			JOptionPane.showMessageDialog(null, "그냥 안먹어요");
			break;
		}

	}

}
