package 연습;

import java.util.Scanner;

public class 숫자입력 {

	public static void main(String[] args) {
		// 숫자 입력
		Scanner sc = new Scanner(System.in);
		int fcount = 0;
		int scount = 0;
		

		while (true) {
			System.out.println("숫자입력1>>");
			int a = sc.nextInt(); // sc.nextInt();
			System.out.println("숫자입력2>>");
			int b = sc.nextInt();
			// 더 큰지 작은지 판별
			if (a > b) {
				fcount = fcount + 1;
				System.out.println("앞 숫자가 더 큽니다");
			} else if (a == b) {
				System.out.println("두 숫자가 같습니다");
			} else {
				scount = scount + 1;
				System.out.println("뒷 숫자가 더 큽니다");
			}
			// 반복할 때 종료할지 말지 물어보기XO
			System.out.println("더 하시겠습니까? 종료(x), 계속(o)>>");
			String exit = sc.next();
			char exit2 = exit.charAt(0); // 첫 번째 문자 1개를 가지고 오세요.
			if (exit2 == 'x') {// X이면 프로그램 종료, 아니면 계속
				System.out.println("게임을 종료합니다.!!");
				System.out.println("앞 숫자가 더 큰 횟수 " + fcount);
				System.out.println("뒷 숫자가 더 큰 횟수 " + scount);
				System.exit(0); // 숫자입력 종료
			}

		}
		
		
		

	}

}
