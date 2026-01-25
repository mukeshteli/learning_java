package Exception;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class WithBuffer {
    public static void main(String[] args) throws Exception , IOException{
        InputStreamReader reader = null;
        BufferedReader buffer = null;
        String name="";
        try{

            reader = new InputStreamReader(System.in);
            buffer = new BufferedReader(reader);
            System.out.println("Enter your name: ");
            name=buffer.readLine();
            System.out.println("Your name is: " + name);
            //int age = buffer.parseInt(buffer.readLine());

        }
        finally{
            reader.close();
            buffer.close();
        }
    }
    
}
