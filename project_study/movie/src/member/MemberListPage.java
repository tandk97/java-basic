package member;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MemberListPage extends JFrame {
	List list;

	public MemberListPage() {
		JPanel jpm = new JPanel();
		JLabel l1 = new JLabel("회원관리 페이지", SwingConstants.CENTER);
		JLabel l2 = new JLabel("회원 목록");
		JLabel l3 = new JLabel("아이디 : ");
		JLabel l4 = new JLabel("이름 : ");
		JLabel l5 = new JLabel("비밀번호 :");
		JLabel l6 = new JLabel("전화번호 :");
		JLabel l7 = new JLabel("아이디");
		JLabel l8 = new JLabel("이  름");
		JLabel l9 = new JLabel("비밀번호");
		JLabel l10 = new JLabel("전화번호");

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);

		TextField t1 = new TextField();
		TextField t2 = new TextField();
		TextField t3 = new TextField();
		TextField t4 = new TextField();

		add(t1);
		add(t2);
		add(t3);
		add(t4);
		
		Font fontt = new Font("맑은 고딕", Font.BOLD, 12);
		Font font1 = new Font("맑은 고딕", Font.BOLD, 25);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 16);
		l1.setFont(font1);
		l2.setFont(font2);
		t1.setFont(fontt);
		t2.setFont(fontt);
		t3.setFont(fontt);
		t4.setFont(fontt);

		JButton save = new JButton("저 장");
		JButton delete = new JButton("삭 제");
		JButton update = new JButton("수 정");
		JButton search = new JButton("조 회");
		JButton reset = new JButton("리 셋");
		JButton back = new JButton("뒤로가기");

		add(save);
		add(delete);
		add(update);
		add(search);
		add(reset);
		add(back);

		list = new List(); // java.awt.List
		add(list);
		Font font3 = new Font("맑은 고딕", 0, 15);
		list.setFont(font3);

		l1.setBounds(300, 30, 200, 40);
		l2.setBounds(50, 200, 80, 30);
		l3.setBounds(350, 100, 50, 30);
		l4.setBounds(350, 130, 50, 30);
		l5.setBounds(550, 100, 60, 30);
		l6.setBounds(550, 130, 60, 30);
		l7.setBounds(70, 230, 60, 25);
		l8.setBounds(250, 230, 60, 25);
		l9.setBounds(450, 230, 60, 25);
		l10.setBounds(650, 230, 60, 25);

		t1.setBounds(410, 100, 100, 30);
		t2.setBounds(410, 130, 100, 30);
		t3.setBounds(610, 100, 100, 30);
		t4.setBounds(610, 130, 100, 30);

		save.setBounds(240, 180, 100, 30);
		delete.setBounds(340, 180, 100, 30);
		update.setBounds(440, 180, 100, 30);
		search.setBounds(540, 180, 100, 30);
		reset.setBounds(640, 180, 100, 30);
		back.setBounds(650, 670, 100, 30);

		list.setBounds(50, 260, 700, 400);
		add(jpm);
		setSize(800, 700);
		setTitle("회원 관리");
		setResizable(false);
		setLocationRelativeTo(jpm);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		// DB안에 모든 자료를 list에 보이게 하세요
		displayAll();

		list.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// 리스트 아이템 선택시 텍스트 필드로 값 넣기
				String str = list.getSelectedItem();
				StringTokenizer st = new StringTokenizer(str);
				t1.setText(st.nextToken());
				t2.setText(st.nextToken());
				t3.setText(st.nextToken());
				t4.setText(st.nextToken());
			}
		});

		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 저장버튼
				String id = t1.getText();
				String name = t2.getText();
				String pwd = t3.getText();
				String phoneNumber = t4.getText();
				MemberDAO dao = new MemberDAO();
				dao.insertMember(id, name, pwd, phoneNumber);
				JOptionPane.showMessageDialog(null, "저장 완료");
				displayAll();
			}
		});

		delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 삭제
				String id = t1.getText();
				MemberDAO dao = new MemberDAO();
				dao.deleteMember(id);
				JOptionPane.showMessageDialog(null, "삭제 완료");
				displayAll();
			}
		});

		update.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 수정
				String id = t1.getText();
				String name = t2.getText();
				String pwd = t3.getText();
				String phoneNumber = t4.getText();
				MemberDAO dao = new MemberDAO();
				dao.update(id, name, pwd, phoneNumber);
				JOptionPane.showMessageDialog(null, "수정 완료");
				displayAll();
			}
		});

		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 지우기
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				JOptionPane.showMessageDialog(null, "리셋 완료");
			}
		});

		search.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 검색, 조회
				String id = t1.getText();
				MemberDAO dao = new MemberDAO();
				MemberDTO dto = dao.search(id);
				t1.setText(dto.getId());
				t2.setText(dto.getName());
				t3.setText(dto.getPwd());
				t4.setText(dto.getPhoneNumber());
				JOptionPane.showMessageDialog(null, "조회 완료");
			}
		});
	} // public MemberListPage 생성자

	private void displayAll() {
		list.removeAll();
		MemberDAO dao = new MemberDAO();
		dao.select();
		ArrayList<MemberDTO> allData = dao.select();
		for (MemberDTO dto : allData) {
			String id = dto.getId();
			String name = dto.getName();
			String pwd = dto.getPwd();
			String phoneNumber = dto.getPhoneNumber();
			list.add(id + "                                         " + name + "                                             " + pwd
					+ "                                   " + phoneNumber);
		}
	}

} // public class MemberListPage extends JFrame