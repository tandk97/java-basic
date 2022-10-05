package 생성자;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 중국집주문화면 {
	static int count; // int count = 0;와 동일
	static final int PRICE = 5000;; // 상수는 final을 붙여서 변경불가능으로 바꿈

	private static JTextField t1;
	static JLabel result;
	static int 짬뽕count = 0;
	static int 우동count = 0;
	static int 짜장count = 0;

	public static void main(String[] args) {
		JFrame f = new JFrame("음식점 주문 화면");
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(823, 574);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uAC1C\uC218:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(489, 37, 68, 46);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("굴림", Font.BOLD, 40));
		t1.setBounds(556, 32, 239, 44);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JLabel center = new JLabel("");
		// 라벨에 이미지를 변경하고 싶으면, 이미지부품을 만들고, 라벨에 아이콘을 셋팅
		ImageIcon img = new ImageIcon("짜장면.png");
		center.setIcon(img);
//		center.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\바탕 화면\\java-workspace\\java06\\짜장면.png"));
//		center.setFont(new Font("굴림", Font.BOLD, 20));
		center.setBounds(124, 96, 559, 368);
		f.getContentPane().add(center);

		JLabel result = new JLabel("\uACB0\uC81C\uAE08\uC561");
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.BOLD, 30));
		result.setBounds(124, 464, 555, 61);
		f.getContentPane().add(result);

		JButton btnNewButton = new JButton("\uC9EC\uBF55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 주문량을 현재 카운트에 하나 플러스
				짬뽕count++;
				count++;
				// 현재 주문량을 변경
				t1.setText(count + "개");
				// center 라벨에 있는 이미지 변경
				// 이미지아이콘 부품을 만들어, center 라벨에 셋팅한다.
				ImageIcon icon = new ImageIcon("짬뽕.png");
				center.setIcon(icon);
				// result 라벨에 있는 결제금액 변경
				result.setText("결제금액 : " + count * PRICE + "원");
				f.setTitle("짬뽕 : " + 짬뽕count + " 우동 : " + 우동count + " 짜장 : " + 짜장count);
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton.setBounds(12, 10, 142, 66);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uC6B0\uB3D9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 주문량을 현재 카운트에 하나 플러스
				우동count++;
				count++;
				// 현재 주문량을 변경
				t1.setText(count + "개");
				// center 라벨에 있는 이미지 변경
				// 이미지아이콘 부품을 만들어, center 라벨에 셋팅한다.
				ImageIcon icon = new ImageIcon("우동.png");
				center.setIcon(icon);
				// result 라벨에 있는 결제금액 변경
				result.setText("결제금액 : " + count * PRICE + "원");
				f.setTitle("짬뽕 : " + 짬뽕count + " 우동 : " + 우동count + " 짜장 : " + 짜장count);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(166, 10, 142, 66);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\uC9DC\uC7A5");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 주문량을 현재 카운트에 하나 플러스
				짜장count++;
				count++;
				// 현재 주문량을 변경
				t1.setText(count + "개");
				// center 라벨에 있는 이미지 변경
				// 이미지아이콘 부품을 만들어, center 라벨에 셋팅한다.
				ImageIcon icon = new ImageIcon("짜장면.png");
				center.setIcon(icon);
				// result 라벨에 있는 결제금액 변경
				result.setText("결제금액 : " + count * PRICE + "원");
				f.setTitle("짬뽕 : " + 짬뽕count + " 우동 : " + 우동count + " 짜장 : " + 짜장count);
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setBounds(320, 10, 142, 66);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}