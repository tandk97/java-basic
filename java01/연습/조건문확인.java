package 연습;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 조건문확인 {
	// text 바 설정하기
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 255, 0));
		f.setSize(600, 800);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(12, 65, 300, 65);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(12, 240, 300, 119);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("국어 점수");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_2.setBounds(51, 473, 261, 65);
		f.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("수학 점수");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_3.setBounds(51, 548, 261, 65);
		f.getContentPane().add(lblNewLabel_3);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBackground(new Color(255, 128, 0));
		t1.setBounds(324, 70, 250, 65);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setBackground(new Color(255, 128, 255));
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBounds(324, 245, 250, 114);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 20));
		t3.setBackground(new Color(0, 255, 255));
		t3.setColumns(10);
		t3.setBounds(324, 473, 250, 65);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.BOLD, 20));
		t4.setBackground(new Color(0, 255, 255));
		t4.setColumns(10);
		t4.setBounds(324, 548, 250, 65);
		f.getContentPane().add(t4);

		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 첫번째 text 바에서 입력받은 정보 갖고 오기
				String s1 = t1.getText();
				// 커피 종류 인지 아닌지 판단하기
				if (s1.equals("아메리카노") || s1.equals("아이스 아메리카노") || s1.equals("홍차") || s1.equals("커피")) {
					// 출력) 커피 종류니까 카페
					JOptionPane.showMessageDialog(f, "카페 가세요");
					// 출력) 커피가 아니니까 물이나 마시라고 하기
				} else {
					JOptionPane.showMessageDialog(f, "물이나 마셔요");
				}
				// text 바 비우기
				t1.setText("");

			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBounds(22, 149, 552, 65);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 2. 두 번째 text 바에서 입력받은 정보 갖고 오기
				String s2 = t2.getText();
				// 스트링 숫자 처리
				int s22 = Integer.parseInt(s2);
				// 출력
				JOptionPane.showMessageDialog(f, "당신의 내년 나이는 " + (s22 + 1));
				// text 바 비우기
				t2.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1.setBounds(22, 382, 552, 65);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("두 과목 점수의 평균은?");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 3, 4 번째 text 바에서 입력받은 정보 갖고 오기
				String s3 = t3.getText();
				String s4 = t4.getText();
				// 스트링 숫자 처리
				double s33 = Integer.parseInt(s3);
				double s44 = Integer.parseInt(s4);
				// 출력
				JOptionPane.showMessageDialog(f, "두 과목의 점수의 평균은 " + (s33 + s44) / 2);
				// text 바 비우기
				t3.setText("");
				t4.setText("");

			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1_1.setBounds(22, 633, 552, 65);
		f.getContentPane().add(btnNewButton_1_1);
		f.setVisible(true);

	}

}
