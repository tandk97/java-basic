package day03;

import java.util.Iterator;
import java.util.TreeSet;

public class Comparator트리셋 {

	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComp());
		treeSet.add(new Fruit("포도", 10000));
		treeSet.add(new Fruit("딸기", 5000));
		treeSet.add(new Fruit("바나나", 12000));
		treeSet.add(new Fruit("복숭아", 20000));
		treeSet.add(new Fruit("포도", 15000));
		treeSet.add(new Fruit("사과", 12000));
		
		Iterator<Fruit> it = treeSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		} // while
	} // public static void main

} // public class Comparator트리셋
class Fruit{
	
}