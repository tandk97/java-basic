package 연습;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import javax.swing.JTextField;
import javax.swing.JButton;

public class 게시판UI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(600, 850);
		f.setTitle("나의 네이버 회원가입");
		f.getContentPane().setLayout(null);

		JLabel ll = new JLabel("게시판 아이디");
		JLabel l2 = new JLabel("게시판 제목");
		JLabel l3 = new JLabel("게시판 내용");
		JLabel l4 = new JLabel("게시판 작성자");

		Font font1 = new Font("맑은 고딕", Font.BOLD, 35);
		ll.setFont(font1);
		l2.setFont(font1);
		l3.setFont(font1);
		l4.setFont(font1);

		ll.setBounds(150, 75, 300, 45);
		l2.setBounds(150, 190, 300, 45);
		l3.setBounds(150, 305, 300, 45);
		l4.setBounds(150, 420, 300, 45);

		ll.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setHorizontalAlignment(SwingConstants.CENTER);

		f.getContentPane().add(ll);
		f.getContentPane().add(l2);
		f.getContentPane().add(l3);
		f.getContentPane().add(l4);

		JLabel TITLE = new JLabel("나의 게시판");
		TITLE.setFont(font1);
		TITLE.setHorizontalAlignment(SwingConstants.CENTER);
		TITLE.setBounds(15, 10, 570, 50);
		f.getContentPane().add(TITLE);

		JLabel lblNewLabel = new JLabel(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel.setBounds(2, 65, 590, 5);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();

		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setHorizontalAlignment(SwingConstants.CENTER);

		Font font2 = new Font("맑은 고딕", Font.BOLD, 18);
		t1.setFont(font2);
		t2.setFont(font2);
		t3.setFont(font2);
		t4.setFont(font2);

		t1.setBounds(50, 130, 500, 50);
		t2.setBounds(50, 245, 500, 50);
		t3.setBounds(50, 360, 500, 50);
		t4.setBounds(50, 475, 500, 50);

		t1.setColumns(10);
		t2.setColumns(10);
		t3.setColumns(10);
		t4.setColumns(10);

		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		f.getContentPane().add(t3);
		f.getContentPane().add(t4);

		JButton b1 = new JButton("게시물 작성 완료");
		JButton b2 = new JButton("게시물 삭제 완료");
		JButton b3 = new JButton("게시물 수정 완료");
		JButton b4 = new JButton("게시물 검색 완료");

		Font font3 = new Font("굴림", Font.BOLD, 40);
		b1.setFont(font3);
		b2.setFont(font3);
		b3.setFont(font3);
		b4.setFont(font3);

		b1.setBounds(100, 535, 400, 60);
		b2.setBounds(100, 605, 400, 60);
		b3.setBounds(100, 675, 400, 60);
		b4.setBounds(100, 745, 400, 60);

		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(b4);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String NO = t1.getText();
				String TITLE = t2.getText();
				String CONTENT = t3.getText();
				String WRITER = t4.getText();
				게시판DAO dao = new 게시판DAO();
				dao.insert(NO, TITLE, CONTENT, WRITER);

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. t1, t2, t3, t4에 입력한 값을 가지고 오기
				// 2. DB에 넣기 위해 MemberDAO를 만들고
				// 3. 회원등록 기능을 쓰기 위해 insert()메서드 호출
				String NO = t1.getText();
				게시판DAO dao = new 게시판DAO();
				dao.delete(NO);

			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String NO = t1.getText();
				String TITLE = t2.getText();
				String CONTENT = t3.getText();
				String WRITER = t4.getText();
				게시판DAO dao = new 게시판DAO();
				dao.update(NO, TITLE, CONTENT, WRITER);

			}
		});

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String NO = JOptionPane.showInputDialog("검색할 NO 입력");
				게시판DAO dao = new 게시판DAO();
				BBSVO bag = dao.search(NO);
				t1.setText(bag.getNo());
				t2.setText(bag.getTitle());
				t3.setText(bag.getContent());
				t4.setText(bag.getWriter());
			}
		});

		f.setVisible(true);

	}
}
