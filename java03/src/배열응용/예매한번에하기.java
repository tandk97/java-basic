package 배열응용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class 예매한번에하기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(550, 800);

		// 레이아웃 부품 지정
		// 물처럼 흐르듯 왼쪽부터 하나씩 순서대로 붙여주는 배치 부품을 만들어서 f에 서렁
		FlowLayout flow = new FlowLayout(); // 순서대로 붙여줌
		f.setLayout(flow);
		JLabel top = new JLabel("---극장 예매 프로그램---");
		top.setBackground(new Color(255, 255, 0));
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);
		f.getContentPane().setBackground(Color.green);

		int[] seat = new int[180];

		for (int i = 0; i < 180; i++) {
			JButton b = new JButton((i + 1) + "");
			f.add(b);
			b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand(); // 버튼 위의 글자를 가져다 준다
					// JOptionPane.showMessageDialog(f, s + "번 예약완료");
					b.setEnabled(false);
					b.setBackground(Color.red);
					int index = Integer.parseInt(s);
					seat[index] = 1; // 예약완료
				}
			});
		}
		JButton a = new JButton("----예매하기----");
		a.setBackground(new Color(255, 255, 255));
		a.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(a, BorderLayout.SOUTH);
		a.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				for (int j : seat) {
					if (j == 1) {
						count++;
					}
				}
				// 한자리당 금액이 13000원, 결제금액을 출력해주세요
				int pay = 13000 * count;
				JOptionPane.showMessageDialog(f, "예약된 좌석은 " + count + "개");
				JOptionPane.showMessageDialog(f, "총 결제 금액은 " + pay + "원");
			}
		});
		f.setVisible(true);
	}
}
