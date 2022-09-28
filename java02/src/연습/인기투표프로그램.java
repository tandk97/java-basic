package 연습;

import java.util.Scanner;

public class 인기투표프로그램 {

	public static void main(String[] args) {
		// 투표대상
		int iu = 0;
		int you = 0;
		int bts = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("입력 1)아이유 2)유재석 3)방탄 4)종료>>");
			int choice = sc.nextInt();
			
			if (choice == 4) {
				System.out.println("종료합니다");
				System.out.println("아이유 득표수" + iu);
				System.out.println("유재석 득표수" + you);
				System.out.println("방탄 득표수" + bts);
				break;
			} else if (choice == 1) {
				iu++;
			} else if (choice == 2) {
				you++;
			} else if (choice == 3) {
				bts++;
			} else {
				System.out.println("없는 번호입니다");
			}
//			System.out.println("더 하실 건가요? 종료(x), 계속(o)");
//			String exit = sc.next();
//			char exit2 = exit.charAt(0);
//			if (exit2 == 'x') {// X이면 프로그램 종료, 아니면 계속
//				System.out.println("종료합니다");
//				System.out.println("아이유 득표수" + iu);
//				System.out.println("유재석 득표수" + you);
//				System.out.println("방탄 득표수" + bts);
//				System.exit(0);
//			}
		}
	}
}
