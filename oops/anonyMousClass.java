package oops;

@FunctionalInterface
interface Hello {
    void display();
}

public class anonyMousClass {
    public static void main(String[] args) {
        Hello obj = new Hello()
        {
            public void display() {
                System.out.println("Hello from anonymous class");
            }
            
        };
        obj.display();
        
}}
