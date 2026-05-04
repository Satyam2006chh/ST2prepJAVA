import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 1: Count Frequency of Elements (HashMap)
        // Given an array, count how many times each element appears.
        // ─────────────────────────────────────────────────────────────────────

        // int[] arr = {1, 2, 2, 3, 1, 4};
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int num : arr) {
        //     if (map.containsKey(num)) {
        //         map.put(num, map.get(num) + 1);
        //     } else {
        //         map.put(num, 1);
        //     }
        // }
        // for (int key : map.keySet()) {
        //     System.out.println(key + " -> " + map.get(key));
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 2: First Non-Repeating Element (LinkedHashMap)
        // Find the first element in the array that appears only once.
        // LinkedHashMap preserves insertion order.
        // ─────────────────────────────────────────────────────────────────────

        // int[] arr = {4, 5, 1, 2, 0, 4};
        // LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        // for (int num : arr) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // for (int key : map.keySet()) {
        //     if (map.get(key) == 1) {
        //         System.out.println("First non-repeating: " + key);
        //         break;
        //     }
        // }

    }
}
