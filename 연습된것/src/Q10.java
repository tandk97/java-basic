package day01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// 35page 
//		Scanner sc = new Scanner(System.in);
//        System.out.println("���� ������ �Է��ϼ���~~");
//        int n = sc.nextInt(); //�� 135
//        int ori_number = n;
//        int cnt=0; // ������ 10�� �ݺ��� Ƚ���� ���ϴ� ����
//        
//        while( n > 0) {
//        	// n = n / 10;
//        	n /= 10;
//        	cnt++;
//        }
//        System.out.println("�Է��� ���ڴ� " + ori_number);
//        System.out.println( cnt + "�ڸ��� ���� �����Դϴ�");
//		String s;
//		System.out.println("���� ������ �Է��� �ּ���.");
//		Scanner sc = new Scanner(System.in);
//		s = sc.next();
//		System.out.println("�Է��� ���ڴ� " + s + "�Դϴ�.");
//		System.out.println(s.length() + "�ڸ� ���� ���� �Դϴ�.");

		boolean x=false, y=true;
		if(x && y) {
			System.out.println("��");
		}else { 
			System.out.println("����"); }
		if( !(!x || !y) ) {
			System.out.println("��");
		}
		else {
			System.out.println("����"); }
		
	}

}
