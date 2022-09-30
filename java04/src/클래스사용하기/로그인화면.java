package 클래스사용하기;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인화면 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// 화면 만들기
		JFrame f = new JFrame();
		f.setTitle("일기장 로그인");
		f.setSize(600, 700);
		f.getContentPane().setBackground(new Color(0, 255, 0));
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\바탕 화면\\java-workspace\\java04\\일기장.jpg"));
		lblNewLabel.setBounds(151, 26, 280, 186);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디 :");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 28));
		lblNewLabel_1.setBounds(77, 238, 150, 78);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호 :");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 28));
		lblNewLabel_1_1.setBounds(77, 326, 150, 78);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 24));
		t1.setBounds(239, 244, 307, 78);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 24));
		t2.setColumns(10);
		t2.setBounds(239, 332, 307, 78);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText(); // id
				String s2 = t2.getText(); // pw
				if(s1.equals("root") && s2.equals("1234")) {
					// 일기 쓰기 화면창 띄우기
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();
				} else {
					JOptionPane.showMessageDialog(f, "입력 값이 달라서 로그인 실패입니다");
				}
				

			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\바탕 화면\\java-workspace\\java04\\ok.png"));
		btnNewButton.setBounds(64, 428, 215, 225);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				JOptionPane.showMessageDialog(f, "로그인 정보 입력창 초기화");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\바탕 화면\\java-workspace\\java04\\no.png"));
		btnNewButton_1.setBounds(314, 428, 215, 225);
		f.getContentPane().add(btnNewButton_1);
		
		f.setVisible(true);
	}
}
