package chapter13;

import javax.swing.JOptionPane;

import chapter13.Out.In;

class Out {

	// 필드
	static int a = 1;
	//생성자
	//메소드
	//내부 클래스
	
	public class In{
		
		// 필드
		
		// 디폴드 생성자
		
		// 메소드
		
		public String Infun() {
			return (a+" 번째 Non-Static 내부 실습");
		}//inner function
	}// inner class
}// outter class

public class NonStatic {

	public static void main(String[] args) {
		
		// 바깥 클래스 객체
		Out obj1 = new Out();
			
		obj1.new In();
		
		// 내부 클래스 객체
		Out.In obj2 = obj1.new In();
		
		// 내부에 있는 메소드 
		System.out.println(obj2.Infun());
		JOptionPane.showMessageDialog(null, obj2.Infun()+"\n");
	}
}
