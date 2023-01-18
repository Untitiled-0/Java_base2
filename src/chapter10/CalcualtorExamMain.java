package chapter10;
//
//public class CalcualtorExamMain {
//	public static void main(String[] args) {
//		CalPlus calplus = new CalPlus();
//		CalMinus calminus = new CalMinus();
//		
//		var n1 = 22.5f;
//		var n2 = 7.5f;
//		
//		System.out.printf("CalPlus : %2.0f\n",calplus.getResult(n1,n2));
//		System.out.printf("CalPlus : %2.0f",calminus.getResult(n1, n2));
//	}
//}

import java.util.Scanner;

public class CalcualtorExamMain {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		CalculatorExam[] calculators = {new CalPlus(), new CalMinus()};
		
		System.out.print("정수 A를 입력하세요 : ");
		int a = s.nextInt();
		System.out.print("정수 B를 입력하세요 : ");
		int b = s.nextInt();
		
	
		for(CalculatorExam ce : calculators) {
			System.out.println(ce.getClass().getSimpleName() + " : " + ce.getResult(a, b));
		}
	}
	public static float calc(CalculatorExam c1, float a, float b) {
		return c1.getResult(a, b);
	}
}