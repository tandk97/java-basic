package 연습;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();

		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add("남");

		System.out.println(me.size());
		// me 안에 보면 toString이 오버라이드 되어 있음
		// toString 재정의
		System.out.println(me);
		System.out.println("내 돈은 " + ((int) me.get(0) + 2000) + "원");
		System.out.println("내 키는 " + (double) me.get(1) + 10);
		if ((boolean) me.get(2).equals(true)) {
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		if ((String) me.get(3) == "남") {
			System.out.println("주민 번호는 1, 3 이에요");
		} else {
			System.out.println("주민 번호는 2, 4 이에요");
		}

		// 형변환, 오토박싱, 오토언박싱 순서 작성

	}

}
