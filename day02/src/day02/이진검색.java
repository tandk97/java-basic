package day02;

public class 이진검색 {
	private static int 이진검색메서드(int[] a, int length, int key) {
		// 변수 선언
		int pl = 0;
		int pr = length - 1; // a[0] ..... a[9]
		do {
			int pm = (pl + pr) / 2; // (0+9)/2=4.5 -> 4
			if (a[pm] == key) {
				return pm;
			} else if (a[pm] > key) {
				pr = pm - 1;
			} else if (a[pm] < key) {
				pl = pm + 1;
			}
		} while (pl <= pr);
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 5, 7, 15, 28, 29, 31, 39, 58, 68, 70, 95 };
		int key = 39;

		int idx = 이진검색메서드(a, a.length, key);
		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다");
		} else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다");
		}

	}

}
