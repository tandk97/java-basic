package 연습;

public class 기본데이터연산자확인3 {

	public static void main(String[] args) {
		// 설정한 pw/ 입력한 암호pw1
		String pw = "p";
		String pw1 = "p";
		// 어제와 오늘의 몸무게 차이
		double a = 2.2;
		// pw 확인, 몸무게 변화 2보다 큰지 확인
		if (pw.equals(pw1) && a>2) {
			System.out.println("오늘은 성공");
		} else {
			System.out.println("내일 다시 도전");
		}
	}
}
