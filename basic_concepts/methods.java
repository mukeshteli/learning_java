public class methods {
    public void add(int a , int b){
        System.out.println(a+b);
    }
    public int sub  (int a , int b){
        int result = a - b;
        return result;
        
    }
    public static void main(String[] args) {
        methods obj = new methods();
        obj.add(5,4);
        System.out.println(obj.sub(5,4));
    }
}
