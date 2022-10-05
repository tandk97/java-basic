package 생성자;

public class Mask {
	// 멤버 변수(역할), 전역 변수(범위)
	String color; // ""
	int price; // 0
	int count; // 0
	// 멤버 변수는 전역 변수, 전역 변수는 자동 초기화가 된다.
	// 멤버 변수의 원본은 클래스 원본 영역에 저장
	// 멤버 변수는 객체 생성될 때, 힙 영역에 복사가 된다.

	// 객체 생성 후, 멤버 변수 값을 나중에 넣어도 상관없는 경우
	// 생성자를 만들어주지 않아도 된다.

	// 생성자가 하나도 없는 경우, 자동으로 입력 값이 없는 생성자를 만들어준다.
	// 묵시적으로 생성자가 만들어진다.
	// 기본 생성자(default constructor)
//	public Mask() {
//		//
//	}

	// 객체 생성시, 멤버 변수 값을 바로 넣는 경우
	// 넣을 데이터를 parameter로 해서 생성자를 반드시 만들어준다.
	public Mask(String color, int price, int count) {
		this.color = color;
		this.price = price;
		this.count = count;
	}


	// 계좌처럼 parameter 없이 객체 생성하고 싶고,
	// parameter가 있는 객체를 생성하고 싶은 경우
	// 기본 생성자를 명시적으로 써주어야 한다.
	
		@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
	
}
