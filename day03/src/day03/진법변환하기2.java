package day03;

public class 진법변환하기2 {

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("<< 진법 변환하는 프로그램 >>");
		// 10진수를 2진수로 바꾸기
		int n = 14;
		System.out.println("10진수 " + n + "를 2진수로 바꾸면 >> " + util.decToBin(n));
		// 2진수를 10진수로 바꾸기
		String bn = "1110";
		System.out.println("2진수 " + bn + "를 10진수로 바꾸면 >> " + util.binToDec(bn));
	}

}

// 진법 변환 클래스
class Util {
	public String decToBin(int value) {
		String result = ""; // 결과값 변수
		int mok, nmg; // 몫, 나머지
		mok = value; // ex) mok = 14
		while (mok != 0) {
			nmg = mok % 2; // nmg=0 숫자
			// 숫자 0을 문자로 만들기 String.valueOf(nmg);
			// 유니코드 표에 문자 0은 코드표로 숫자 48이다
			// 숫자(0) + 48을 하면 문자 0이 나옴
			result += (char) (nmg + '0');
			// ' ' - 문자 1글자 " " - 문자열 1글자 이상
			mok = mok / 2;
			System.out.println(result);
		}
		// 문자열로 된 결과를 반대로 뒤집기
		// String ---> char[]
		char[] r = result.toCharArray();
		for (int i = 0; i < r.length / 2; i++) {
			char temp = r[i];
			r[i] = r[r.length - i - 1];
			r[r.length - i - 1] = temp;
		}

		return String.valueOf(r);
	}

	public int binToDec(String value) {
		int result = 0;
		for (int i = 0; i < value.length(); i++) {
			result = result * 2 + value.charAt(i) - '0'; // '1' - '0' = 49-48=1
		}
		return result;

	}
}