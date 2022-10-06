package 연습;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 c1 = new 컴퓨터(499, "애플", 33.2);
		컴퓨터 c2 = new 컴퓨터(599, "HP", 15.8);
		System.out.println(c1);
		c1.컴퓨터정보();
		c2.컴퓨터정보();

	}


}
