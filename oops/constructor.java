package oops;

class concept {
    public concept(){
        System.out.println("This is a constructor ");
    }

    public concept(int a){
        System.out.println("This is a parameterized constructor : " + a);
    }}

    
public class constructor {
    public static void main(String args[]){
        concept obj = new concept();
        concept obj1 = new concept(5);
    }}
