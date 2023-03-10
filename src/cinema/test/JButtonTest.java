package cinema.test;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class JButtonTest extends JFrame {

	public JButtonTest() {
		super("버튼테스트");
		JPanel buttonPanel = new JPanel();
		//button이름을 가진 버튼 생성
		JButton btn = new JButton("Button");
		buttonPanel.add(btn);
		
		ImageIcon icon1 = new ImageIcon(".\\src\\cinema\\test\\red.png");
		ImageIcon icon2 = new ImageIcon(".\\src\\cinema\\test\\blue.png");
		JToggleButton tgbutton1 = new JToggleButton(icon1);
		JToggleButton tgbutton2 = new JToggleButton(icon2);
		buttonPanel.add(tgbutton1);
		buttonPanel.add(tgbutton2);
		
		// 취미 레이블
		JLabel lblHobby = new JLabel("취미");
	
		//체크 박스
		JCheckBox check1 = new JCheckBox("운동");
		JCheckBox check2 = new JCheckBox("독서");
		JCheckBox check3 = new JCheckBox("영화감상");
		buttonPanel.add(lblHobby);		
		buttonPanel.add(check1);		
		buttonPanel.add(check2);		
		buttonPanel.add(check3);		
		
		// 성별 레이블
		JLabel lblMale = new JLabel("성별");
		
		JRadioButton rb1 = new JRadioButton("남자");
		JRadioButton rb2 = new JRadioButton("여자");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		buttonPanel.add(lblMale);
		buttonPanel.add(rb1);
		buttonPanel.add(rb2);
		
		add(buttonPanel);
		
		setLocation(150,200);
		setSize(242,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
//		add
	
	}
	public static void main(String[] args) {
		new JButtonTest();
	}
}
