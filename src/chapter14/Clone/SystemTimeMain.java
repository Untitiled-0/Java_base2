package chapter14.Clone;

public class SystemTimeMain {

	public static void main(String[] args) {
		
		long time1 =System.nanoTime();
		
		int sum=0;
		
		for(int i=1; i<=10000;i++) {
			sum += i;
			System.out.println(sum);
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~10000까지 의 합 : " + sum);
		System.out.println("계산에 " + (time2 -time1) + " 나노초가 소요되었습니다. ");
	}
}
