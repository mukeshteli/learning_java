package oops;
interface Animal{
    
    void legs();
    
}

interface Pet extends Animal{

    void name();
}

class Dog implements  Pet{
    //we have to override all the methods of interface
    public void legs(){
        System.out.println("Dog has 4 legs");
    }
    public void name(){
        System.out.println("Dog's name is Buddy");
    }
}
public class MultipleInterface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.legs();
        dog.name();
    }
    
}
