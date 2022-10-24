package day03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 해시셋 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("AA");
		set.add("BB");
		set.add("CC");
		set.add("BB");
		set.add("AA");
		set.add("DD");
		//Arrays.asList("11", "22", "33");
		System.out.println(set.size());
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}
	} // public static void main

} // class 해시셋
