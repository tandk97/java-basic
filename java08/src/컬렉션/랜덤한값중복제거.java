package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 랜덤한값중복제거 {

	public static void main(String[] args) {
		// 로또번호 생성
		Random r = new Random();
		HashSet lotto = new HashSet();
		while (lotto.size()<6) {
			lotto.add(r.nextInt(45)+1); // (0 ~ 44) +1
		}
		System.out.println(lotto);
	}

}
