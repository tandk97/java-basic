package 연습;

public class 직원정보 {
	String name;
	int age;
	String gen;
	static int 직원수;
	static int 직원전체나이;

	public 직원정보(String name, int age, String gen) {
		직원수++;
		this.name = name;
		this.age = age;
		this.gen = gen;
		직원전체나이 = 직원전체나이 + age;
	}

	public double avg() {
		return 직원전체나이 / (double) 직원수;
	}

	@Override
	public String toString() {
		return "[직원 이름 = " + name + ", 나이 = " + age + ", 성별 = " + gen + "]";
	}
}
