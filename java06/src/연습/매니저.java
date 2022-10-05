package 연습;

public class 매니저 extends 직원{
	int bonus;
	
	public void 보너스() {
		System.out.println("보너스를 받습니다");
	}
	public String toString() {
		return "매니저 [name=" + name + ", 보너스=" + bonus + "]";
	}
	
}
