package project1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.SwingConstants;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ManageUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t5;
	private static JTextField t4;
	private static JTextField t6;
	private static JTextField t7;
	private static JTextField t8;
	private static JTextField t_id;
	private static JTextField t_pw;
	private static JTextField t_name;
	private static JTextField t_date;
	private static JTextField t_tel;
	private static JTextField t_mr;
	private static JTextField t_tm;
	private static JTextField t_loan;
	private static JTable table;
	private static JScrollPane scrollPane;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("회원 관리 화면");
		f.setSize(1200, 900);
		f.getContentPane().setLayout(null);

		JLabel l1 = new JLabel("회원 관리 페이지");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		l1.setBounds(300, 25, 600, 65);
		f.getContentPane().add(l1);

		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t5 = new JTextField();
		t4 = new JTextField();
		t6 = new JTextField();
		t7 = new JTextField();
		t8 = new JTextField();
		t_id = new JTextField();
		t_name = new JTextField();
		t_pw = new JTextField();
		t_date = new JTextField();
		t_tel = new JTextField();
		t_mr = new JTextField();
		t_tm = new JTextField();
		t_loan = new JTextField();

		Font font1 = new Font("굴림체", Font.BOLD, 25);
		t1.setFont(font1);
		t2.setFont(font1);
		t3.setFont(font1);
		t5.setFont(font1);
		t4.setFont(font1);
		t6.setFont(font1);
		t7.setFont(font1);
		t8.setFont(font1);
		t_id.setFont(font1);
		t_pw.setFont(font1);
		t_name.setFont(font1);
		t_date.setFont(font1);
		t_tel.setFont(font1);
		t_mr.setFont(font1);
		t_tm.setFont(font1);
		t_loan.setFont(font1);

		Color color = new Color(255, 128, 64);
		t1.setBackground(color);
		t2.setBackground(color);
		t3.setBackground(color);
		t5.setBackground(color);
		t4.setBackground(color);
		t6.setBackground(color);
		t7.setBackground(color);
		t8.setBackground(color);

		t1.setEditable(false);
		t2.setEditable(false);
		t3.setEditable(false);
		t5.setEditable(false);
		t4.setEditable(false);
		t6.setEditable(false);
		t7.setEditable(false);
		t8.setEditable(false);

		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t6.setHorizontalAlignment(SwingConstants.CENTER);
		t7.setHorizontalAlignment(SwingConstants.CENTER);
		t8.setHorizontalAlignment(SwingConstants.CENTER);
		t_id.setHorizontalAlignment(SwingConstants.CENTER);
		t_pw.setHorizontalAlignment(SwingConstants.CENTER);
		t_name.setHorizontalAlignment(SwingConstants.CENTER);
		t_date.setHorizontalAlignment(SwingConstants.CENTER);
		t_tel.setHorizontalAlignment(SwingConstants.CENTER);
		t_mr.setHorizontalAlignment(SwingConstants.CENTER);
		t_tm.setHorizontalAlignment(SwingConstants.CENTER);
		t_loan.setHorizontalAlignment(SwingConstants.CENTER);

		t1.setText("아이디");
		t2.setText("비밀번호");
		t3.setText("이름");
		t5.setText("생년월일");
		t4.setText("전화번호");
		t6.setText("관리자 여부");
		t7.setText("총 연체료");
		t8.setText("대출 가능 여부");

		t1.setColumns(10);
		t2.setColumns(10);
		t3.setColumns(10);
		t5.setColumns(10);
		t4.setColumns(10);
		t6.setColumns(10);
		t7.setColumns(10);
		t8.setColumns(10);
		t_id.setColumns(10);
		t_pw.setColumns(10);
		t_name.setColumns(10);
		t_date.setColumns(10);
		t_tel.setColumns(10);
		t_mr.setColumns(10);
		t_tm.setColumns(10);
		t_loan.setColumns(10);

		t1.setBounds(40, 100, 140, 50);
		t2.setBounds(360, 100, 140, 50);
		t3.setBounds(40, 150, 140, 50);
		t4.setBounds(360, 150, 140, 50);
		t5.setBounds(40, 200, 140, 50);
		t6.setBounds(800, 100, 225, 50);
		t7.setBounds(800, 150, 225, 50);
		t8.setBounds(800, 200, 225, 50);
		t_id.setBounds(180, 100, 170, 50);
		t_pw.setBounds(500, 100, 260, 50);
		t_name.setBounds(180, 150, 170, 50);
		t_tel.setBounds(500, 150, 260, 50);
		t_date.setBounds(180, 200, 170, 50);
		t_mr.setBounds(1025, 100, 140, 50);
		t_tm.setBounds(1025, 150, 140, 50);
		t_loan.setBounds(1025, 200, 140, 50);

		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		f.getContentPane().add(t3);
		f.getContentPane().add(t5);
		f.getContentPane().add(t4);
		f.getContentPane().add(t6);
		f.getContentPane().add(t7);
		f.getContentPane().add(t8);
		f.getContentPane().add(t_id);
		f.getContentPane().add(t_name);
		f.getContentPane().add(t_pw);
		f.getContentPane().add(t_date);
		f.getContentPane().add(t_tel);
		f.getContentPane().add(t_mr);
		f.getContentPane().add(t_tm);
		f.getContentPane().add(t_loan);

		JButton b1 = new JButton("검색");
		JButton b2 = new JButton("저장");
		JButton b3 = new JButton("수정");
		JButton b4 = new JButton("삭제");
		JButton b5 = new JButton("리셋");

		Font font2 = new Font("맑은 고딕", Font.BOLD, 20);
		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);
		b4.setFont(font2);
		b5.setFont(font2);

		b1.setBounds(368, 210, 85, 50);
		b2.setBounds(452, 210, 85, 50);
		b3.setBounds(534, 210, 85, 50);
		b4.setBounds(615, 210, 85, 50);
		b5.setBounds(697, 210, 85, 50);

		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(b4);
		f.getContentPane().add(b5);

		String header[] = { "아이디", "패스워드", "이름", "생년월일", "전화번호", "관리자 여부", "총 연체료", "대출 가능 여부" };
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> list = dao.list();
		System.out.println("List UI" + list);
		Object[][] all = new Object[list.size()][8];
		for (int i = 0; i < all.length; i++) {
			for (int j = 0; j < 8; j++) {
				all[i][0] = list.get(i).getId();
				all[i][1] = list.get(i).getPw();
				all[i][2] = list.get(i).getName();
				all[i][3] = list.get(i).getDate();
				all[i][4] = list.get(i).getTel();
				all[i][5] = list.get(i).getMr();
				all[i][6] = list.get(i).getTm();
				all[i][7] = list.get(i).getLoan();
			}
		}
		JPanel panel = new JPanel();
		panel.setBounds(20, 270, 1145, 580);
		f.getContentPane().add(panel);
		panel.setLayout(null);

		table = new JTable(all, header);
		scrollPane = new JScrollPane(table);
		panel.add(scrollPane);
		scrollPane.setSize(1145, 580);
		Font font3 = new Font("돋움체", Font.BOLD, 13);
		table.setFont(font3);

		table.addMouseListener(new MouseAdapter() {// 테이블 선택시 데이터 나오게 하기
			@Override
			public void mouseClicked(MouseEvent e) {
				// 행
				int rowNo = table.getSelectedRow();
				// 열
				// int colNo = table.getSelectedColumn();
				Object id = table.getModel().getValueAt(rowNo, 0); // 0,0
				Object pw = table.getModel().getValueAt(rowNo, 1); // 0,1
				Object name = table.getModel().getValueAt(rowNo, 2); // 0,2
				Object date = table.getModel().getValueAt(rowNo, 3); // 0,3
				Object tel = table.getModel().getValueAt(rowNo, 4); // 0,4
				Object mr = table.getModel().getValueAt(rowNo, 5); // 0,5
				Object tm = table.getModel().getValueAt(rowNo, 6); // 0,6
				Object loan = table.getModel().getValueAt(rowNo, 7); // 0,7
				JOptionPane.showMessageDialog(table, "회원 정보 : [id=" + id + ", pw=" + pw + ", name=" + name + ", date="
						+ date + ", tel=" + tel + ", mr=" + mr + ", tm=" + tm + ", loan=" + loan + "]");
			}
		});// 완료

		b1.addActionListener(new ActionListener() {// 검색 기능

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("검색할 회원의 ID를 입력하세요");
				MemberDAO dao = new MemberDAO(); // 기능 모음집 호출
				MemberVO bag = dao.search(id); // 데이터 패킷 주머니 생성
				t_id.setText(bag.getId()); // 텍스트 바에 설정 해주기(Set)
				t_pw.setText(bag.getPw());
				t_name.setText(bag.getName());
				t_date.setText(bag.getDate());
				t_tel.setText(bag.getTel());
				t_mr.setText(bag.getMr());
				t_tm.setText(String.valueOf(bag.getTm()));
				t_loan.setText(bag.getLoan());
				JOptionPane.showMessageDialog(null, "검색된 " + bag);
			}
		});// 완료

		b2.addActionListener(new ActionListener() {// 저장(삽입) 기능

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.remove(scrollPane);
				panel.repaint();
				int tm_insert; // 텍스트 필드에서 String 타입으로 받아올 tm을 int로 바꿔서 저장해 줄 변수 선언
				MemberDAO dao = new MemberDAO(); // 기능 모음집 호출
				String id = t_id.getText(); // 텍스트 필드에서 데이터 가져오기(get)
				String pw = t_pw.getText();
				String name = t_name.getText();
				String date = t_date.getText();
				String tel = t_tel.getText();
				String mr = t_mr.getText();
				String tm = t_tm.getText();
				String loan = t_loan.getText();

				tm_insert = Integer.parseInt(tm); // dao.insert에 tm정보로 넣기 위해 int로 바꿔주기

				if (mr.equals("1")) {// mr은 String 타입
					dao.insert(id, pw, name, date, tel, mr, tm_insert, loan);
					String mr_insert = "관리자";
					if (loan.equals("1")) {
						String loan_insert = "대출 가능";
						JOptionPane.showMessageDialog(null,
								"저장된 회원 정보는 [아이디 : " + id + ", 비밀번호 : " + pw + ", 이름 : " + name + ", 생년월일 : " + date
										+ ", 전화번호 : " + tel + ", 회원 분류 : " + mr_insert + ", 총 연체료 : " + tm
										+ ", 대출 가능 여부 : " + loan_insert + "] 입니다");
					} else {
						String loan_insert = "대출 불가";
						JOptionPane.showMessageDialog(null,
								"저장된 회원 정보는 [아이디 : " + id + ", 비밀번호 : " + pw + ", 이름 : " + name + ", 생년월일 : " + date
										+ ", 전화번호 : " + tel + ", 회원 분류 : " + mr_insert + ", 총 연체료 : " + tm
										+ ", 대출 가능 여부 : " + loan_insert + "] 입니다");
					}
				} else {
					dao.insert(id, pw, name, date, tel, mr, tm_insert, loan);
					String mr_insert = "일반 회원";
					if (loan.equals("1")) {
						String loan_insert = "대출 가능";
						JOptionPane.showMessageDialog(null,
								"저장된 회원 정보는 [아이디 : " + id + ", 비밀번호 : " + pw + ", 이름 : " + name + ", 생년월일 : " + date
										+ ", 전화번호 : " + tel + ", 회원 분류 : " + mr_insert + ", 총 연체료 : " + tm
										+ ", 대출 가능 여부 : " + loan_insert + "] 입니다");
					} else {
						String loan_insert = "대출 불가";
						JOptionPane.showMessageDialog(null,
								"저장된 회원 정보는 [아이디 : " + id + ", 비밀번호 : " + pw + ", 이름 : " + name + ", 생년월일 : " + date
										+ ", 전화번호 : " + tel + ", 회원 분류 : " + mr_insert + ", 총 연체료 : " + tm
										+ ", 대출 가능 여부 : " + loan_insert + "] 입니다");
					}
				}
				String header[] = { "아이디", "패스워드", "이름", "생년월일", "전화번호", "관리자 여부", "총 연체료", "대출 가능 여부" };
				MemberDAO dao2 = new MemberDAO();
				ArrayList<MemberVO> list = dao2.list();
				System.out.println("List UI" + list);
				Object[][] all = new Object[list.size()][8];
				for (int i = 0; i < all.length; i++) {
					for (int j = 0; j < 8; j++) {
						all[i][0] = list.get(i).getId();
						all[i][1] = list.get(i).getPw();
						all[i][2] = list.get(i).getName();
						all[i][3] = list.get(i).getDate();
						all[i][4] = list.get(i).getTel();
						all[i][5] = list.get(i).getMr();
						all[i][6] = list.get(i).getTm();
						all[i][7] = list.get(i).getLoan();
					}
				}
				table = new JTable(all, header);
				scrollPane = new JScrollPane(table);
				panel.add(scrollPane);
				scrollPane.setSize(1145, 580);
				Font font3 = new Font("돋움체", Font.BOLD, 13);
				table.setFont(font3);
				panel.updateUI();
				table.addMouseListener(new MouseAdapter() {// 테이블 선택시 데이터 나오게 하기
					@Override
					public void mouseClicked(MouseEvent e) {
						// 행
						int rowNo = table.getSelectedRow();
						// 열
						// int colNo = table.getSelectedColumn();
						Object id = table.getModel().getValueAt(rowNo, 0); // 0,0
						Object pw = table.getModel().getValueAt(rowNo, 1); // 0,1
						Object name = table.getModel().getValueAt(rowNo, 2); // 0,2
						Object date = table.getModel().getValueAt(rowNo, 3); // 0,3
						Object tel = table.getModel().getValueAt(rowNo, 4); // 0,4
						Object mr = table.getModel().getValueAt(rowNo, 5); // 0,5
						Object tm = table.getModel().getValueAt(rowNo, 6); // 0,6
						Object loan = table.getModel().getValueAt(rowNo, 7); // 0,7
						JOptionPane.showMessageDialog(table,
								"회원 정보 : [id=" + id + ", pw=" + pw + ", name=" + name + ", date=" + date + ", tel="
										+ tel + ", mr=" + mr + ", tm=" + tm + ", loan=" + loan + "]");
					}
				});// 완료
			}
		});

		b3.addActionListener(new ActionListener() {// 수정
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.remove(scrollPane);
				panel.repaint();
				int tm1 = 0;
				MemberDAO dao = new MemberDAO(); // 기능 모음집 호출
				String id = t_id.getText(); // 텍스트 필드에서 데이터 가져오기(get)
				String pw = t_pw.getText();
				String name = t_name.getText();
				String date = t_date.getText();
				String tel = t_tel.getText();
				String mr = t_mr.getText();
				String tm = t_tm.getText();
				String loan = t_loan.getText();

				tm1 = Integer.parseInt(tm);

				System.out.println(pw + name);

				dao.update(id, pw, name, date, tel, mr, tm1, loan);
				JOptionPane.showMessageDialog(null,
						"저장된 회원 정보는 [아이디 : " + id + ", 비밀번호 : " + pw + ", 이름 : " + name + ", 생년월일 : " + date
								+ ", 전화번호 : " + tel + ", 회원 분류 : " + mr + ", 총 연체료 : " + tm + ", 대출 가능 여부 : " + loan
								+ "] 입니다");
				String header[] = { "아이디", "패스워드", "이름", "생년월일", "전화번호", "관리자 여부", "총 연체료", "대출 가능 여부" };
				MemberDAO dao2 = new MemberDAO();
				ArrayList<MemberVO> list = dao2.list();
				// System.out.println("List UI" + list);
				Object[][] all = new Object[list.size()][8];
				for (int i = 0; i < all.length; i++) {
					for (int j = 0; j < 8; j++) {
						all[i][0] = list.get(i).getId();
						all[i][1] = list.get(i).getPw();
						all[i][2] = list.get(i).getName();
						all[i][3] = list.get(i).getDate();
						all[i][4] = list.get(i).getTel();
						all[i][5] = list.get(i).getMr();
						all[i][6] = list.get(i).getTm();
						all[i][7] = list.get(i).getLoan();
					}
				}
				table = new JTable(all, header);
				scrollPane = new JScrollPane(table);
				panel.add(scrollPane);
				scrollPane.setSize(1145, 580);
				Font font3 = new Font("돋움체", Font.BOLD, 13);
				table.setFont(font3);
				panel.updateUI();
				table.addMouseListener(new MouseAdapter() {// 테이블 선택시 데이터 나오게 하기
					@Override
					public void mouseClicked(MouseEvent e) {
						// 행
						int rowNo = table.getSelectedRow();
						// 열
						// int colNo = table.getSelectedColumn();
						Object id = table.getModel().getValueAt(rowNo, 0); // 0,0
						Object pw = table.getModel().getValueAt(rowNo, 1); // 0,1
						Object name = table.getModel().getValueAt(rowNo, 2); // 0,2
						Object date = table.getModel().getValueAt(rowNo, 3); // 0,3
						Object tel = table.getModel().getValueAt(rowNo, 4); // 0,4
						Object mr = table.getModel().getValueAt(rowNo, 5); // 0,5
						Object tm = table.getModel().getValueAt(rowNo, 6); // 0,6
						Object loan = table.getModel().getValueAt(rowNo, 7); // 0,7
						JOptionPane.showMessageDialog(table,
								"회원 정보 : [id=" + id + ", pw=" + pw + ", name=" + name + ", date=" + date + ", tel="
										+ tel + ", mr=" + mr + ", tm=" + tm + ", loan=" + loan + "]");
					}
				});// 완료
			}
		});

		b4.addActionListener(new ActionListener() {// 삭제

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.remove(scrollPane);
				panel.repaint();
				String id = JOptionPane.showInputDialog("삭제할 회원의 ID를 입력하세요");
				MemberDAO dao = new MemberDAO(); // 기능 모음집 호출
				dao.delete(id); // 삭제 기능 실행
				JOptionPane.showMessageDialog(null, "삭제한 회원의 ID는 " + id);
				String header[] = { "아이디", "패스워드", "이름", "생년월일", "전화번호", "관리자 여부", "총 연체료", "대출 가능 여부" };
				MemberDAO dao2 = new MemberDAO();
				ArrayList<MemberVO> list = dao2.list();
				System.out.println("List UI" + list);
				Object[][] all = new Object[list.size()][8];
				for (int i = 0; i < all.length; i++) {
					for (int j = 0; j < 8; j++) {
						all[i][0] = list.get(i).getId();
						all[i][1] = list.get(i).getPw();
						all[i][2] = list.get(i).getName();
						all[i][3] = list.get(i).getDate();
						all[i][4] = list.get(i).getTel();
						all[i][5] = list.get(i).getMr();
						all[i][6] = list.get(i).getTm();
						all[i][7] = list.get(i).getLoan();
					}
				}
				table = new JTable(all, header);
				scrollPane = new JScrollPane(table);
				panel.add(scrollPane);
				scrollPane.setSize(1145, 580);
				Font font3 = new Font("돋움체", Font.BOLD, 13);
				table.setFont(font3);
				panel.updateUI();
				table.addMouseListener(new MouseAdapter() {// 테이블 선택시 데이터 나오게 하기
					@Override
					public void mouseClicked(MouseEvent e) {
						// 행
						int rowNo = table.getSelectedRow();
						// 열
						// int colNo = table.getSelectedColumn();
						Object id = table.getModel().getValueAt(rowNo, 0); // 0,0
						Object pw = table.getModel().getValueAt(rowNo, 1); // 0,1
						Object name = table.getModel().getValueAt(rowNo, 2); // 0,2
						Object date = table.getModel().getValueAt(rowNo, 3); // 0,3
						Object tel = table.getModel().getValueAt(rowNo, 4); // 0,4
						Object mr = table.getModel().getValueAt(rowNo, 5); // 0,5
						Object tm = table.getModel().getValueAt(rowNo, 6); // 0,6
						Object loan = table.getModel().getValueAt(rowNo, 7); // 0,7
						JOptionPane.showMessageDialog(table,
								"회원 정보 : [id=" + id + ", pw=" + pw + ", name=" + name + ", date=" + date + ", tel="
										+ tel + ", mr=" + mr + ", tm=" + tm + ", loan=" + loan + "]");
					}
				});// 완료
			}
		});// 완료

		b5.addActionListener(new ActionListener() {// 리셋

			@Override
			public void actionPerformed(ActionEvent e) {
				t_id.setText(null); // 텍스트 바에 설정 해주기(Set)
				t_pw.setText(null);
				t_name.setText(null);
				t_date.setText(null);
				t_tel.setText(null);
				t_mr.setText(null);
				t_tm.setText(null);
				t_loan.setText(null);
				JOptionPane.showMessageDialog(null, "리셋 완료");
			}
		});// 완료

		f.setVisible(true);

	}
}
