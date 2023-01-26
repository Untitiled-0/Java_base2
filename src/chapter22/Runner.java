package chapter22;

import java.util.Random;

public class Runner {

	public static void main(String[] args) {

		int[] playerRandom = new int[5];
		String[] playerJump = { "", "", "", "", "" };

		boolean finish = true;
		int finishPlayer = 0;

		while (finish) {
			// 도약거리
			for (int i = 0; i < playerRandom.length; i++) {
				playerRandom[i] = new Random().nextInt(4);
			}

			// 0.1 초 휴식
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// 각 선수에게 도약거리 적용
			for (int i = 0; i < playerJump.length; i++) {
				switch (playerRandom[i]) {
				case 0:
					playerJump[i] += " ";
					break;
				case 1:
					playerJump[i] += " ";
					break;
				case 2:
					playerJump[i] += "  ";
					break;
				case 3:
					playerJump[i] += "   ";
					break;
				default:
					break;
				}
			}
			System.out.println("----------------------------------------------------도착");
			System.out.println();
			for (int i = 0; i < playerJump.length; i++) {
				System.out.println(i + 1 + playerJump[i] + "옷");
				if (playerJump[i].length() >= 50) {
					finishPlayer = i + 1;
					finish = false;
				}
			}
			System.out.println();
			
			if (finish == false) {
				System.out.println("우승자는 : " + finishPlayer);
				break;
			}
		}

	}

}
