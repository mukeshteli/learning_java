package arrays;
import java.util.*;
class array{
    int arr[][] = new int [2][3];
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("enter values");
        for(int i = 0;i<2;i++){
            for(int j = 0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
    
}
public class multidimensional_array {
    public static void main(String args[]){
        array obj = new array();
        obj.input();
        System.out.println("2D array is ");
        for(int i = 0;i<2;i++){
            for(int j = 0;j<3;j++){
                System.out.print(obj.arr[i][j] + " ");
            }
            System.out.println();
        }
        
   
    }
}