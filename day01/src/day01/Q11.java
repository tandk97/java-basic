package day01;

public class Q11 {

	public static void main(String[] args) {
//		System.out.printf("%6s", "|");
//		for (int i = 1; i < 10; i++)
//			System.out.printf("%3d", i);
//		System.out.println();
//		System.out.println("-----+------------------------");
//		for (int i = 1; i < 10; i++) {
//			System.out.printf("%3d", i);
//			System.out.printf("%3s", "|");
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%3d", i * j);
//			}
//			System.out.println();
//		}

		// 근의 공식
		double x1, x2, a = 1.0, b = 5.0, c = -6.0;

		x1 = -(b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		x2 = -(b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

		System.out.println(x1);
		System.out.println(x2);

	}
}