package 연습;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		// 1.
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5]; // {0,0,0,0,0}

		for (int i = 0; i < 5; i++) {
			System.out.print("숫자입력>> ");
			num[i] = sc.nextInt(); // 외부입력은 모두 String이므로 Int로 바꿔줌
		}
		System.out.println(num[0] + num[2]);
		
		// 2.
		// Scanner sc
		String[] st = new String[3]; 

		for (int i = 0; i < 3; i++) {
			System.out.print("과목입력>> ");
			st[i]=sc.next();
		}
		System.out.println(st[0] + " 보다는 " + st[1]);
	}

}
