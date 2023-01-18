package chapter13;

import java.util.Scanner;

public class EnumMain {

	public enum Item{
		Start, Pause, Exit
		
	}
	public static void main(String[] args) {
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자를 입력하세요. [0:게임시작, 1:일시정지, 2:게임종료] : ");
			
			int n = scan.nextInt();
			
			Item start = Item.Start;
			Item pause = Item.Pause;
			Item exit = Item.Exit;
			
			if(n == start.ordinal()) { // enum ordinal - 숫자
				System.out.println("게임이 시작함");
			} else if(n == pause.ordinal()) {
				System.out.println("게임이 일시정지됩니다.");
			} else {
				System.out.println("게임이 종료굅니다.");
				return;
			}
		}
	}
}
