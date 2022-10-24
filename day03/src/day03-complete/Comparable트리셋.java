package day03;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableƮ���� {

	public static void main(String[] args) {
//		 TreeSet�� PersonŬ������ �޾� �� ���Դϴ�
//	     ���� ������ ���̼����� �� ���Դϴ�.
		
		TreeSet<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person("a", 10));
		treeSet.add(new Person("b", 12));
		treeSet.add(new Person("c", 13));
		treeSet.add(new Person("d", 14));
		treeSet.add(new Person("e", 15));
		treeSet.add(new Person("k", 13));
		treeSet.add(new Person("c", 16));
		
		Iterator<Person> it = treeSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

class Person  implements Comparable<Person>{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + age;
	}
	//���̼� ������������ ���ı��� 
//    @Override
//     	public int compareTo(Person o) {
//     		if( age < o.age) return -1;
//     		else if( age == o.age) return 0;
//     		else return 1;
//     	} 
	//���̼� ������������ ���ı��� 
	  @Override
   	public int compareTo(Person o) {
   		if( age < o.age) return 1;
   		else if( age == o.age) return 0;
   		else return -1;
   	} 	
}





