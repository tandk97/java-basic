package day03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 동등객체판단 {

	public static void main(String[] args) {
		Set<Member> mSet = new HashSet<Member>();
		mSet.add(new Member("홍1", 10));
		mSet.add(new Member("홍2", 20));
		mSet.add(new Member("홍3", 30));
		mSet.add(new Member("홍1", 10));
		mSet.add(new Member("홍1", 30));
		
		Iterator<Member> it = mSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	} // public static void main

} // class 동등객체판단

class Member{
	private String name;
	private int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "  " + age;
	}
	// 동등객체는 이름과 나이가 같으면 같은 사람
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name) && member.age == age;
		} else {
			return false;
		}
		
	}
	
	
}