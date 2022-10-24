package day05;

public class 퀵정렬 {

	public static void main(String[] args) {
		int[] x = { 5, 8, 4, 2, 6, 1, 3, 9, 7 };
		int nx = x.length;
		partition(x, x.length);
		quickSort(x, 0, nx - 1);
		System.out.println();
		System.out.println("퀵 정렬 했습니다");
		for (int a : x) {
			System.out.printf("%3d", a);
		}

	}

	private static void quickSort(int[] a, int left, int right) {
		// 퀵정렬
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];
		System.out.println();
		System.out.printf("a[%d]~a[%d] : { ", left, right);
		for (int i = left; i < right; i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.printf("%3d } ", a[right]);
		do {
			while (a[pl] < x) {
				pl++;
			}
			while (a[pr] > x) {
				pr--;
			}
			if (pl <= pr) {
				swap(a, pl++, pr--);
			}
		} while (pl <= pr);
		if (left < pr) {
			quickSort(a, left, pr);
		}
		if (pl < right) {
			quickSort(a, pl, right);
		}
	}

	private static void partition(int[] a, int n) {
		int pl = 0; // 왼쪽 시작 포인트는 인덱스 0으로
		int pr = n - 1; // 오른쪽 시작 포인트는 인덱스 n-1 8
		int x = a[n / 2];
		do {
			while (a[pl] < x) {
				pl++;
			}
			while (a[pr] > x) {
				pr--;
			}
			if (pl <= pr) {
				swap(a, pl++, pr--);
			}
		} while (pl <= pr);
		System.out.println("피벗값은 " + x + " 입니다");

		System.out.println("피벗값보다 작은 그룹(이하)");
		for (int i = 0; i <= pl - 1; i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
		System.out.println("피벗과 같은 그룹");
		if (pl > pr + 1) {
			System.out.println("피벗과 같은 그룹");
			for (int i = pr + 1; i < pl - 1; i++) {
				System.out.printf("%3d", a[i]);
			}
			System.out.println();
		}

		System.out.println("피벗값보다 큰 그룹(이상)");
		for (int i = pr + 1; i < n; i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
	}

	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
}
