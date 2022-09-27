package 윈도우;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class 계산기 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(700, 700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\바탕 화면\\java-workspace\\javabasic\\src\\윈도우\\calculator-385506__480.jpg"));
		lblNewLabel.setBounds(12, 10, 662, 219);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel_1.setBounds(22, 239, 241, 110);
		f.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 0));
		textField.setFont(new Font("굴림", Font.BOLD, 25));
		textField.setBounds(265, 240, 409, 110);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("숫자2");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(22, 359, 241, 110);
		f.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 0));
		textField_1.setFont(new Font("굴림", Font.BOLD, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(265, 359, 409, 110);
		f.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton.setBounds(117, 512, 216, 97);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.setBackground(new Color(0, 255, 255));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton_1.setBounds(383, 512, 216, 97);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);

	}

}
