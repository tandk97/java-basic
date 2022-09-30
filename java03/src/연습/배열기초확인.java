package 연습;

public class 배열기초확인 {

	public static void main(String[] args) {
		// 1.
		int[] s = new int[5];
		// 2.
		System.out.println(s.length);
		// 3.
		s[0]=100;
		System.out.println(s[0]);
		// 4.
		s[4]=500;
		System.out.println(s[4]);
		// 5.
		s[2]=200;
		System.out.println(s[2]);
		// 6.
		for (int i = 0; i<s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		// 7.
		for (int i = 0; i<s.length; i++) {
			System.out.print(i + ": " + s[i] + " ");
		}
	}

}
