package day01;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// 1부터 n까지 더하는 프로그램
		// n을 입력받기
		// 1부터 n까지 덧셈
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 n 입력 >> ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i =0; i<=n; i++) {
			sum+=i;
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum);
	}

}
