package 생성자;

public class 통장 {
	// 멤버변수, class 아래에 선언(class 전체에서 사용 가능, 전역변수)
	// global variable
	String name; // 사람이름
	String ssn; // 주민번호
	int money;
	
	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

}
