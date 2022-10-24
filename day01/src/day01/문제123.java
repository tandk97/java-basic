package day01;

public class 문제123 {

	public static void main(String[] args) {
//		문1) 
//		1차원 배열에 데이터 입력하고 출력하기
//		100 200 300 400... 1000 넣어서 출력하기 
//
//		요구사항
//		배열을 인스턴스화한다
//		배열의 값을 반복문으로 넣어준다
//		배열의 값을 향상된for문으로 출력해 준다.
//
//		문2)
//		2차원 배열에 데이터 입력하고 출력하기
//		2행 3열 만들고 값은 
//		100 95 90 
//	    85 80 75를 넣어서
//		출력은 285는 0행의 합  240은 1행의 합
//	    100 95 90 285
//	    85 80 75 240
//
//
//		문3)
//		3차원 배열에 데이터 입력하고 출력하기
//		배열의 초기값 넣는 방식으로 배열을 만드세요
//		2면 3행 2열
//	   	a b c d e f g h i j k l  12개 알파벳을 넣어서
//	  	출력해 주세요

		// 문제 1
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i * 100 + 100;
			System.out.print(a[i] + ", ");

		}
		System.out.println();
		// 향상된 for문으로 출력하기
		for (int n : a) {
			System.out.print(n + " 이곳을 찍어보자 \t");
		}
		System.out.println();

		// 문제 2
		System.out.println("---------------------------");
		int[][] b = new int[2][3];
		int number = 100;
		int[] sum = new int[2];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = number;
				sum[i] += b[i][j];
				number -= 5;
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + "\t");

			}
			System.out.println(sum[i]);
			System.out.println();
		}

		// 향상된 for문으로 출력하기
		for (int[] bb : b) {
			for (int bbb : bb) {
				System.out.print(bbb + "\t");
			}
			System.out.println();
		}
		System.out.println();

		// 문제 3
		String[][][] c = { { { "a", "b" }, { "c", "d" }, { "e", "f" } }, { { "f", "g" }, { "h", "i" }, { "j", "k" } } };

		// for문 첨자문을 이용해서 찍기
		// 면의 갯수 찍기, 행의 갯수 찍기, 열의 갯수 찍기
		System.out.println("면의 갯수 " + c.length);
		System.out.println("행의 갯수 " + c[0].length);
		System.out.println("열의 갯수 " + c[0][0].length);

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int k = 0; k < c[i][j].length; k++) {
					System.out.print(c[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}

		// 향상된 for문으로 찍기
		for(String[][] cc : c) {
			for(String[] ccc : cc) {
				for(String cccc : ccc) {
					System.out.print(cccc + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
	}

}
