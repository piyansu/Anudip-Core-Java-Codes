package week1_day4;

class Animal {
	public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalDemo{
	public static void main(String[] args) {
		Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        System.out.println("Animal Sounds: ");
        animal.makeSound();

        System.out.println("\nDog Sound:");
        dog.makeSound();

        System.out.println("\nCat Sound:");
        cat.makeSound();
	}
}