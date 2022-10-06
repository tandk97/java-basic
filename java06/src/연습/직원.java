package 연습;

public class 직원 extends Object{
	String name;
	String address;
	int salary;
	int rrn;
	
	public void 일하다() {
		System.out.println("일을 합니다");
	}
	public void 월급받다() {
		System.out.println("월급을 받습니다");
	}
	public void 주소() {
		System.out.println("이메일 주소가 있습니다");
	}
	@Override
	public String toString() {
		return "직원 [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	public 직원() {
		super();
	}
	
	}
