package 연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 신호등 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.black);
		f.setSize(800, 500);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton b1 = new JButton();
		b1.setText("빨강신호");
		b1.setFont(new Font("굴림", Font.BOLD, 50));
		b1.setBackground(Color.red);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton();
		b2.setText("노랑신호");
		b2.setFont(new Font("굴림", Font.BOLD, 50));
		b2.setBackground(Color.yellow);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton();
		b3.setText("초록신호");
		b3.setFont(new Font("굴림", Font.BOLD, 50));
		b3.setBackground(Color.blue);
		f.getContentPane().add(b3);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 라벨 하나 만들기
				JLabel img = new JLabel();
				// 이미지 아이콘을 하나 만든다.
				ImageIcon icon = new ImageIcon("red.png");
				// 라벨에 이미지를 낀다.
				img.setIcon(icon);
				// f에 라벨을 낀다.
				f.getContentPane().add(img);
				f.setVisible(true);
				
				
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 라벨 하나 만들기
				JLabel img = new JLabel();
				// 이미지 아이콘을 하나 만든다.
				ImageIcon icon = new ImageIcon("yellow.png");
				// 라벨에 이미지를 낀다.
				img.setIcon(icon);
				// f에 라벨을 낀다.
				f.getContentPane().add(img);
				f.setVisible(true);
				
				
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 라벨 하나 만들기
				JLabel img = new JLabel();
				// 이미지 아이콘을 하나 만든다.
				ImageIcon icon = new ImageIcon("green.png");
				// 라벨에 이미지를 낀다.
				img.setIcon(icon);
				// f에 라벨을 낀다.
				f.getContentPane().add(img);
				f.setVisible(true);
				
				
			}
		});
		f.setVisible(true);

	}

}
