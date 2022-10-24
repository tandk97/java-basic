package day03;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 해시맵동등비교 {

	public static void main(String[] args) {
		// Map
		Map<Student, Integer> map = new Hashtable<Student, Integer>();

		// 객체 삽입하기
		map.put(new Student(11, "홍길동"), 95);
		map.put(new Student(22, "이순신"), 100);
		map.put(new Student(33, "홍길동"), 90);
		map.put(new Student(44, "최길동"), 95);
		map.put(new Student(22, "이순신"), 80);
		map.put(new Student(22, "이순신"), 70);
		
		Set<Student> Set = map.keySet();
		Iterator<Student> it = Set.iterator();
		while (it.hasNext()) {
			Student key = it.next();
			System.out.println(key + " - " + map.get(key));
		} // while

	} // public static void main

} // class 해시맵동등비교

class Student {
	int sno;
	String name;

	public Student(int sno, String name) {
		this.sno = sno; // 학번
		this.name = name; // 이름
	} // public Student

	@Override
	public String toString() {
		return "Student [학번=" + sno + ", 이름=" + name + "]";
	}

	@Override
	public int hashCode() {
		return name.hashCode() + sno;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return name.equals(s.name) && sno == s.sno;
		} else {
			return false;
		}
	}

} // class Student