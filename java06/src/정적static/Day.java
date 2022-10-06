package 정적static;

public class Day {
	String doing;
	int time;
	static int 전체시간;
	String location;
	static int count; // 전역 변수는 자동 초기화 0

	// 객체 생성 시, 3개 데이터 반드시 넣어서 객체 생성할 것
	public Day(String doing, int time, String location) {
		count++;
		this.doing = doing;
		this.time = time;
		this.location = location;
		this.전체시간 = time + 전체시간; // 전체시간 = 전체시간 + time == 전체시간+=time
	}
	
	// 일반 메서드는 객체 생성 후, "주소로 접근"해서 호출해야 한다..
	// 일반 메서드는 객체 생성 후, 호출(사용)할 수 있다.
	public double getAvg() {
		return 전체시간 / (double)count;
	}

	// 객체 생성 후, 생성된 객체의 주소가 아니라. 그 주소가 가리키는 인스턴스 변수의 값들을 가지고 String을 만든다.

	@Override
	public String toString() {
		return "나의 하루 [하는 일=" + doing + ", 한 시간=" + time + ", 위치=" + location + "]";
	}

}
