package 연습;

import java.util.Scanner;

public class 나에대한정보1 {

	public static void main(String[] args) {
		// Scanner 쓰기
		Scanner sc = new Scanner(System.in);
		
		// Scanner가 입력받을 정보
		System.out.println("나에 대한 정보");
		System.out.println("==========================");
		
		System.out.print("이름을 입력 : ");
		String name = sc.next(); // 입력 받음 String
		System.out.print("나이를 입력 : ");
		String age = sc.next(); // 입력 받음 String
		System.out.print("취미를 입력 : ");
		String hob = sc.next(); // 입력 받음 String
		
		System.out.println("---------------------------");
		
		System.out.println("나의 이름은 " + name + "입니다.");
		System.out.println("나의 나이는 " + age + "입니다.");
		System.out.println("나의 취미는 " + hob + "입니다.");
		

		

		

		
		
		



	}

}
