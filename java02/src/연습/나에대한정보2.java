package 연습;

import java.util.Scanner;

public class 나에대한정보2 {

	public static void main(String[] args) {
		// Scanner 쓰기
		Scanner sc = new Scanner(System.in);

		// Scanner가 입력받을 정보
		System.out.print("나의 이름은? ");
		String name = sc.next(); // 입력 받음 String
		System.out.print("나의 키는? ");
		Double 키 = sc.nextDouble(); // 입력 받음 Double
		System.out.print("나의 몸무게는? ");
		Double 몸무게 = sc.nextDouble(); // 입력 받음 Double
		System.out.print("나는 저녁을 먹었나요? ");
		Boolean 저녁 = sc.nextBoolean(); // 입력 받음 Boolean
		sc.nextLine();
		System.out.print("나의 좌우명은? ");
		String 좌우명 = sc.nextLine(); // 입력 받음 String
		
		System.out.println("==========================");
		System.out.println("내 이름은 " + name + "입니다.");
		System.out.println("내 내년 키는 " + (키 + 11) + "입니다.");
		System.out.println("내 내년 몸무게는 " + (몸무게 - 10) + "입니다.");
		System.out.println("나는 저녁을 " + 저녁 + "입니다.");
		System.out.println("나의 좌우명은 " + 좌우명 + "입니다.");

	}

}
