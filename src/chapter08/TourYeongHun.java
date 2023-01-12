package chapter08;

import java.util.Scanner;

public class TourYeongHun {
	public static void main(String[] args) {
		boolean run = true;

		System.out.print("관광객 수 : ");
		Scanner s = new Scanner(System.in);

		int person = s.nextInt();
		GuideYeongHun guide = new GuideYeongHun(person);
		guide.List();

		while (run) {

			guide.Disp();

			int in = s.nextInt();

			switch (in) {
			case 1:
				guide.Info();
				break;
			case 2:
				guide.Point();
				break;
			case 3:
				run = false;
				System.out.println("종료하셨습니다. ");
				break;
			default:
				System.out.println("숫자를 잘못 선택하셨습니다. ");
				break;
			}
		}
	}
}
