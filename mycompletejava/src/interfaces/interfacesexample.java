package interfaces;
import java.util.Scanner;

public class interfacesexample {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("choose the option");
		System.out.println("1.Dog 2.Cat 3.Cow");

		int choise = scan.nextInt();

		Animal a = null;

		if (choise == 1) {
			a = new Dog();
		} else if (choise == 2) {
			a = new Cat();
		} else if (choise == 3) {
			a = new Cow();
		}
		details(a);

	}  

	public static void details(Animal a) {
		a.eat();
		a.sound();
		a.sleep();
		a.pumpsBlood();
		if (a instanceof Dog) {
			((Dog) a).length();// type casting
		}
	}

}

interface Tail {
	void length();
}

interface Heart {

	void pumpsBlood();
}

interface IAnimal extends Heart {

	abstract void eat();

	abstract public void sound();

	public void sleep();

}

abstract class Animal implements IAnimal {
	@Override
	public void sleep() {
		System.out.println("Zzz..");
	}
}

class Dog extends Animal implements Tail {

	public void eat() {
		System.out.println("bones");
	}

	public void sound() {
		System.out.println("bow bow");

	}

	@Override
	public void pumpsBlood() {
		System.out.println("Pumps 1 ltr per min");
	}

	@Override
	public void length() {
		System.out.println("tail length is 10 cm");
	}
}

class Cat extends Animal {

	public void eat() {
		System.out.println("Milk");
	}

	public void sound() {
		System.out.println("Meow Meow");

	}

	public void sleep() {
		System.out.println("ZZZ");
	}

	@Override
	public void pumpsBlood() {
		// TODO Auto-generated method stub

	}
}

class Cow extends Animal {

	public void eat() {
		System.out.println("Water");
	}

	public void sound() {
		System.out.println("Maa Maa");

	}

	public void sleep() {
		System.out.println("ZZZ");
	}

	@Override
	public void pumpsBlood() {
		// TODO Auto-generated method stub

}
}
