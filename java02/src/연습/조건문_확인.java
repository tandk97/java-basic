package 연습;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 조건문_확인 {

	public static void main(String[] args) {
		// ppt 255.1 두 수를 입력받아서 누가 더 큰지 비교하기
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 1 입력");
		int a = sc.nextInt();
		System.out.println("숫자 2 입력");
		int b = sc.nextInt();
		// 더 큰지 작은지 판별
		if (a > b) {
			System.out.println("숫자 1이 더 큽니다");
		} else if (a == b) {
			System.out.println("두 숫자가 같습니다");
		} else {
			System.out.println("숫자 2가 더 큽니다");
		}

		// ppt 255.2 당신이 좋아하는 과목?
		System.out.println("당신이 좋아하는 과목은?");
		String 과목 = sc.next();
		switch (과목) {
		case "자바":
			System.out.println("JSP로 점프");
			break;
		case "파이썬":
			System.out.println("장고로 점프");
			break;
		default:
			System.out.println("무조건 열심히!!");
			break;
		}

	}
}
