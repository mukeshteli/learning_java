package factorial;
import java.util.*;
public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find factor");
        int a=sc.nextInt();
        int fact = 1; 
        for (int i = a; i>=1; i-- ){
            fact  = fact * i;
        }
        System.out.println("factorial of " + a + " is " + fact);
        sc.close();
    }
}