package movie;

import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import member.MemberListPage;

public class ManagerPage extends JFrame {

	public ManagerPage() {
		JPanel jpmp = new JPanel();

		Label title = new Label("Manager-Page", SwingConstants.CENTER);
		add(title);

		Font font1 = new Font("굴림", Font.BOLD, 15);
		Font font2 = new Font("굴림", Font.BOLD, 30);
		title.setFont(font2);

		title.setBounds(150, 10, 1000, 65);

		JButton j1 = new JButton("회원 관리");
		JButton j2 = new JButton("영화 정보 관리");
		JButton j3 = new JButton("예약 관리");
		JButton j4 = new JButton("로그아웃");
		add(j1);
		add(j2);
		add(j3);
		add(j4);
		j1.setBounds(165, 100, 150, 40);
		j2.setBounds(165, 150, 150, 40);
		j3.setBounds(165, 200, 150, 40);
		j4.setBounds(165, 250, 150, 40);

		add(jpmp);
		setSize(500, 450);
		setLocationRelativeTo(jpmp);
		setResizable(false);
		setTitle("관리자 페이지");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		j1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 회원관리
				dispose();
				MemberListPage memberListPage = new MemberListPage();
				
			}
		});

		j2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 영화정보관리

			}
		});

		j3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 예약관리

			}
		});

		j4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그아웃

			}
		});

	}

}
