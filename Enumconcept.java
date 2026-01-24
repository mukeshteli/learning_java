

enum status{
    running,walking,jumping
}
public class Enumconcept {
    public static void main(String[] args) {
      
        status s1=status.running;
            System.out.println(s1);

        status s[]=status.values();
        for(status s2:s){
            System.out.println(s2);
        }


    }
}
