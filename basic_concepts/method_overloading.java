public class method_overloading {
    void area(int a) {
        System.out.println("area of circle : " + a * a * Math.PI);
    }
    void area (int l, int b) {
        int area = l * b;
        System.out.println("area of rectangle : " + area);
    }


    public static void main(String [] args){
        method_overloading obj = new method_overloading();
        obj.area(5);
        obj.area(5, 5); }}
