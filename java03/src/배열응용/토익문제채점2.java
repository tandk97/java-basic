package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class 토익문제채점2 {

	public static void main(String[] args) {
		// 1. 답안지, 대답안 공간만들기
		int[] 답안지 = new int[990];
		int[] 내답안 = new int[990];
		// 2. 랜덤 부품 만들기
		Random r = new Random();
		// 3. 990번 반복해서 답안지, 대답안에 1~4 숫자 넣기
		for (int i =0; i<내답안.length; i++) {
			답안지[i]=r.nextInt(4)+1;
			내답안[i]=r.nextInt(4)+1;
		}
		// 4. 같은 인덱스끼리 990번 비교하고 숫자가 같으면 점수 1늘리기
		for (int i =0; i<내답안.length; i++) {
			System.out.println((i + 1) + ":\t" + 답안지[i] + "\t" + 내답안[i]);
		}
		int score = 0;
		for (int i = 0; i < 내답안.length; i++) {
			if (내답안[i] == 답안지[i]) {
				score++; // score = score + 1 ==> 증감연산자
			}
		}
		// 5. 내 점수 프린트
		System.out.println(score);
		JOptionPane.showMessageDialog(null, score);
	}

}
