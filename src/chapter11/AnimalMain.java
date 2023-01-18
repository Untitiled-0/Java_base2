package chapter11;

public class AnimalMain {
	public static void main(String[] args) {
//		Dog dog =new Dog();
		
//		Animal animal = null;
		
//		animal=new Dog();
//		animal.sound();
//		animal=new Cat();
//		animal=new Dog();
////		
		animalSound(new Dog());
		animalBreathe(new Dog());
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	public static void animalBreathe(Animal animal) {
		animal.breathe();
	}
}
