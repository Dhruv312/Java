// Scenario 2: Animal Shelter
// In an animal shelter application, have classes like "Animal," "Cat," and "Dog" representing different types of animals. Use the instanceof operator to identify the type of animal and apply specific operations like feeding or grooming based on the animal's type.

class Animal{
    protected String name;
    
    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void feed(){
        System.out.println("Feeding animal: "+getName());
    }

    public void groom(){
        System.out.println("Grooming amimal: "+getName());
    }

}

class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    @Override
    public void feed(){
        System.out.println("Feeding Cat: "+getName()+ " with cat food.");
    }

    @Override
    public void groom(){
        System.out.println("Grooming Cat: "+getName());
    }
}

class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public void feed(){
        System.out.println("Feeding Dog: "+getName()+ " with cat food.");
    }

    @Override
    public void groom(){
        System.out.println("Grooming Dog: "+getName());
    }
}

public class Task4 {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        Animal cat = new Cat("Whiskers");
        Animal dog = new Dog("Rex");

        if (cat instanceof Cat) {
            cat.feed();
            cat.groom();
        }if (dog instanceof Dog) { 
            dog.feed();
            dog.groom();
        } if(animal instanceof Animal) {
            animal.feed();
            animal.groom();
        }
    }
}
