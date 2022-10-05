package 스레드;

public class 스레드사용 {

	public static void main(String[] args) {
		// 2. 스레드 객체 생성
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		// 3. 2번의 객체로 start() 메서드 호출
		t1.start();
		t2.start();
		
		// Thread1,2 main Thread를 이용하므로 총 3개의 스레드가 활성화
	}

}
