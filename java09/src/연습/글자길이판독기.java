package 연습;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class 글자길이판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("글자/단어 길이 판독기");
		f.getContentPane().setBackground(new Color(192, 192, 192));
		f.setSize(600, 600);
		f.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Characters :");
		label1.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 30));
		label1.setBounds(76, 45, 418, 36);
		f.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Words :");
		label2.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 30));
		label2.setBounds(76, 91, 418, 36);
		f.getContentPane().add(label2);
		
		JButton b1 = new JButton("판독");
		b1.setFont(new Font("굴림", Font.BOLD, 30));
		b1.setBounds(45, 508, 122, 47);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("배경 색 변경");
		b2.setFont(new Font("굴림", Font.BOLD, 25));
		b2.setBounds(168, 508, 188, 47);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("글자 색 변경");
		b3.setFont(new Font("굴림", Font.BOLD, 25));
		b3.setBounds(357, 508, 188, 47);
		f.getContentPane().add(b3);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 20));
		textArea.setBackground(new Color(0, 0, 64));
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setBounds(45, 137, 500, 366);
		f.getContentPane().add(textArea);
		
		배경색변경 배경색변경 = new 배경색변경();
		b2.addActionListener(배경색변경);
		
		f.setVisible(true);

	}
}
