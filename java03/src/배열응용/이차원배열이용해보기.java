package 배열응용;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원배열이용해보기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800, 500);
//		Random r = new Random();
//		String[] score = new String[4];
//		for (int i = 0; i<4; i++) {
//			score[i] = r.nextInt()
//		}
		String[] header = {"컴퓨터", "영어", "수학", "체육"};
		String[][] contents = {
				{"1","2","3"},
				{"1","2","3"},
				{"1","2","3"},

		};
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.setVisible(true);
		// 맨 끝에 넣어야 함
		for (int i = 0; i < contents.length; i++) { //행
			//1차원 배열하나당 필요한 for문 하나(가로줄 한줄)
			for (int j = 0; j < 3; j++) { //열
				System.out.print(contents[i][j] + " ");
			}
			System.out.println();
		}
	}

}
