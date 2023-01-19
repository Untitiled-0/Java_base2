package chapter17.list;

import java.util.ArrayList;
import java.util.Iterator;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다. ");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람은 두발로 걷습니다. ");		
	}
	public void readBook() {
		System.out.println("사람은 책을 읽습니다. ");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다. ");		
	}
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다. ");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리 하늘을 납니다. ");		
	}
	public void flying() {
		System.out.println("독수리는 날개를 펴고 날아 다닙니다. ");
	}
}


public class AnimalTest {

	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		AnimalTest aniTest = new AnimalTest();
		
		// 업캐스팅
		System.out.println("----업캐스팅----");
		aniTest.addAnimal();
		
		// 다운캐스팅
		System.out.println("----다운캐스팅----");
		aniTest.testCasting();
		
	}
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal a : aniList) {
			a.move();
		}
	}
	public void testCasting() {
		for(int i=0; i<aniList.size();i++) {
			Animal a = aniList.get(i);
			
			if( a instanceof Human) {
				Human h = (Human)a;
				h.readBook();
			} else if( a instanceof Tiger) {
				Tiger t = (Tiger)a;
				t.hunting();;
			} else if( a instanceof Eagle) {
				Eagle e = (Eagle)a;
				e.flying();;
			}
		}
	}
	public void testCasting1() {
		
		Iterator<Animal> it = aniList.iterator();
		
		while(it.hasNext()) {
			Animal a = it.next();
			
			if(a instanceof Human) {
				((Human)a).readBook();
			}else if(a instanceof Tiger) {
				((Tiger)a).hunting();
			}else if(a instanceof Eagle) {
				((Eagle)a).flying();
			}
		}
	}

}
