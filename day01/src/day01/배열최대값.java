package day01;

import java.util.Random;

public class 배열최대값 {

	public static void main(String[] args) {
		double[] dArr = { 1.1, 3.3, 5.5, 2.3 };

		// 최댓값 5.5 나오게 하기
		double max = dArr[0];
		for (int i = 0; i < dArr.length; i++) {
			if (max < dArr[i]) {
				max = dArr[i];
			}
		}
		System.out.println(max);

		// 난수
		Random r = new Random();
		System.out.println(r.nextInt(7));
		
	} // public static void main

} // class 배열최대값
