package Strings;

public class string {
    public static void main(String[] args) {
        String name = new String("xyz");
        System.out.println(name);

        System.out.println("generating hashcode for name :" + name.hashCode());
        System.out.println(name.toUpperCase());
        System.out.println(name.concat("hy"));

    }
}
