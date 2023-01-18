package chapter11;

public class MainBoard {

	public static void main(String[] args) {
		
		// 기본 게임 1단계
		Player player = new Player();
		player.play(1);
		
		// 레벨 2단계
		AdvencedLevel adLevel = new AdvencedLevel();
		player.upgradeLevel(adLevel);
		player.play(2);
		
		
		// 레벨 3단계
		SuperLevel spLevel = new SuperLevel();
		player.upgradeLevel(spLevel);
		player.play(3);
	}
}
