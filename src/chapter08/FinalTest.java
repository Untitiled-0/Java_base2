package chapter08;

import javax.swing.JOptionPane;

public class FinalTest {

	private static final int MAX=3; // 힙에 들어가있다
	
	public static void main(String[] args) {
		int num=0;
		
		for(int i=0; i<MAX;i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("값입력"));
			
			if(num>MAX) {
				System.out.println("입력값이 3보다 큽니다.");
			}else {
				System.out.println("입력값이 3보다 작습니다.");
			}
		}
	}
}
