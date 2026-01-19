package oops;
class A{
    void display(){
        System.out.println("This is class A");
    }
}
class B extends A{
    
    void display(){
        //super.display();
        System.out.println("This is class B");
    }
}
public class MethodOverriding {
    public static void main(String args[]){
        B obj = new B();
        obj.display();
        
    }
}
