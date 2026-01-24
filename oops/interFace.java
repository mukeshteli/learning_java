package oops;
interface Animal{
    int animalAge=5; // by default static and final
    void legs();
    void name();

}
class Dog implements Animal{
    //we have to override all the methods of interface
    public void legs(){
        System.out.println("Dog has 4 legs");
    }
    public void name(){
        System.out.println("Dog's name is Buddy");
    }
}
public class interFace {
    public static void main(String[] args) {
        System.out.println("Animal Age: " + Animal.animalAge); //we directly called it because it is static variable by default
        Dog dog = new Dog();
        dog.legs();
        dog.name();
    }
}
