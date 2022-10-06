package 정적static;

public class 나의일지 {

	public static void main(String[] args) {
		// 변수는 선언된 위치를 포함한 괄호 안에서만 사용 가능
		// day1, day2, day3는 메서드 안에서만 쓸 수 있음
		// main 안에서만 쓸 수 있는 지역 변수(local variable)
		// 지역 변수 <---> 전역 변수
		// 지역 변수는 자동 초기화 X
		// 지역 변수는 프로그래머가 초기화 시켜야 한다.
		Day day1 = new Day("자바공부", 10, "강남역");
		System.out.println(day1); // 주소 대신 toString이 찍힘
		System.out.println(day1.count);
		System.out.println("전체 시간 " + day1.전체시간 + "시간");
		
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(day2);
		System.out.println(day2.count);
		System.out.println("전체 시간 " + day2.전체시간 + "시간");
		
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(day3);
		System.out.println(day3.count);
		System.out.println("전체 시간 " + day3.전체시간 + "시간");
		
		System.out.println("평균 시간 " + day3.getAvg() + " 시간");
	}

}
