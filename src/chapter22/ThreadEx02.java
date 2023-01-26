package chapter22;

public class ThreadEx02 extends Thread{

	private int[] temp;

	public ThreadEx02() {
		temp = new int[10];
		for(int i=0;i<temp.length;i++) {
			temp[i]=i;
		}
	}

	@Override
	public void run() {
		for(int i : temp) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("temp : "+i);
		}
	}
	
	
	
	
}