package chapter13;

public class AnonyInner {

	public void test() {
		new TestInter() {//TestItner ti = new TestInter -> ti.printDat()
			
			@Override
			public void printData() {
				System.out.println("화욜팅!!");
			}// 추상메소드 구현
		}.printData(); // 호출 가능 // 이벤트에서는 저렇게 호출해서 넘길 수 있다. 
	}

	public static void main(String[] args) {
		AnonyInner in = new AnonyInner();
		in.test();
	}
}
