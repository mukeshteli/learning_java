package threads;
class a {
    void display() {
    for(int i = 0; i < 5; i++) {
        System.out.println("hyy " );
    }
}}
class b {
    void display() {    
    for(int i = 0; i < 5; i++) {
        System.out.println("hello " );
    }
}}

public class thread1 {
    public static void main(String[] args) {
    a obj =new a();
    b obj1 = new b();   
    obj.display();
    obj1.display();
}}
