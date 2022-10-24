package day03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 해시맵 {

	public static void main(String[] args) {
		// Map
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 객체 삽입하기
		map.put("a", 100);
		map.put("b", 200);
		map.put("c", 300);
		map.put("d", 100);
		map.put("d", 300); // 중복시 원래 있던 값이 없어지고 새로운 값이 들어간다

		// 객체 검색하기
		System.out.println("내용 d 키값 " + map.get("d"));
		System.out.println("내용 f 키값 " + map.get("f"));

		// 모든 값을 다 출력하기
		// 1단계 key만 모으기
		Set keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + "~");
			System.out.println(map.get(key) + "~");
		}

	} // public static void main

} // class 해시맵