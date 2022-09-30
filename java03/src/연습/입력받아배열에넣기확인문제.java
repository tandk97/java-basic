package 연습;

import javax.swing.JOptionPane;

public class 입력받아배열에넣기확인문제 {

	public static void main(String[] args) {
		// 1. 작년에 가고 싶었던 곳이랑 올해 가고 싶은 곳 입력받을 배열 만들기
		String[] 작년 = new String[3];
		String[] 올해 = new String[3];
		// 2. for문으로 세번 입력받기
		for(int i=0; i<작년.length; i++) {
			작년[i] = JOptionPane.showInputDialog("작년에 가고 싶었던 곳은? ");
		}
		for(int i=0; i<올해.length; i++) {
			올해[i] = JOptionPane.showInputDialog("올해에 가고 싶었던 곳은? ");
		}
		JOptionPane.showMessageDialog(null, 작년);
		JOptionPane.showMessageDialog(null, 올해);
		// 3. 우선 순위 따라 같은 장소 카운트하여 그 수 출력하기
		int count = 0;
		for(int i =0; 작년[i].equals(올해[i]); i++) {
			count++;
		}
		JOptionPane.showMessageDialog(null, "작년에도 올해도 가고 싶은 장소의 수는 " + count);
	}
}
