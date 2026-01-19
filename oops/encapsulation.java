package oops;
class Human{
    private int age = 20;
    private String name = "mukesh";

    public void setAge(int a){
        this.age = a;
    }
    public int getAge(){
        return age;
    }
    
    public void setName(String b){
        this.name = b;
    }
    public String getName(){
        return name;
    }
}
public class encapsulation {
    public static void main(String args[]){
        Human obj = new Human();
        obj.setAge(30);
        System.out.println("Name: " + obj.getName());
        obj.setName("random");
        System.out.println("Age: " + obj.getAge());
        
    }
}
