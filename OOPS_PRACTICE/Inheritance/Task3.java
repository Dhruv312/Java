// Scenario 3: Animal Kingdom
// Design an animal kingdom hierarchy with a base class called "Animal" and derived classes like "Mammal," "Bird," and "Fish." Each derived class can have specific characteristics and behaviors unique to that group of animals.

class Animal{
    protected String name;
    protected int age;

    public Animal(String name , int age){
        this.name=name;
        this.age=age;
    }

    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public void makeSound(){
        System.out.println("Animal Sound");
    }
}

class Mammal extends Animal{
    private boolean hasFur;

    public Mammal(String name , int age , boolean hasFur){
        super(name, age);
        this.hasFur = hasFur;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Hasfur: "+hasFur);
    }

    public void makeSound(){
        System.out.println("Mammal Sound");
        System.out.println();
    }
}

class Bird extends Animal{
    private boolean canFly;

    public Bird(String name , int age , boolean canFly){
        super(name, age);
        this.canFly=canFly;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Canfly: "+canFly);
    }

    public void makeSound(){
        System.out.println("Bird Sound");
        System.out.println();
    }
}

class Fish extends Animal{
    private boolean canSwim;

    public Fish(String name , int age , boolean canSwim){
        super(name, age);
        this.canSwim=canSwim;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("canSwim: "+canSwim);
    }

    public void makeSound(){
        System.out.println("Fish Sound");
        System.out.println();
    }
}

public class Task3 {
    public static void main(String[] args){
        Mammal mammal = new Mammal("Elephant", 20, true);
        Bird bird = new Bird("Parrot", 3, true);
        Fish fish = new Fish("Goldfish", 1, true);
        System.out.println("Mammal Info:");
        mammal.displayInfo();
        mammal.makeSound();
        System.out.println("Bird Info:");
        bird.displayInfo();
        bird.makeSound();
        System.out.println("Fish Info:");
        fish.displayInfo();
        fish.makeSound();
    }
}
