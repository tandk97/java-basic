package day01;

public class Q11 {

	public static void main(String[] args) {
		// 구구단 곱셈표 출력하기 - 이중반복문으로 하세요
		//첫줄과 두번째 줄은 단일 반복문으로 출력하고 세번째 줄부터 2중반복으로 하면 될 것같아요
		
		System.out.printf("%6s", "|");
		for(int i=1; i<10;i++) 
			System.out.printf("%3d", i);
		System.out.println();
		System.out.println("-----+------------------------");
		for( int i=1; i<10; i++) {
			System.out.printf("%3d", i);
			System.out.printf("%3s", "|");
			for( int j=1; j<10; j++) {
				System.out.printf("%3d", i+j);
			}
			System.out.println();
		}
		
		
		
		// 근의 공식을 가지고 해를 구하기
		double x1,x2, a=10.0, b=13.0, c=12.0;
		
		System.out.println(b*b - 4*a*c);
		x1 = -b + Math.sqrt(Math.abs(b*b - 4*a*c)) / 2*a;
		x2 = -b - Math.sqrt(Math.abs(b*b - 4*a*c)) / 2*a;
		
		System.out.println(x1);
		System.out.println(x2);
		
				
		
		
		
		

	}

}
