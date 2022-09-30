package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class 토익문제채점 {

	public static void main(String[] args) {
		int[] 답안지 = new int[990];
		int[] 내답안 = new int[990];

		Random r = new Random(); // 랜덤 숫자 생성

		// 답안지에 1~4까지 랜덤하게 넣고, 프린트
		// 내답안에 1~4까지 랜덤하게 넣고, 프린트
		// 990번 반복시키기
		for (int i = 0; i < 내답안.length; i++) {
			// 0~3 + 1 ==> 1~4
			답안지[i] = r.nextInt(4) + 1;
			내답안[i] = r.nextInt(4) + 1;
		}
		// 990번 반복하기
		System.out.println("번호:\t답안\t내답");
		System.out.println("-----------------------");
		for (int i = 0; i < 내답안.length; i++) {
			System.out.println((i + 1) + ":\t" + 답안지[i] + "\t" + 내답안[i]);
		}
		// 채점
		int score = 0;
		for (int i = 0; i < 내답안.length; i++) {
			if (내답안[i] == 답안지[i]) {
				score++; // score = score + 1 ==> 증감연산자
			}
		}
		// 990번 반복 끝
		System.out.println(score);
	}

}
