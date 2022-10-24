package day01;

import java.util.Scanner;

public class 가우스의덧셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 n 입력 >> ");
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i =0; i<=n; i++) {
			sum+=i;
		}
		System.out.println("1부터 " + n + "까지의 값은" + sum);

		double sum2 = 0;
		sum2 = (1+n)*(n/2.0);
		System.out.println("가우스 방법으로 1부터 " + n + "까지의 값은" + (int)sum2);

	}

}
