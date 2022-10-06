package 연습;

import static 연습.직원정보.직원수;

public class 회사창업 {

	public static void main(String[] args) {
		직원정보 work1 = new 직원정보("홍길동", 25, "여");
		System.out.println(work1);
		System.out.println("직원 수 " + 직원수 + "명");
		직원정보 work2 = new 직원정보("김길동", 24, "남");
		System.out.println(work2);
		System.out.println("직원 수 " + 직원수 + "명");
		직원정보 work3 = new 직원정보("송길동", 26, "여");
		System.out.println(work3);
		System.out.println("직원 수 " + 직원수 + "명");
		
		System.out.println("직원 평균 나이 = " + work3.avg() + "살");

	}

}
