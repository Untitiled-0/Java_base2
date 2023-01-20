package cinema.test;

import javax.swing.JFrame;

public class JFrameTest extends JFrame{

	public JFrameTest() {
		super("J프레임 테스트");
		setSize(350,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrameTest f = new JFrameTest();
		
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
