import java.util.*;

public class swap_numbers {

    public void numbers() {
        int a , b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr a number a ");
        a = sc.nextInt();
        System.out.println("enetr a number b");
        b = sc.nextInt();
        System.out.println("before swapping  a : " + a + " b : " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping a: " + a + " b: " + b); 
        sc.close();
    }
    public static void main(String[] args) {
        swap_numbers sn = new swap_numbers();
        sn.numbers();
    }
}