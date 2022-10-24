package day02;

import java.util.Scanner;

public class 보초예제 {
	static int 보초메서드(int[] a, int n, int key) {
		int i = 0;
		a[n] = key; // 찾을 값을 마지막 열에 넣어 준다.
		while (true) {
			if (a[i] == key)
				break;
			i++;
		}
		return i == n ? -1 : i;
	} // private static int 보초메서드

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요소수 : ");
		int num = sc.nextInt();
		int[] x = new int[num + 1]; // 1. 보초알고리즘은 제일 마지막에 키값을 넣어 주어야 하기 때문에 1열 더 크게 만든다

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
