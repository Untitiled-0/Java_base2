package cinema.test;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class JFramebgTest {

	
	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		
		JFrame frame = new JFrame("배경색 바꾸기");
		frame.setSize(300,300);
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}
	
}
