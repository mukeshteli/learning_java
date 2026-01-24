package Exception;
class Age{
    void validateAge(int age){
        if(age<=18){
            throw new ArithmeticException("Age is not valid to vote.");
            }
        else{
            System.out.println("you are eligible for vote.");
        }
    }}

public class ThrowException {
    public static void main(String[] args){
        Age ageValidator = new Age();
        // ageValidator.validateAge(5);
        try{ageValidator.validateAge(15);}
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        

    }}
    

