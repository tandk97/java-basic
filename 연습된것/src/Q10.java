package day01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// 35page 
//		Scanner sc = new Scanner(System.in);
//        System.out.println("양의 정수를 입력하세요~~");
//        int n = sc.nextInt(); //예 135
//        int ori_number = n;
//        int cnt=0; // 나누기 10을 반복한 횟수를 구하는 변수
//        
//        while( n > 0) {
//        	// n = n / 10;
//        	n /= 10;
//        	cnt++;
//        }
//        System.out.println("입력한 숫자는 " + ori_number);
//        System.out.println( cnt + "자리의 양의 정수입니다");
//		String s;
//		System.out.println("양의 정수를 입력해 주세요.");
//		Scanner sc = new Scanner(System.in);
//		s = sc.next();
//		System.out.println("입력한 숫자는 " + s + "입니다.");
//		System.out.println(s.length() + "자리 양의 정수 입니다.");

		boolean x=false, y=true;
		if(x && y) {
			System.out.println("참");
		}else { 
			System.out.println("거짓"); }
		if( !(!x || !y) ) {
			System.out.println("참");
		}
		else {
			System.out.println("거짓"); }
		
	}

}
