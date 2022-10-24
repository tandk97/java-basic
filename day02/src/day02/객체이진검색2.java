package day02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 객체이진검색2 {

	public static void main(String[] args) {
		Person[] pArr = { new Person(10, "홍"), new Person(20, "김"), new Person(27, "최"), new Person(25, "홍")};
		Scanner sc = new Scanner(System.in);
		System.out.println("찾고 싶은 나이를 입력해 주세요");
		int key = sc.nextInt();
		int idx = Arrays.binarySearch(pArr, new Person(key, null), Person.AGE_ORDER);
		System.out.println(idx);
		if (idx < 0) {
			System.out.println(key + "찾는 나이를 가진 사람이 없습니다");
		} else {
			System.out.println("그 값은 " + idx + "에 있습니다");
			System.out.println("찾는 데이터는 " + pArr[idx] + "입니다");
		}
	} // public static void main

} // class 객체이진검색

class Person {
	int age;
	String name;

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	// 상수처리
	public static final Comparator<Person> AGE_ORDER = new AGEComparator();
} // class Person

class AGEComparator implements Comparator<Person> {
	// 나이를 정렬의 기준으로 삼는 코드 구현
	@Override
	public int compare(Person o1, Person o2) {
		System.out.println("이곳은 키를 정렬하기 위한 기준을 셋팅하는 부분임");
		return (o1.age > o2.age) ? 1 : (o1.age < o2.age) ? -1 : 0;
		// return (o1.height - o2.height);
	}

} // class AGEComparator implements Comparator<Student>