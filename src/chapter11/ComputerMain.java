package chapter11;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer c2 = new DeskTop();
		c2.display();
//		Computer c3 = new NoteBook() {
//		};
		// NoteBook도 마찬가지로 안된다.
//		Computer c1 = new Computer() {
//			
//			@Override
//			public void typing() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void display() {
//				// TODO Auto-generated method stub
//				
//			}
//		}; // 추상클래스는 객체를 만들 수가 없다.
	}
}
