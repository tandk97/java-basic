package 윈도우;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의첫계산기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 128, 0));
		f.setSize(700, 700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\바탕 화면\\java-workspace\\javabasic\\src\\윈도우\\calculator-385506__480.jpg"));
		lblNewLabel.setBounds(12, 482, 662, 171);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel_1.setBounds(12, 10, 241, 110);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 0));
		t1.setFont(new Font("굴림", Font.BOLD, 25));
		t1.setBounds(265, 15, 409, 110);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("숫자2");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(12, 130, 241, 110);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 255, 0));
		t2.setFont(new Font("굴림", Font.BOLD, 25));
		t2.setColumns(10);
		t2.setBounds(265, 135, 409, 110);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//plus 버튼을 눌렀을 때 처리하고 싶은 내용을 넣는다
				JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요");
				// 1. 두 수를 가지고 오세요(String)
				String n1 = t1.getText(); // "100"
				String n2 = t2.getText(); // "200"
				// 2. 숫자로 변경해서 정수변수에 넣어주세요
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				// 3. 결과출력
				JOptionPane.showMessageDialog(f, n11 + n22 );
				f.setTitle("더한 결과는 " + (n11 + n22));
				//result.setText("더한 결과는 " + (n11 + n22));
				t1.setText("");
				t2.setText("");
				t1.setBackground(Color.blue);
				t1.setForeground(Color.red);
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 64));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton.setBounds(12, 318, 147, 100);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// - 버튼을 눌렀을 때 처리하고 싶은 내용을 넣는다
				JOptionPane.showMessageDialog(f, "마이너스 버튼을 누르셨군요");
				// 1. 두 수를 가지고 오세요(String)
				String n1 = t1.getText(); // "100"
				String n2 = t2.getText(); // "200"
				// 2. 숫자로 변경해서 정수변수에 넣어주세요
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				// 3. 결과출력
				JOptionPane.showMessageDialog(f, n11 - n22 );
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1.setBounds(181, 318, 147, 100);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// X 버튼을 눌렀을 때 처리하고 싶은 내용을 넣는다
				JOptionPane.showMessageDialog(f, "곱하기 버튼을 누르셨군요");
				// 1. 두 수를 가지고 오세요(String)
				String n1 = t1.getText(); // "100"
				String n2 = t2.getText(); // "200"
				// 2. 숫자로 변경해서 정수변수에 넣어주세요
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				// 3. 결과출력
				JOptionPane.showMessageDialog(f, n11 * n22 );
			}
		});
		btnX.setFont(new Font("굴림", Font.BOLD, 40));
		btnX.setBackground(new Color(0, 128, 255));
		btnX.setBounds(352, 318, 147, 100);
		f.getContentPane().add(btnX);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//나누기 버튼을 눌렀을 때 처리하고 싶은 내용을 넣는다
				JOptionPane.showMessageDialog(f, "나누기 버튼을 누르셨군요");
				// 1. 두 수를 가지고 오세요(String)
				String n1 = t1.getText(); // "100"
				String n2 = t2.getText(); // "200"
				// 2. 숫자로 변경해서 정수변수에 넣어주세요
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				// 3. 결과출력
				JOptionPane.showMessageDialog(f, n11 / n22 );
			}
		});
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.setBounds(527, 318, 147, 100);
		f.getContentPane().add(btnNewButton_3);
		f.setVisible(true);

	}

}
