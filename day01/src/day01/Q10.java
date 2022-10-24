package day01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("정수 n 입력 >> ");
			n = sc.nextInt();
			if (n <= 0) {
				System.out.println("n이 0보다 작거나 같아요. 양의 정수를 써주세요");
			}
		} while (n <= 0);

		int t = n;

		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
			System.out.println(n);
		}
		System.out.println("입력한 숫자는 " + t);
		System.out.println(count + "자리 양의 정수 입니다");

		boolean x = false, y = true;
		if (x && y) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		if (!(!x || !y)) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
	}
}
