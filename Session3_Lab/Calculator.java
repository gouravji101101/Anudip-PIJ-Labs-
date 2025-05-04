package Session3_Lab;

public class Calculator {

    // First add() method
    public int add(int a, int b) {
        return a + b;
    }

    // Second add() method
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Third add() method
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 and 3 (int): " + calc.add(2, 3));
        System.out.println("Sum of 1, 2 and 3 (int): " + calc.add(1, 2, 3));
        System.out.println("Sum of 2.5 and 3.5 (double): " + calc.add(2.5, 3.5));
    }
}
