package 크롤링;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의주식크롤링 {
	private static JTextField textField;
	static JTextArea textArea;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(192, 192, 192));
		f.getContentPane().setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 30));
		textArea.setBounds(50, 550, 500, 350);
		f.getContentPane().add(textArea);

		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.BOLD, 40));
		textField.setBackground(new Color(0, 255, 255));
		textField.setBounds(80, 370, 420, 80);
		f.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("CODE :");
		lblNewLabel.setFont(new Font("궁서", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(80, 280, 420, 80);
		f.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("삼성전자");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code를 주면서, 크롤링해달라고 하자.
				// 크롤링연습6의 naver(code)호출!!
				주식크롤링 크롤링 = new 주식크롤링();
				String result = 크롤링.naver("005930");
				textArea.setText(result);

			}
		});
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		btnNewButton.setBounds(80, 10, 420, 80);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("대한항공");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				주식크롤링 크롤링 = new 주식크롤링();
				String result = 크롤링.naver("003490");
				textArea.setText(result);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 128, 64));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 50));
		btnNewButton_1.setBounds(80, 100, 420, 80);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("두산에너빌리티");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				주식크롤링 크롤링 = new 주식크롤링();
				String result = 크롤링.naver("034020");
				textArea.setText(result);
			}
		});
		btnNewButton_2.setBackground(new Color(0, 255, 0));
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 50));
		btnNewButton_2.setBounds(80, 190, 420, 80);
		f.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("크롤링 시작");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code = textField.getText();
				주식크롤링 크롤링 = new 주식크롤링();
				String result = 크롤링.naver(code);
				textArea.setText(result);
			}
		});
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton_3.setBounds(137, 460, 308, 80);
		f.getContentPane().add(btnNewButton_3);

		f.setTitle("나의 주식 크롤링");
		f.setSize(600, 950);
		f.setVisible(true);

	}
}
