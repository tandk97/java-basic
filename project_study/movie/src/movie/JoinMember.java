package movie;

import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import member.MemberDAO;

public class JoinMember extends JFrame {

	public JoinMember() {
		JPanel p = new JPanel();
		setLocationRelativeTo(p);
		Label l1 = new Label("ID");
		Label l2 = new Label("Name");
		Label l3 = new Label("PWD");
		Label l4 = new Label("Mobile");
		add(l1);
		add(l2);
		add(l3);
		add(l4);

		TextField t1 = new TextField();
		TextField t2 = new TextField();
		TextField t3 = new TextField();
		TextField t4 = new TextField();
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		t3.setEchoChar('*');

		JButton j1 = new JButton("저장");
		JButton j2 = new JButton("취소");
		JButton j3 = new JButton("ID중복체크");
		add(j1);
		add(j2);
		add(j3);

		l1.setBounds(40, 10, 40, 40);
		l2.setBounds(40, 50, 40, 40);
		l3.setBounds(40, 90, 40, 40);
		l4.setBounds(40, 130, 40, 40);

		t1.setBounds(120, 10, 200, 30);
		t2.setBounds(120, 50, 200, 30);
		t3.setBounds(120, 90, 200, 30);
		t4.setBounds(120, 130, 200, 30);

		j1.setBounds(125, 330, 80, 30);
		j2.setBounds(240, 330, 80, 30);
		j3.setBounds(350, 10, 100, 30);
		
		Font font1 = new Font("맑은 고딕", Font.BOLD, 14);
		l1.setFont(font1);
		l2.setFont(font1);
		l3.setFont(font1);
		l4.setFont(font1);
		t1.setFont(font1);
		t2.setFont(font1);
		t3.setFont(font1);
		t4.setFont(font1);

		add(p);
		setSize(500, 500);
		setTitle("회원가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		// 저장 버튼에 대한 이벤트 처리
		j1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 저장버튼
				// 1. 텍스트 상자의 값을 가지고 온다
				// 2. DB연결하기
				// 3. DB안에 넣어주기
				String id = t1.getText();
				String name = t2.getText();
				String pwd = t3.getText();
				String phoneNumber = t4.getText();
				// DB연결담당 클래스 사용
				MemberDAO dao = new MemberDAO();
				// dao안에 데이터 삽입을 담당할 메서드 구현하기
				dao.insertMember(id, name, pwd, phoneNumber);
				JOptionPane.showMessageDialog(null, "회원가입 완료되었습니다");
				Login login = new Login();
				dispose();
			}
		});
		// 취소버튼에 대한 이벤트처리
		j2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 취소버튼을 누르면 회원가입창이 닫히고 로그인 화면이 나오게 하기
				Login login = new Login();
				dispose();
			}
		});
		// ID중복체크버튼에 대한 이벤트 처리
		j3.addActionListener(new ActionListener() {
			MemberDAO dao = new MemberDAO();

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				if (dao.checkID(id) == true) {
					JOptionPane.showMessageDialog(null, "사용중인 아이디입니다");
					t1.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "사용가능한 아이디입니다");
				}
			}
		});
	}
}
