package 연습;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class 배경색변경 implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		String R = JOptionPane.showInputDialog("배경색 입력 R값");
		String G = JOptionPane.showInputDialog("배경색 입력 G값");
		String B = JOptionPane.showInputDialog("배경색 입력 B값");
		JOptionPane.showMessageDialog(null,"RGB값은" + R + ", " + G +", " + B + ", ");
		int r = Integer.parseInt(R);
		int g = Integer.parseInt(G);
		int b = Integer.parseInt(B);
		
	}

}
