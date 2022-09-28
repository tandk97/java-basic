package 조건문;

public class ifelse테스트2 {

	public static void main(String[] args) {
		int 점수 = 88;
		// ctrl + shift + f : 코드정리
		// 변수 선언할 때, 변수가 생성!!
		// result안에는 쓰레기값이 들어있다.
		// 연산자도 안되고, 출력도 X
		String result = "";
		// 변수를 선언할 때는 초기값을 넣어주세요

		if (점수 >= 90) {
			result = "A학점";
		} else if (점수 >= 85 && 점수 < 90) {
			result = "B+학점";
		} else if (점수 >= 80 && 점수 < 85) {
			result = "B-학점";
		} else if (점수 >= 70) {
			result = "C학점";
		} else {
			result = "D학점";
		}

		System.out.println("당신의 학점은 " + result);

	}

}
