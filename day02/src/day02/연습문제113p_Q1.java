package day02;

import java.util.Scanner;

public class 연습문제113p_Q1 {
	static int 보초메서드(int[] a, int n, int key) {
		a[n] = key;
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				return i;
				// i를 증가시키면서 찾다가 같으면
				// i를 인덱스로 반환하라
			}
		}
		return -1;
		// 못 찾으면 인덱스를 -1로 반환하여 검색 실패를 알려주기
	} // private static int 보초메서드

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요소수 : ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}

		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		int idx = 보초메서드(x, num, ky);
		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다");
		} else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다");
		}

	} // public static void main

} // class
