package day01;

import java.util.Scanner;

public class BasicEx01 {

	public static void main(String[] args) {
		Scanner sc = null;
		int a, b, c;
		int max=-999999;
		int min = 99999999;
		int mid;
		System.out.println("�� ������ �ִ밪�� ���մϴ�");
	    sc = new Scanner(System.in);
		System.out.print("a�� ��" );
		a = sc.nextInt();
		System.out.print("b�� ��" );
		b = sc.nextInt();
		System.out.print("c�� ��" );
		c = sc.nextInt();
		
		if(max < a) max = a;
		if(max < b) max = b;
		if(max < c ) max = c;
		if(min > a) min = a;
		if(min > b) min = b;
		if(min > c ) min = c;
		System.out.println("�ִ밪�� " + max +"�Դϴ�");
		System.out.println("�ּҰ��� " + min + "�Դϴ�");
		
		if(a>=b) 
		  if(b>=c)
			   mid=b;
		  else if(a<=c)
			   mid = a;
		  else
			  mid = c;
		else if(a>c)
			mid = a;
		else if(b>c)
			mid = c;
		else 
			mid = b;
		System.out.println("�߾Ӱ��� " + mid + "�Դϴ�");
		
	}
}
