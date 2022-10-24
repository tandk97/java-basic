package day03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 해시맵2 {

	public static void main(String[] args) {
		// Map
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 객체 삽입하기
		map.put("3334", 1111);
		map.put("2224", 1112);
		map.put("1114", 1113);
		map.put("1234", 1000);

		System.out.println("전화번호 뒷자리와 회원번호");
		// 모든 값을 다 출력하기
		// 1단계 key만 모으기
		Set keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(" 전화번호 뒷자리 " + key + " : 회원번호 " + map.get(key));
		}

	} // public static void main

} // class 해시맵