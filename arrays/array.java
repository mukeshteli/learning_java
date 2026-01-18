package arrays;
public class array {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        for (int a : arr){
            System.out.println(a);

        }
        System.out.println(arr.length);
        System.out.println("reversed order");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        System.out.println("changing value at index 2");
        arr[2]=56;
        for (int a : arr){
            System.out.println(a);

        }
    }
}
