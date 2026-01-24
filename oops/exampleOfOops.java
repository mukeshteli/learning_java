package oops;
abstract class flower{
    abstract void flowerName();
}
class rose extends flower{
    void flowerName(){
        System.out.println("Rose");
    }

}
class jasmine extends flower{
    void flowerName(){
        System.out.println("Jasmine");
    }

}
public class exampleOfOops {
    
    public static void main(String[] args) {
       flower f = new rose();
       f.flowerName();
    }
}
