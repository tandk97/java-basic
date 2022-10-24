package day03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 동등객체판단2 {

	public static void main(String[] args) {
		Set<Person> mSet = new HashSet<Person>();
		mSet.add(new Person("010-XXXX-XXXX", "홍길동", 1));
		mSet.add(new Person("010-XXXX-XXXX", "홍길동2", 1));
		mSet.add(new Person("010-XXXX-XXXX", "홍길동3", 1));
		mSet.add(new Person("010-XXXX-XXXX", "홍길동", 2));
		mSet.add(new Person("010-XXXX-XXXX", "홍길동", 3));
		Iterator<Person> it = mSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		} // while
	} // public static void main

} // class 동등객체판단

class Person {
	private String tel;
	private String name;
	private int total;

	public Person(String tel, String name, int total) {
		super();
		this.tel = tel;
		this.name = name;
		this.total = total;
	} // public Person

	@Override
	public String toString() {
		return "Person [tel=" + tel + ", name=" + name + ", total=" + total + "]";
	} // public String toString

	@Override
	public int hashCode() {
		return tel.hashCode() + name.hashCode() + total;
	} // public int hashCode

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person person = (Person) obj;
			return person.tel.equals(tel) && person.name.equals(name);
		} else {
			return false;
		} // else
	} // public boolean equals

} // class Person