package Collections;
import java.util.*;
public class SetExamples {
     public static void main(String[] args){
    
        Set<String> name = new HashSet<String>();
        name.add("ram");
        name.add("shyam");
        name.add("shyam");
        System.out.println(name);
        System.out.println("size of arraywith duplicate entries " +name.size());
        name.remove("ram");
        System.out.println("size of array without duplicate entries " +name.size());
        System.out.println(name);
        name.remove("shyam");
        System.out.println(name.size());
        System.out.println(name.isEmpty());
        
        System.out.println(name);
    }   
}
