# JavaPractice
## Questions:
#### 1) Prime Number
  ```
import java.util.Scanner;

public class PrimeNo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}  
  ```
#### 2) nth element in Fibonacci series
```
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
```
#### 3) Find duplicate element in array
```
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = scanner.nextInt();

        System.out.print("Enter " + size + " elements : ");
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for (int j : array) {
            if (set.contains(j)) {
                System.out.print(j + " ");
            } else set.add(j);
        }
    }
}
```
#### 4) Find n highest occurrence element in array 2,3,4,1,3,5,6,2,4,4,4,2 4-4,2-3 n=2
```
import java.util.*;

public class NHighestOccurrenceNumber {
    static void printNMostFrequentNumber(int[] arr, int n, int k) {

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet());

        list.sort((o1, o2) -> {
            if (Objects.equals(o1.getValue(), o2.getValue()))
                return o2.getKey() - o1.getKey();
            else
                return o2.getValue() - o1.getValue();
        });

        for (int i = 0; i < k; i++)
            System.out.println("Element "+list.get(i).getKey() + " occurred " + list.get(i).getValue() + " times");
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 3, 5, 6, 2, 4, 4, 4, 2};
        int n = arr.length;
        int k = 2;
        printNMostFrequentNumber(arr, n, k);
    }
}
```
