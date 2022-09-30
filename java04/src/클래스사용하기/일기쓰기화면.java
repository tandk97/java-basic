package 클래스사용하기;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 일기쓰기화면 {
	// 멤버변수
	private static JTextField t1;
	private static JTextField t2;
	private static JTextArea t3;

	// 멤버메서드
	public void open() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 0));
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("오늘 날짜");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(32, 10, 163, 70);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("오늘 제목");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(32, 90, 163, 70);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("오늘 내용");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_2.setBounds(32, 170, 163, 96);
		f.getContentPane().add(lblNewLabel_2);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 28));
		t1.setBounds(207, 16, 290, 70);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 28));
		t2.setColumns(10);
		t2.setBounds(207, 96, 290, 70);
		f.getContentPane().add(t2);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea.setBounds(207, 196, 290, 263);
		f.getContentPane().add(textArea);

		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				try {
					FileWriter file = new FileWriter(s1 + ".txt");
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					file.close();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "파일 저장중 오류가 발생했습니다");
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton.setBounds(95, 533, 402, 96);
		f.getContentPane().add(btnNewButton);
		f.setSize(600, 700);
		f.setVisible(true);

	}
}
