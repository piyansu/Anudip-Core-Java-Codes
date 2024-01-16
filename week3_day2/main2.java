package week3_day2;

import java.util.Scanner;

//Superclass Animal
class Animal {
 // Method to make a sound
 void makeSound() {
     System.out.println("The animal makes a sound.");
 }
}

//Subclass Dog extending Animal
class Dog extends Animal {
 // Override makeSound method for Dog
 void makeSound() {
     System.out.println("The dog barks.");
 }
}

//Subclass Cat extending Animal
class Cat extends Animal {
 // Override makeSound method for Cat
 void makeSound() {
     System.out.println("The cat meows.");
 }
}

//Main class to demonstrate method overriding
public class main2 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Creating objects of each class
     Animal genericAnimal = new Animal();
     Dog d1 = new Dog();
     Cat c1 = new Cat();

     // Displaying sounds
     System.out.println("Generic Animal Sound:");
     genericAnimal.makeSound();

     System.out.println("\nDog Sound:");
     d1.makeSound();

     System.out.println("\nCat Sound:");
     c1.makeSound();

     scanner.close();
 }
}

