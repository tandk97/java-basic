package 추상클래스인터페이스;

public class 액션처리클래스 implements MyAction{

	@Override
	public void click() {
		System.out.println("나는 처리... 구현");
	}

	@Override
	public void dblick() {
		System.out.println("나는 처리... 구현");
	}
	
}
