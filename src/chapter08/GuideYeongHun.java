package chapter08;

import java.util.Scanner;

public class GuideYeongHun {
	
	static String point;
	GuestYeongHun[] guest;
	Scanner s = new Scanner(System.in);

	public GuideYeongHun(int n) {
		point = "발리";
		guest = new GuestYeongHun[n];

		// 객체생성
		for (int i = 0; i < guest.length; i++) {
			guest[i] = new GuestYeongHun();
		}
	}

	public GuideYeongHun(GuestYeongHun[] guest) {
		this.guest = guest;
	}

	public void List() {
		for (int i = 0; i < guest.length; i++) {
			System.out.print((i + 1) + ". 이름 : ");
			guest[i].setName(s.next());
			System.out.print((i + 1) + ". 성별 : ");
			guest[i].setGender(s.next());
		}
	}

	public void Point() {
		System.out.print("어디로 변경하시겠습니까 ? ");
		point = s.next();
		System.out.println(point + "로 목적지 변경 ");
		System.out.println();
	}

	public void Info() {
		for (int i = 0; i < guest.length; i++) {
			System.out.println("---------------");
			System.out.print((i + 1) + ". 이름 : " + guest[i].getName() + "\n");
			System.out.print((i + 1) + ". 성별 : " + guest[i].getGender() + "\n");
			System.out.print((i + 1) + ". 목적지 : " + guest[i].getPoint() + "\n");

		}
	}
	public void Disp() {
		System.out.println("========================================");
		System.out.println("1. 관광객 정보 ");
		System.out.println("2. 목적지 변경 ");
		System.out.println("3. 종료 ");
		System.out.print("선택 > ");
	}

}
