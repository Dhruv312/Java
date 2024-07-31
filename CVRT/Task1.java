// Scenario 1: Animal Sounds
// In an animal sounds application, create a base class called "Animal" with a method called "makeSound" that returns an instance of the "Sound" class. Implement derived classes like "Dog" and "Cat" that override the "makeSound" method and return their specific sound objects.
class Animal{
    public Animal makeSound(){
        System.out.println("some sound");
        return this;
    }
}

class Dog extends Animal{
    public Dog makeSound(){
        System.out.println("Dog sound");
        return this;
    }
}

class Cat extends Animal{
    public Cat makeSound(){
        System.out.println("Cat sound");
        return this;
    }
}

public class Task1{
    public static void main(String[] args){
        Animal dog=new Dog();
        Animal cat=new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
