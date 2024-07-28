import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Dividend: ");
        int dividend = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the Divisor: ");
        int divisor = sc.nextInt();
        sc.nextLine();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println();
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}