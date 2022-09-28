package 반복문;

public class For문연습3 {

	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			//1부터 1씩 증가하면서 10까지 처리
			System.out.print(i);
		}
		System.out.println();
		int sum = 0;
		for (int i = 1; i <= 10000; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		System.out.println("-------------------");
		int sum2 = 0;
		for (int i = 3; i <= 11; i++) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
	}

}
