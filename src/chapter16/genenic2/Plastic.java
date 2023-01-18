package chapter16.genenic2;

import chapter16.genenic1.Material;

public class Plastic extends Material {

	// 3D print
	public String toString() {
		return "재료는 Plastic입니다.";
	}
	
	public void doprinting() {
		System.out.println("Plastic 재료로 출력합니다. ");
	}
	
}
