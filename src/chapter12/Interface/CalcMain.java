package chapter12.Interface;

public class CalcMain{

	public static void main(String[] args) {
		CompleteCalc2 calc = new CompleteCalc2();
		
		int num1=10, num2=5;
		
		System.out.println("---");
		calc.description();
		System.out.println(calc.divide(num1, num2));
		
		System.out.println("---static");
	
		
		int[] arr = {1,2,3,4,5};
		System.out.println("1~5까지 합");
	
	
		System.out.println(Calc.total(arr));
		
		calc.showInfo();
	
	
	}
	
}
