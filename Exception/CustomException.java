package Exception;
class Age{
    void validate(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age is not valid to vote.");
        }
        else{
            System.out.println("Welcome to vote.");
        }
    }
}
public class CustomException {
    public static void main(String[] args) {
        
        Age ageValidator = new Age();
        try {
            ageValidator.validate(16);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
