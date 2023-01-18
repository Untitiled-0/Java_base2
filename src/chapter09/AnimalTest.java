package chapter09;

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
		System.out.println("사람은 책일 읽습니다. ");
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

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		
		
//		Animal animal=new Human();
//		Animal[] animal = new Animal[] {Eagle};
		
		
//		aTest.moveAnimal(animal);
//		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Human());
	}
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
