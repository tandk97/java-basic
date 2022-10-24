package day02;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch121 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] x = { "boolean", "byte", "char", "double", "floatint", "long", "short" };
		System.out.println("찾고 싶은 글자는? ");
		String key = sc.next();

		int idx = Arrays.binarySearch(x, key);
		if (idx < 0) {
			System.out.println("그 값의 요소가 없습니다");
		} else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다");
		}
		

		double[] y = { 65.8, 37.0, 25.12 };
		System.out.println("찾고 싶은 실수는? ");
		double ky = sc.nextDouble();
		
		int idy = Arrays.binarySearch(y, ky);
		if (idy < 0) {
			System.out.println("그 값의 요소가 없습니다");
		} else {
			System.out.println("그 값은 y[" + idy + "]에 있습니다");
		}
		
		
		

	} // public static void main

} // class StringBinarySearch121
