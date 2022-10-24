package day02;

import java.util.Scanner;

public class 연습문제113p_Q2 {

	private static int seqsearch(int[] a, int n, int key) {
		int i = 0; // 배열의 인덱스 증가 시키는 변수
		while (true) {
			if (i == n) {
				return -1; // 빈 배열인 것 처리
			} // if
			if (a[i] == key) {
				return i;
			} // if
			i++;
		} // while
	} // private static int seqsearch

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요소수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}

		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		int idx = seqsearch(x, num, ky);
		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다");
		} else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다");
		}

	} // public static void

} // class
