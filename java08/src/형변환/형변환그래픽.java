package 형변환;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 형변환그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setLayout(new FlowLayout());
		
		JButton b = new JButton("나는 버튼");
		JTextField t = new JTextField(10);
		t.setText("나는 텍스트");
		JLabel l = new JLabel("나는 라벨");
		
		f.add(b); // Component <--- Button
		f.add(t);
		f.add(l);
		
		f.setVisible(true);

	}

}
