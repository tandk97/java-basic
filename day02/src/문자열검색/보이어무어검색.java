package 문자열검색;

public class 보이어무어검색 {

	public static void main(String[] args) {
		String txt = "ABABCDEFGHA";
		String pat = "ABC";

		int idx = bmMatch(txt, pat);
		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다");
		} else {
			System.out.println("그 값은 txt[" + idx + "]에 있습니다");
		}

	} // public static void main

	private static int bmMatch(String txt, String pat) {
		int pt; // txt 커서
		int pp; // pat 커서
		int txtlen = txt.length(); // 11
		int patlen = pat.length(); // 3
		int[] skip = new int[Character.MAX_VALUE + 1]; // 건너뛰기 표의 크기는 65535
		
		for (pt = 0; pt <= Character.MAX_VALUE; pt++) {
			skip[pt] = patlen;
		}
		for (pt = 0; pt < patlen - 1; pt++) {
			skip[pat.charAt(pt)] = patlen - pt - 1;
		}
//		// 건너뛰기 표의 내용 출력
//		for (pt = 0; pt <= Character.MAX_VALUE; pt++) {
//			System.out.println(skip[pt] + " ");
//		}
		while (pt < txtlen) {
			pp = patlen - 1;
			while (txt.charAt(pt) == pat.charAt(pp)) {
				if (pp == 0)
					return pt; // 성공
				pp--;
				pt--;
			} // while
			pt += (skip[txt.charAt(pt)] > patlen - pp) ? skip[txt.charAt(pt)] : patlen - pp;
		} // while
		return -1;

	} // private static int bmMatch
} // class 보이어무어검색
