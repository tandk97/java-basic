package day01;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// 30page Q7 �ڵ� �����
    	   Scanner sc = new Scanner(System.in);
        
		  System.out.print("������ �Է��ϼ��� : ");
	        int n = sc.nextInt();
            int sum=0;
		for (int i = 0; i <=n; i++) {
			sum+=i;
		}
		System.out.println("1~" + n + "������ ���� " + sum);
		
		//���콺�� �̿��� ���� ���
		double sum2 = 0;
		sum2 = (1 + n) * (n/2.0);
		System.out.println("1~" + n + "������ ���� " + (int)sum2);
	}

}
