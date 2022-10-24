package day02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 	객체은 Student클래스에서
// 	신장(키)를 검색하는 알고리즘을 하고 있습니다
// 	신장을 정렬해 주어야 2진검색을 할 수 있으니깐
// 	이것을 코드로 구현해 주는 것을 배우는 중입니다
//	1. Comparator를 구현하는 클래스를 만들어 준다
//	2. 구현 클래스에 compare()메소드를 재정의해준다
//  이곳에 신장에 대해서 '오름차순정렬하세요'라고 코드를 구현한다
//	3. 해당클래스를 상수화하여서
//	4. Arrays.binarySearch( , , 이곳에 ) 넣어 준다

public class 객체이진검색 {

	public static void main(String[] args) {
		// 1. Student 클래스를 객체화하여서 배열에 담아 둔다.
		Student[] sArr = { new Student("강민하", 162, 0.3), new Student("이수연", 172, 0.5), new Student("황지안", 156, 1.0),
				new Student("김찬우", 173, 1.2) };

		// 2. 검색해줄 키값을 입력 받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("찾고 싶은 키를 입력해 주세요");
		int key = sc.nextInt();
		// int idx = Arrays.binarySearch(sArr, key);
		// Error - 주소를 찾는게 아니라 객체의 필드인 키를 찾아야 함
		int idx = Arrays.binarySearch(sArr, new Student("", key, 0.0), Student.HEIGHT_ORDER);
		System.out.println(idx);
		if (idx < 0) {
			System.out.println(key + "찾는 키를 가진 사람이 없습니다");
		} else {
			System.out.println("그 값은 " + idx + "에 있습니다");
			System.out.println("찾는 데이터는 " + sArr[idx] + "입니다");
		}
	} // public static void main

} // class 객체이진검색

class Student {
	String name;
	int height;
	double vision;

	public Student(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", height=" + height + ", vision=" + vision + "]";
	}

	// 상수처리
	public static final Comparator<Student> HEIGHT_ORDER = new HeightComparator();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getVision() {
		return vision;
	}

	public void setVision(double vision) {
		this.vision = vision;
	}
} // class student

class HeightComparator implements Comparator<Student> {
	// o1은 이미 들어간 자료, o2는 새로 들어올 자료
	@Override
	public int compare(Student o1, Student o2) {
		System.out.println("이곳은 키를 정렬하기 위한 기준을 셋팅하는 부분임");
		return (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0;
		// return (o1.height - o2.height);
	}

} // class HeightComparator implements Comparator<Student>