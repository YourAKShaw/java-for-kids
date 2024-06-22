public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + sum);

        int difference = a - b;
        System.out.println("Difference of " + a + " and " + b + " is " + difference);

        int product = a * b;
        System.out.println("Product of " + a + " and " + b + " is " + product);

        double division = 0.1 * a / b;
        System.out.println("Division of " + a + " and " + b + " is " + division);

        int dividend = 17;
        int divisor = 5;
        int quotient = dividend / divisor;
        // int remainder = (dividend = (quotient * divisor));
        int quotientDivisorProduct = quotient * divisor;
        int remainder = dividend - quotientDivisorProduct;

        System.out.println("Dividend: " + dividend);
        System.out.println("Divisor: " + divisor);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        int remainder2 = dividend % divisor;

        System.out.println("Remainder using modulus operator: " + remainder2);

        // 2 ^ 4
        double pow = Math.pow(2, 4);
        System.out.println("2 ^ 4 = " + (int) pow);
    }
}