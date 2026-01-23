package oops;
//compile time polymorphism
class Addition{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
}
public class polymorphism {
    public static void main(String[] args) {

        Addition obj = new Addition();
        System.out.println(obj.add(11, 11));
        System.out.println(obj.add(12.3, 12.6));}}

