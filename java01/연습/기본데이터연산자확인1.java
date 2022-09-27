package 연습;

public class 기본데이터연산자확인1 {

	public static void main(String[] args) {
		// 설정한 pw/ 입력한 암호pw1
		String pw = "p";
		String pw1 = "q";

		// pw 확인
		if (pw.equals(pw1)) {
			System.out.println("PASS");
		} else {
			System.out.println("재입력");
		}

	}

}
