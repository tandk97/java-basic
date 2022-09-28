package 연습;

import java.util.Date;

public class Date를사용 {

	public static void main(String[] args) {
		// ppt253
		Date date = new Date();
		int 시간 = date.getHours(); // 시간
		int 날짜 = date.getDate(); // 날짜
		
		// ppt253 1번
		switch(시간) {
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
			System.out.println("굿모닝");
			break;
		case 12:
		case 13:
		case 14:
		case 15:
			System.out.println("굿 애프터눈");
			break;
		case 16:
		case 17:
		case 18:
		case 19:
			System.out.println("굿 이브닝");
			break;
		default : 
			System.out.println("굿나잇");
			break;
		}
		
		// ppt253 2번
		switch(날짜) {
		case 2:
			System.out.println("28일까지");
			break;
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일까지");
			break;
		default :
			System.out.println("30일까지");
			break;
		}
		

	}

}
