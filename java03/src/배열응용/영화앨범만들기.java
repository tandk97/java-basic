package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범만들기 {
	// 전체영역에서 특정한 변수를 사용하려면 클래스 아래에 선언해야 한다
	static int start = 2; // 전역변수

	public static void main(String[] args) {
		// 영화제목
		String[] title = { "다만", "오케이", "짱구", "테넷", "해적" };
		// 포스터파일
		String[] img = { "다만.png", "오케이.png", "짱구.png", "테넷.png", "해적.png" };

		// 평점
		double[] score = { 8.45, 8.87, 7.28, 6.59, 7.92 };

		JFrame f = new JFrame();
		f.setSize(415, 425);

		JLabel top = new JLabel("짱구");
		top.setBackground(new Color(255, 255, 0));
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);

		JLabel center = new JLabel("");
		center.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.getContentPane().add(center, BorderLayout.CENTER);

		JLabel under = new JLabel("7.28");
		under.setBackground(new Color(255, 255, 0));
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(under, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// << 버튼을 클릭했을 때 처리하고 싶은 내용이 있으면
				// actionPerformed 함수에 넣으면 된다
				// 제목이 표시된 라벨에 제목을 변경해야한다
				start = start - 1; // 1 = 2-1
				top.setText(title[start]); // title[1]
				under.setText(score[start] + "점"); // score[1]
				ImageIcon icon = new ImageIcon(img[start]);
				center.setIcon(icon);
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start++; // start = start + 1
				top.setText(title[start]); // title[1]
				under.setText(score[start] + "점"); // score[1]
				ImageIcon icon = new ImageIcon(img[start]);
				center.setIcon(icon);
			}
		});
		btnNewButton_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);

	}

}
