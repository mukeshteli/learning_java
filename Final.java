final class calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class AdvancedCalculator extends calculator {
    // This will cause a compilation error because calculator is final
    public int multiply(int a, int b) {
        return a * b;
    }
}
public class Final {
    public static void main(String[] args) {
        final int x = 10;
        // x = 20; // This line would cause a compilation error because x is final
        System.out.println("The value of x is: " + x);
    }
}
