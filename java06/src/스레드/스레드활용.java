package 스레드;

public class 스레드활용 {

	public static void main(String[] args) {
		시각스레드 시각 = new 시각스레드();
		이미지스레드 이미지 = new 이미지스레드();
		카운터스레드 카운터 = new 카운터스레드();
		
		시각.start();
		이미지.start();
		카운터.start();

	}

}
