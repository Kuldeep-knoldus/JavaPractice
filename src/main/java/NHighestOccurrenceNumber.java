//4) Find n highest occurrence element in array 2,3,4,1,3,5,6,2,4,4,4,2 4-4,2-3 n=2

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
