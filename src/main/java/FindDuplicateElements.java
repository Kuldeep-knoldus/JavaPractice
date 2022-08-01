//3) Find duplicate element in array

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
