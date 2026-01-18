public class static_method {
    static void number(int a){
        System.out.println("this is a static method");
        System.out.println(a);
        a += 1;
    }
    public static void main(String[] args) {
        number(1);
    }
}
