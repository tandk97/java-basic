package 연습;

public class 기본데이터연산자확인문제 {

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
		// 어제와 오늘의 몸무게 차이
		double a = 2.2;
		if(a>2) {
			System.out.println("다이어트 성공");
		}
		// 설정한 pw/ 입력한 암호pw1
		String pw2 = "p";
		String pw3 = "p";
		// 어제와 오늘의 몸무게 차이
		double a1 = 2.2;
		// pw 확인, 몸무게 변화 2보다 큰지 확인
		if (pw2.equals(pw3) && a1>2) {
			System.out.println("오늘은 성공!");
		} else {
			System.out.println("내일 다시 도전!");
		}
		// 성적 입력
		double 체육 = 66;
		double 수학 = 77;
		double 영어 = 88;
		double 국어 = 99;
		double 평균 = (체육 + 수학 + 영어 + 국어) / 4;
		System.out.println(평균);
		// 원의 반지름과 PI 입력
		double r = 2.2;
		double PI = 3.14;
		// 원의 면적 구하기
		double A = PI*r*r;
		System.out.println(A);

		

	}

}
