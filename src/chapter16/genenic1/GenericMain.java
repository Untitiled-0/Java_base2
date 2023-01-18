package chapter16.genenic1;

public class GenericMain {

	public static<T, V> double makeReckangle(Point<T, V> p1, Point<T, V> p2) {
		
		double left= ((Number)p1.getX()).doubleValue(); // number로 캐스팅을 하면 doubleValue가 있다. 
		// number이란 숫자 관련
		double top= ((Number)p1.getY()).doubleValue();

		double right= ((Number)p2.getY()).doubleValue();
		double bottom= ((Number)p2.getY()).doubleValue();
		
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);// 오토박싱
		Point<Integer, Double> p2 = new Point<>(10,10.0);
	
		double rect = GenericMain.makeReckangle(p1, p2);
		//double rect = GenericMain.<Integer, Double>makeReckangle();		

	
		System.out.println("두 point로 만들어진 사격형의 넓이 : "+rect+"입니다.");
		
	
	
	
	}
	
}
