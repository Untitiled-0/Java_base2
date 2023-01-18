package chapter09;

public class ChildMain {

	public static void main(String[] args) {
		Child c = new Child();
		
		c.method2();
		c.method1();
		c.method3();
		
		System.out.println();
		
		Parent p = new Parent();
		p.method1();
		p.method2();
		
		System.out.println();	
		Parent p2 =c;
		p2.method1();
		p2.method2();
	}
}
