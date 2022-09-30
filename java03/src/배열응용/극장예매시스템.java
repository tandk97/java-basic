package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 극장예매시스템 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(550, 750);

		// 레이아웃 부품 지정
		// 물처럼 흐르듯 왼쪽부터 하나씩 순서대로 붙여주는 배치 부품을 만들어서 f에 서렁
		FlowLayout flow = new FlowLayout(); // 순서대로 붙여줌
		f.setLayout(flow);

//		JButton b1 = new JButton("좌석1");
//		JButton b2 = new JButton("좌석2");
//		JButton b3 = new JButton("좌석3");
//		
//		f.add(b1);
//		f.add(b2);
//		f.add(b3);
		int[] seat = new int[500];

		for (int i = 0; i < 500; i++) {
			JButton b = new JButton(i + "");
			f.add(b);
			b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand(); // 버튼 위의 글자를 가져다 준다
					JOptionPane.showMessageDialog(f, s + "번 예약완료");
					b.setEnabled(false);
					b.setBackground(Color.red);
					int index = Integer.parseInt(s);
					seat[index] = 1; // 예약완료

					int count = 0;
					for (int j : seat) {
						if (j == 1) { 
							count++;
						}
					}
					// 한자리당 금액이 13000원, 결제금액을 출력해주세요
					JOptionPane.showMessageDialog(f, "예약된 좌석은 " + count + "개");
					int pay = 13000*count;
					JOptionPane.showMessageDialog(f, "총 결제 금액은 " + pay + "원");
				}
			});
		}

		f.setVisible(true);
	}

}
