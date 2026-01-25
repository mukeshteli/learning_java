package Collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();
        student.put("ram", 101);
        student.put("shyam", 102);
        System.out.println(student);
        student.replace("ram", 101, 103);
        System.out.println(student);
        System.out.println(student.keySet());
        System.out.println(student.values());
        student.remove("shyam");
        System.out.println(student);

    }
}