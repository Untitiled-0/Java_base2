package chapter12.MultiInterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		other: while (true) {

			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 가장 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요. : ");
			char input = scan.next().charAt(0);
//			int ch1 = System.in.read();
			// 문자를 아스키코드로 형변환

			Scheduler sheduler = null;
			switch (input) {
			case 'r':
			case 'R':
				System.out.println("1");
				sheduler = new RoundRobin();
				break;
			case 'l':
			case 'L':
				sheduler = new LeastJob();
				break;
			case 'p':
			case 'P':
				sheduler = new PriorityAllocation();
				break;
			case 's':
			case 'S':
				System.out.println("종료합니다.");
				break other;
			default:
				System.out.println("잘못된 입력입니다. ");
				break;
			}
			sheduler.getNextCall();
			sheduler.sendCallToAgent();
		}
	}
}
