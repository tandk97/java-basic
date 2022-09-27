package 복습;

import javax.swing.JOptionPane;

public class 복습1 {

	public static void main(String[] args) {
		// 자바는 기본적으로 문법이 많은 편 (20가지)
		// CPU가 처리하고 데이터는 RAM에 넣어두고 가져와서 처리함
		// 자바는 부품조립식 언어(객체 지향 언어)
		// 어떤 부품으로 입력을 받을까?
		// 대문자로 바로 부품을 쓸 수 있음(***)
		// new 키워드를 통해서 부품을 만들어 쓸 수 있음
		String w = JOptionPane.showInputDialog("가로크기"); //100
		String h = JOptionPane.showInputDialog("세로크기"); //200
		// 모든 외부 입력은 String(문자열)
		// 처리
		// 면적 total = 가로 * 세로
		// 정수로 바꿔야겠다 해당 부품 찾기
		// Integer, Double
		int width = Integer.parseInt(w);
		int height = Integer.parseInt(h);
		// 출력
		// 부품은 System.Out JOptionPane
		// + 연산자 (결합, 산술)
		// 산술 : 숫자여야 함
		// 결합 : 더해지는 값들 중 하나라도 String이면 결합한다. 결과도 String
		int total = width * height;
		JOptionPane.showMessageDialog(null, "면적은 " + total);

	}

}
