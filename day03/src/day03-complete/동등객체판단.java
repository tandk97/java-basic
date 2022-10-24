package day03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ���ü�Ǵ� {

	public static void main(String[] args) {
	    Set mSet = new HashSet<Member>();
	    
        mSet.add(new Member("ȫ1", 10) );
        mSet.add(new Member("ȫ2", 20) );
        mSet.add(new Member("ȫ3", 30) );
        mSet.add(new Member("ȫ1", 10) );
        mSet.add(new Member("ȫ1", 30) );
        
        Iterator<Member> it =mSet.iterator(); 
        while(it.hasNext()) {
        	System.out.println( it.next() );
        }
	}

}
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
		// TODO Auto-generated method stub
		return name + "  " + age;
	}
	//���ü�� �̸��� ���̰� ������ ���� ���
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + age;
	}
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member) {
			  Member member = (Member) obj;
			  return member.name.equals(name) &&  member.age == age;
		}else {
			return false;
		}
	}
}
