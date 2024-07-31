// 1. Person Class: Create a `Person` class with a parameterized constructor to store a person's name, age, and address.


class Person{
    private  String name;
    private int age;
    private String address;

    public Person(){
        name=null;
        age=0;
        address=null;
    }

    public Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public void display(){
        System.out.println("Name: "+name+", Age: "+age+", Address: "+address);
    }
}
public class Task1{
    public static void main(String[] args){
        Person p1=new Person("Meet", 21, "Mahakal");
        p1.display();
    }
}
