package chapter16.genenic2;

import chapter16.genenic1.Material;

public class Water extends Material{

	@Override
	public String toString() {
		return "재료는 Water입니다.";
	}
	
	@Override
	public void doprinting() {
		System.out.println("물 재료는 불가능합니다.");
		
	}
}
