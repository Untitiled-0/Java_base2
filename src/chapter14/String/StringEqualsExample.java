package chapter14.String;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String strVal1 = new String("홍길동");
		String strVal2 ="홍길동";
		
		if(strVal1.equals(strVal2)){// 내부 값이 같은지비교
			System.out.println("같다");
		}
		if(strVal1==strVal2){// 외부 메모리가 같은지 비교
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	
	
	}
}
