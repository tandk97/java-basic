package 형변환;

public class 형변환연습 {

	public static void main(String[] args) {
		int a = 100; // 4개(대)
		byte b = 50; // 1개(작)
		a = b; // int <-- byte
		// 타입변환(형변환)
		// 큰공간 <-- 작은공간데이터(자동형변환)
		
		int c = 200; // 4대(대)
		b = (byte) c;
		// 작은 공간 <-- 큰공간데이터(강제형변환)
		// (작은공간이름) 변수;
		// 조심할 것은 작은공간에 들어갈 수 있는 범위이어야 한다.
		// byte -128~127
		System.out.println(b);

	}

}
