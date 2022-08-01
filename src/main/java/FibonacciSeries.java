//2) nth element in Fibonacci series
// This program will print incorrect result for larger values like 74
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = scanner.nextInt();
        double phi = (1 + Math.sqrt(5)) / 2;
        long result = Math.round(Math.pow(phi, number) / Math.sqrt(5));
        System.out.println(result);
    }
}

