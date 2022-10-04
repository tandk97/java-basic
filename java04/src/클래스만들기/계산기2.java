package 클래스만들기;

public class 계산기2 {
	public int add(int x, int y) { // add(100, 200)
		return x + y;
	}

	public double add(int x, double y) { // add(100, 22.2)
		return x + y; // 100 + 22.2
	}

	public double add(double x, double y) { // add(11.1, 22.2)
		return x + y;
	}

	public String add(String x, int y) { // add("나의 나이는", 100)
		return x + y;
	}

	public int[] add() {
		int[] num = { 1, 2, 3 };
		return num;
	}

	public double multi(double x, double y) {
		return x * y;
	}

	public double div(double x, double y) {
		return x / y;
	}
}
