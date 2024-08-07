// Scenario 1: Animal Hierarchy
// Create an abstract class called "Animal" with abstract methods like "eat" and "sound." Implement derived classes like "Cat" and "Dog" that provide specific implementations for these abstract methods.
abstract class Animal {
    abstract void eat();

    abstract void sound();
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat eating");
    }

    @Override
    void sound() {
        System.out.println("Cat sound");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog eating");
    }

    @Override
    void sound() {
        System.out.println("Dog sound");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.eat();
        cat.sound();
    }
}
