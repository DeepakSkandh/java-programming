public class Main {

    static void greet() {
        System.out.println("Hello, Java!");
    }

    static void displaySum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int getNumber() {
        return 100;
    }

    public static void main(String[] args) {
        greet();

        displaySum(10, 20);

        int result = multiply(5, 4);
        System.out.println("Product = " + result);

        int number = getNumber();
        System.out.println("Number = " + number);
    }
}