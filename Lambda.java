@FunctionalInterface
interface Hello {
    // void display();
    int add(int x, int y);
}

public class Lambda {
    public static void main(String[] args) {
        //Hello obj = ()-> {System.out.println("Hello from anonymous class");}
        Hello obj1 = (x,y) -> x + y;
        System.out.println(obj1.add(1,2));
            
        
        //obj.display();
        
}}
