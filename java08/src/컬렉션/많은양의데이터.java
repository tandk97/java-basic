package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;

public class 많은양의데이터 {

	public static void main(String[] args) {
		// 데이터 타입도 다르고, 크기도 유동적
		// 순서가 중요
		ArrayList<String> list = new ArrayList();

		list.add("홍길동"); // 0
		list.add("홍길동"); // 1
		list.add("홍길동"); // 2
		list.add("100"); // 3
		list.add("11.1"); // 4

		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		
		
		
		
		// 중복을 제외하고 싶은 경우 set형 데이터 ==> HashSet
		HashSet set = new HashSet();
		for (int i = 0; i<list.size(); i++) {
			set.add(list.get(i));
		}
//		set.add(list.get(0));
//		set.add(list.get(1));
//		set.add(list.get(2));
//		set.add(list.get(3));
//		set.add(list.get(4));
		System.out.println(set);
	}

}
