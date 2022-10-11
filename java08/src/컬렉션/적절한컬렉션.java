package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class 적절한컬렉션 {

	public static void main(String[] args) {
		// 1. set형
		HashSet<String> team = new HashSet();
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		team.add("DB관리자");
		System.out.println(team);
		System.out.println(team.size());
		
		
		// 2. queue형
		LinkedList<String> list = new LinkedList();
		list.add("상한우유");
		list.add("싱싱우유");
		list.remove();
		System.out.println(list);
		
		// 3. list -> ArrayList
		ArrayList<String> ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		ski.remove(1);
		System.out.println(ski);
	}

}
