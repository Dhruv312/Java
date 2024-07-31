// 2. Multilevel Inheritance Problem:
//    - Problem Statement: Create a multilevel inheritance structure with three classes: 'Animal' (base class), 'Mammal' (derived class), and 'Dog' (further derived class). The 'Animal' class should have an attribute 'species' and a method 'makeSound()'. The 'Mammal' class should add an attribute 'hasFur' and override 'makeSound()'. The 'Dog' class should add an attribute 'breed' and further override 'makeSound()' to specify the dog's sound. Use constructors to initialize attributes and ensure proper use of 'this' and 'super'.

class Animal{
    protected String species;
    
    public Animal(String species){
        this.species=species;
    }
    public void makeSound(){
        System.out.println("animal sound...");
    }
}

class Mammal extends Animal{
    protected boolean hasFur;

    public Mammal(String species,boolean hasFur){
        super(species);
        this.hasFur=hasFur;
    }

    public void makeSound(){
        System.out.println("mammal sound...");
    }
}

class Dog extends Mammal{
    private String breed;

    public Dog(String species,boolean hasFur,String breed){
        super(species, hasFur);
        this.breed=breed;
    }

    public void makeSound(){
        System.out.println("Brak Brak...");
    }

    public void displayInfo(){
        System.out.println("Species: "+species);
        System.out.println("Hasfur "+hasFur); 
        System.out.println("Breed: "+breed);
    }
}

public class Task2 {
    public static void main(String[] args){
        Dog d1=new Dog("Canine", true, "Golden Retriever");
        d1.makeSound();
        d1.displayInfo();
    }
}
