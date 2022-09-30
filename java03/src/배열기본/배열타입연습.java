package 배열기본;

public class 배열타입연습 {

	public static void main(String[] args) {
		String[] tour = { "제주도", "부산", "일본", "싱가폴", "시애틀" };
		// for - each, 자동으로 인덱스를 하나씩 옮겨가면서 반복적으로 꺼내와서 임시변수에 넣어준다
		for (String s : tour) {
			System.out.print(s + " ");
		}
		System.out.println();
		// for
		for (int i = 0; i < tour.length; i++) {
			System.out.print(tour[i] + " ");
		}

		System.out.println();
		char[] color = { 'r', 'g', 'p', 'y', 'b' };
		for (char c : color) {
			System.out.print(c + " ");
		}
		System.out.println();
		for (int i = 0; i < color.length; i++) {
			System.out.print(color[i] + " ");
		}
		System.out.println();
		
		double[] height = {12.3, 23.4, 45.6, 56.7, 67.8};
		for (double d: height) {
			System.out.print(d + " ");
		}
		System.out.println();
		for (int i = 0; i<height.length; i++) {
			System.out.print(height[i] + " ");
		}

		
	}

}
