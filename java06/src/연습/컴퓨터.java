package 연습;

public class 컴퓨터 {
	int price;
	String com;
	double size;

	public 컴퓨터(int price, String com, double size) {
		this.price = price;
		this.com = com;
		this.size = size;
	}

	public void 컴퓨터정보() {
		System.out.println("이 컴퓨터의 가격은 " + price + "달러" + " 제조 회사는 " + com + " 모니터의 크기는 " + size + "인치");
	}



		
}
