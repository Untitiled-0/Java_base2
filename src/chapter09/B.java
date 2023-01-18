package chapter09;

public class B {

	public void method() {
		A a = new A();
		a.field="value";
		a.method();
	}
	public static void main(String[] args) {
	
		A a = new A();
		a.method();
		B b = new B();
		b.method();
	}
}
