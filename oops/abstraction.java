package oops;
abstract class Animal{
    abstract void name();
}
class Dog extends Animal{
    void name(){
        System.out.println("Dog");
    }
}
public class abstraction {  
    public static void main(String[] args) {
        Animal a = new Dog();
        a.name();
    }       
    
}
