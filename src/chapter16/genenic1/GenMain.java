package chapter16.genenic1;

public class GenMain {

	public static void main(String[] args) {
	
		Gen gen = new Gen();
		
		// 정수형 배열
		Integer[] iArr = {1,2,3,4,5};
		
		// 더블형
		Double[] dArr = {1.1,2.2,3.3,4.4,5.5};
		
		// 문자형
		Character[] cArr = {'a','b','c','d','e'};
		
		gen.printArr(iArr);
		gen.printArr(dArr);
		gen.printArr(cArr);
	
	}
	
}
