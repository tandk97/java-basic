package 스레드;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드그래픽 extends JFrame {
	// 클래스 전체에서 접근해서 사용하려면,
	// 선언을 클래스 아래에 해서 전역변수로 만들어주어라!!
	JLabel count, image, day;
	카운터스레드2 count2;
	시각스레드2 day2;
	이미지스레드2 image2;

	public 스레드그래픽() {
		getContentPane().setBackground(Color.GREEN);
		// setBackground(Color.GREEN);
		setSize(800, 300);
		count = new JLabel("카운터");
		image = new JLabel("이미지");
		day = new JLabel("시각");
		Font font = new Font("궁서", Font.BOLD, 30);
		count.setFont(font);
		day.setFont(font);

		add(count, BorderLayout.WEST);
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);
		setVisible(true);

		count2 = new 카운터스레드2();
		day2 = new 시각스레드2();
		image2 = new 이미지스레드2();

		count2.start();
		day2.start();
		image2.start();

	}

	public static void main(String[] args) {
		// main이 static이기 때문에
		// static이 없는 생성자 메서드를 활용하자.
		스레드그래픽 name = new 스레드그래픽();
	}

	// 이너클래스(내부클래스)
	// 외부 다른 클래스에서 이 내부클래스를 직접 객체 생성불가
	// 변수를 공유할 목적으로 클래스내에 다른 클래스를 끼워넣을 수 있음.
	// 잘 사용되지는 않음.
	public class 카운터스레드2 extends Thread {
		@Override // 표시@ == annotation(어노테이션, 표시)
		public void run() {
			for (int i = 10; i >= 0; i--) {
				// System.out.println("카운트 >> " + i);
				count.setText("카운트 >> " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 밀리세켠즈 1000 == 1초
					// 자바프로그램에서 외부자원(db, cpu, network, file)을 연결할 때는
					// 프로그램이 중단되는 위험한 상황으로 인식되어
					// 그런 상황이 발생했을 때 어떻게 할지를 반드시!! 써주어야함.
					// 예외처리
				if (i == 0) {
					JOptionPane.showMessageDialog(null, "사용시간이 다 되었습니다. 퇴실부탁드립니다.");
					image2.stop(); // 스레드 멈춤
					day2.stop(); // 스레드 멈춤
				}
			}
		}
	}

	public class 이미지스레드2 extends Thread {
		@Override // 표시@ == annotation(어노테이션, 표시)
		public void run() {
			String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int i = 0; i < list.length; i++) {
				// System.out.println("이미지 >> " + list[i]);
				// image.setText("이미지 >> " + list[i]);
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 밀리세켠즈 1000 == 1초
					// 자바프로그램에서 외부자원(db, cpu, network, file)을 연결할 때는
					// 프로그램이 중단되는 위험한 상황으로 인식되어
					// 그런 상황이 발생했을 때 어떻게 할지를 반드시!! 써주어야함.
					// 예외처리
			}
		}
	}

	public class 시각스레드2 extends Thread {
		@Override // 표시@ == annotation(어노테이션, 표시)
		public void run() {
			for (int i = 0; i < 500; i++) {
				Date date = new Date();
				// System.out.println("시각 >> " + date);
				day.setText("시각 >> " + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}