package day03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorƮ���� {

	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>( new FruitComp() );
		treeSet.add(new Fruit("����", 10000));
		treeSet.add(new Fruit("����", 5000));
		treeSet.add(new Fruit("�ٳ���", 12000));
		treeSet.add(new Fruit("������", 20000));
		treeSet.add(new Fruit("����", 15000));
		treeSet.add(new Fruit("���", 12000));
		
		Iterator<Fruit> it=treeSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

class Fruit{
	String name;
	int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + price;
	}
	
}
//�񱳿� �ش��ϴ� �ڵ� ���� Ŭ���� 
class FruitComp implements Comparator<Fruit>{
  @Override
  	public int compare(Fruit o1, Fruit o2) {
  		if(o1.price < o2.price) return -1;
  		else if( o1.price == o2.price) return 0;
  		return 1;
  	}	
}



