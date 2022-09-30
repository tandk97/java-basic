package 배열응용;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 200);
		
		String[] header = {"a", "b", "c"};
		String[][] contents = {
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"}
		};
		
		contents[0][0] = "999";
		contents[7][1] = "999";
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		//맨 끝에 넣어야 함.
		f.setVisible(true);
		
		//contents.length: 1차원 배열의 개수(11개)
		//이중for문, 중첩!
		for (int i = 0; i < contents.length; i++) { //행
			//1차원 배열하나당 필요한 for문 하나(가로줄 한줄)
			for (int j = 0; j < 3; j++) { //열
				System.out.print(contents[i][j] + " ");
			}
			System.out.println();
		}
	}
}
