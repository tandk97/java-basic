package 연습;

public class 전화번호 {

	public static void main(String[] args) {
		// 전화번호 입력 ppt 124 3,4,5
		String p = "011-245-1234";
		// 3)
		if(p.substring(0,3).equals("011")) {
			System.out.println("SK");
		} else if(p.substring(0,3).equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("APPLE");
		}
		
		// 4) 초기 제출
		if(p.substring(4, 7).length() >=4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		// 5)
		if(p.length() >=10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
		System.out.println(p);; // 스트링 출력
		
		// -----------------------------------------
		String s2 = "감자, 고구마, 양파";
		String[] s3 = s2.split(","); // {"감자", "고구마", "양파"}
		// , 기준으로 해서 String 배열을 만들어 준다.
		System.out.println(s3[0]);
		
		// 4) 나중 제출
		String[] s4 = p.split("-"); // {"011", "245", "1234"}
		if (s4[1].length() >=4) { // "245"
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}


	}

}
