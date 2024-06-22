// import Scanner class from util package from the java library
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your second number: ");
        int m = sc.nextInt();
        sc.nextLine();

        int sum = n + m;

        System.out.println("Sum of " + n + " and " + m + " is " + sum);
    }
}