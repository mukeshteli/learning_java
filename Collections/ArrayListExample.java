package Collections;
import java.util.*;
public class ArrayListExample {
     public static void main(String[] args){
    //     Collection<String> name = new ArrayList<String>();
    //list provides ability to work with index
        List<String> name = new ArrayList<String>();
        name.add("ram");
        name.add("shyam");
        System.out.println(name);
        name.remove("ram");

        System.out.println(name);
        
        System.out.println(name.size());
        System.out.println(name.isEmpty());
        System.out.println(name.set(0, "hari"));
        System.out.println(name.getLast());
        System.out.println(name.indexOf("hari"));
        System.out.println(name.get(0));
        System.out.println(name);
    }   
}
