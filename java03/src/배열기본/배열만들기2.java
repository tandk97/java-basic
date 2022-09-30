package 배열기본;

public class 배열만들기2 {

	public static void main(String[] args) {
		// ppt 229
		int[] num = new int[5];
		// num <-- {0,0,0,0,0}, length
		
		// 값 대입, 위치값(index)를 이용
		
		num[0]=100;
		num[1]=100;
		
		// for-each : 하나씩 처음부터 뒤로가면서 꺼내오는 반복문
		for (int i = 0; i<num.length; i++) {
			System.out.println(num[1]);
		}
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		
	}

}
