import java.util.Scanner;

public class NthFibonacciNumber {
    protected static final long[] array = new long[999];

    public static long nthFibonacciNo(int n) {
        long nthFibonacciNo;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (array[n] != 0) {
            return array[n];
        } else {
            nthFibonacciNo = nthFibonacciNo(n - 1) + nthFibonacciNo(n - 2);
            array[n] = nthFibonacciNo;
            return nthFibonacciNo;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = scanner.nextInt();
        System.out.println("74th Fibonacci number: " + nthFibonacciNo(number)); //1304969544928657
    }
}