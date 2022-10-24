package day01;

import java.util.Scanner;

public class BasicEx01 {

	public static void main(String[] args) {
		System.out.println("세 정수의 최대 값을 구합니다");
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값 ");
		int a = sc.nextInt();
		System.out.print("b의 값 ");
		int b = sc.nextInt();
		System.out.print("c의 값 ");
		int c = sc.nextInt();

		int max = 9999;
		if (max < a) {
			max = a;
		}
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		int min = -9999;
		if (min > a) {
			min = a;
		}
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		
		System.out.println("최댓값은 " + max + "입니다");
		System.out.println("최솟값은 " + min + "입니다");
		
		int mid = 0;
		if(a>=b)
			if(b>=c)
				mid=b;
			else if(a<=c)
				mid=a;
			else
				mid=c;
		else if(a>c)
			mid=a;
		else if(b>c)
			mid=c;
		else
			mid=b;
		System.out.println("중간값은 " + mid + "입니다");
		
		
		
	}

}
