package day01;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// 30page Q7 코드 만들기
    	   Scanner sc = new Scanner(System.in);
        
		  System.out.print("정수를 입력하세요 : ");
	        int n = sc.nextInt();
            int sum=0;
		for (int i = 0; i <=n; i++) {
			sum+=i;
		}
		System.out.println("1~" + n + "까지의 합은 " + sum);
		
		//가우스를 이용한 덧셈 방법
		double sum2 = 0;
		sum2 = (1 + n) * (n/2.0);
		System.out.println("1~" + n + "까지의 합은 " + (int)sum2);
	}

}
