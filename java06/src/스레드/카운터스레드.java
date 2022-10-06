package 스레드;

import javax.swing.JOptionPane;

public class 카운터스레드 extends Thread {
	@Override // 표시@ == annotation(어노테이션, 표시)
	public void run() {
		for (int i = 20; i >= 0; i--) {
			System.out.println("카운터 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i == 0) {
				JOptionPane.showMessageDialog(null, "사용 시간이 다 되었습니다");
			}
		}
	}

}
