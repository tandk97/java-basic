package db_connect;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class MemberUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 650);
		f.setTitle("나의 네이버 회원가입");
		f.getContentPane().setLayout(null);

		JLabel l0 = new JLabel("");
		l0.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\바탕 화면\\java-workspace\\oracle01\\naver.png"));
		l0.setBounds(69, 10, 355, 101);
		f.getContentPane().add(l0);

		JLabel ll = new JLabel("ID");
		JLabel l2 = new JLabel("PW");
		JLabel l3 = new JLabel("NAME");
		JLabel l4 = new JLabel("TEL");

		Font font1 = new Font("맑은 고딕", Font.BOLD, 40);
		ll.setFont(font1);
		l2.setFont(font1);
		l3.setFont(font1);
		l4.setFont(font1);

		ll.setBounds(44, 137, 145, 53);
		l2.setBounds(44, 200, 145, 53);
		l3.setBounds(44, 263, 145, 53);
		l4.setBounds(44, 326, 145, 53);

		ll.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setHorizontalAlignment(SwingConstants.CENTER);

		f.getContentPane().add(ll);
		f.getContentPane().add(l2);
		f.getContentPane().add(l3);
		f.getContentPane().add(l4);

		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();

		Font font2 = new Font("맑은 고딕", Font.BOLD, 15);
		t1.setFont(font2);
		t2.setFont(font2);
		t3.setFont(font2);
		t4.setFont(font2);

		t1.setBounds(201, 137, 254, 53);
		t2.setBounds(201, 200, 254, 53);
		t3.setBounds(201, 263, 254, 53);
		t4.setBounds(201, 326, 254, 53);

		t1.setColumns(10);
		t2.setColumns(10);
		t3.setColumns(10);
		t4.setColumns(10);

		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		f.getContentPane().add(t3);
		f.getContentPane().add(t4);

		JButton b1 = new JButton("회원가입완료");
		JButton b2 = new JButton("회원탈퇴처리");
		JButton b3 = new JButton("조회");
		Font font3 = new Font("굴림", Font.BOLD, 40);
		b1.setFont(font3);
		b2.setFont(font3);
		b3.setFont(font3);
		b1.setBounds(94, 411, 318, 53);
		b2.setBounds(94, 474, 318, 53);
		b3.setBounds(94, 537, 318, 53);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. t1, t2, t3, t4에 입력한 값을 가지고 오기
				// 2. DB에 넣기 위해 MemberDAO를 만들고
				// 3. 회원등록 기능을 쓰기 위해 insert()메서드 호출
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				MemberDAO dao = new MemberDAO();
				dao.insert(id, pw, name, tel);

			}
		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. t1, t2, t3, t4에 입력한 값을 가지고 오기
				// 2. DB에 넣기 위해 MemberDAO를 만들고
				// 3. 회원등록 기능을 쓰기 위해 insert()메서드 호출
				String id = t1.getText();
				MemberDAO dao = new MemberDAO();
				dao.delete(id);

			}
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("검색할 id 입력");
				// DAO의 search() 호출할 것
				MemberDAO dao = new MemberDAO();
				MemberVO bag = dao.search(id);
				t1.setText(bag.getId());
				t2.setText(bag.getPw());
				t3.setText(bag.getName());
				t4.setText(bag.getTel());
			}
		});
		f.setVisible(true);

	}
}
