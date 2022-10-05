package 연습;

// 동시에 실행되게 하는 클래스를 만든다.
// 메서드가 여러개 이쓴ㄴ데, run() override() 해준다.
public class 스레드3 extends Thread{
	@Override
	public void run() {
		// 동시에 처리되게 하고 싶은 내용을 적는다.
		for (int i = 0; i<1000; i++) {
			System.out.println(i + "번째 " + "&");
			
		}
	}
	

}
