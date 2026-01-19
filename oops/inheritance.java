package oops;
class parent{
    public void display(){
        System.out.println("this is parent class");;
    }
    public parent(){
        System.out.println("this is parent constructor");
    }
    public parent(int a ){
        System.out.println("this is parent constructor with parameter: " + a + " called using super method");
    }
}
class child extends parent{
    public void display(){
        super.display();
        System.out.println("this is child class");
    }
    public child(){
        // automatically have a super() which invokes deafault parent constructor
        
        super(5);
        System.out.println("this is child constructor");
    }
}
public class inheritance {

    public static void main(String[] args) {
        child obj = new child();
        //obj.display();
    }
}
