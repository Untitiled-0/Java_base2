package chapter12.Interface;

public class CompleteCalc2 extends CompleteCalc1{

	@Override
	public int times(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int divide(int n1, int n2) {

		try {
			return n1/n2;
		} catch (Exception e) {
			return ERROR;
		}
	}	
	public void showInfo() {
		System.out.println("Calc Interface");
	}

	//디폴트메소드의 재정의 
	@Override
	public void description() {
		System.out.println("완벽한 계산기입니다.");
		
		// TODO Auto-generated method stub
//		super.description();
	}
	
}