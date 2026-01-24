package Exception;

public class tryCatch {
    public static void main(String[] args){
        int a = 5 ;
        int b = 10;
        try{
            double result = (double) a/b;
            System.out.println("Result: " + result);

        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            System.out.println("Execution completed.");
        }
    }
    
}
