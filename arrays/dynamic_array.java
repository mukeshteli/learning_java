package arrays;

import java.util.Scanner;

public class dynamic_array {
    public static void main(String args[]){
        int arr [] = new int[5];
        for(int a : arr){
            //default values are zero
            System.out.println(a);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("adding values");
        for(int i=0;i<arr.length;i++){
            System.out.println("enter value for index " + i);
            arr[i]= sc.nextInt();}

        System.out.println("new array");
        for(int a : arr){
            System.out.print(a + ", ");
        }
        sc.close();

    }
    
}
