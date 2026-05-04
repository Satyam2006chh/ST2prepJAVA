import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 1: Remove Duplicates (Preserve Order)
        // Given an array of integers, remove duplicates using a Set
        // and print the elements in the same order as they appeared.
        // ─────────────────────────────────────────────────────────────────────

        // int[] arr = {4, 2, 5, 2, 3, 4, 1};
        // // same order required → LinkedHashSet
        // Set<Integer> set = new LinkedHashSet<>();
        // for (int nums : arr) {
        //     set.add(nums);
        // }
        // for (int num : set) {
        //     System.out.println(num);
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 2: Find Common Elements Between Two Arrays
        // Given two arrays, find the common elements between them.
        // ─────────────────────────────────────────────────────────────────────

        // int[] arr1 = {1, 2, 3, 4, 5};
        // int[] arr2 = {3, 4, 5, 6, 7};
        // // Add all arr1 elements into set1
        // Set<Integer> set1 = new HashSet<>();
        // for (int nums : arr1) {
        //     set1.add(nums);
        // }
        // // Iterate arr2 and check if set1 contains the element
        // Set<Integer> set2 = new HashSet<>();
        // for (int num : arr2) {
        //     if (set1.contains(num)) {
        //         set2.add(num);
        //     }
        // }
        // for (int num : set2) {
        //     System.out.println(num);
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 3: Find First Duplicate Element
        // Iterate over the array. If element is already in set → it's the first duplicate.
        // ─────────────────────────────────────────────────────────────────────

        // int[] arr = {3, 1, 4, 2, 5, 3, 2};
        // Set<Integer> set = new HashSet<>();
        // for (int num : arr) {
        //     if (set.contains(num)) {
        //         System.out.println(num);
        //         return;
        //     }
        //     set.add(num);
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 4: Union of Two Arrays
        // Add all elements from both arrays into one set → duplicates removed automatically.
        // ─────────────────────────────────────────────────────────────────────

        // int[] arr1 = {1, 2, 3};
        // int[] arr2 = {3, 4, 5};
        // Set<Integer> union = new HashSet<>();
        // for (int num : arr1) {
        //     union.add(num);
        // }
        // for (int num : arr2) {
        //     union.add(num);
        // }
        // System.out.println("Union: " + union);


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 5: Check if Array is Subset of Another
        // Check if all elements of arr2 are present in arr1.
        // ─────────────────────────────────────────────────────────────────────

        // int[] arr1 = {1, 2, 3, 4, 5};
        // int[] arr2 = {2, 3, 5};
        // Set<Integer> set = new HashSet<>();
        // for (int num : arr1) {
        //     set.add(num);
        // }
        // boolean isSubset = true;
        // for (int num : arr2) {
        //     if (!set.contains(num)) {
        //         isSubset = false;
        //         break;
        //     }
        // }
        // if (isSubset) {
        //     System.out.println("arr2 is subset of arr1");
        // } else {
        //     System.out.println("Not a subset");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 6: Find Missing Numbers from 1 to N
        // Add array elements to set, then check which numbers from 1 to N are missing.
        // ─────────────────────────────────────────────────────────────────────

        // int[] arr = {1, 2, 4, 5};
        // int n = 5;
        // Set<Integer> set = new HashSet<>();
        // for (int num : arr) {
        //     set.add(num);
        // }
        // for (int i = 1; i <= n; i++) {
        //     if (!set.contains(i)) {
        //         System.out.println("The missing number is: " + i);
        //     }
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 7: Find K Numbers Closest to Target
        // Given nums = [1, 4, 4, 6], target = 3, K = 3
        // distance = |num - target| → pick K elements with smallest distance.
        // ─────────────────────────────────────────────────────────────────────

        // int[] nums = {1, 4, 4, 6};
        // int k = 3;
        // int target = 3;
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> result = new ArrayList<>();
        // for (int num : nums) {
        //     list.add(num);
        // }
        // for (int i = 0; i < k; i++) {
        //     int mindiff = Integer.MAX_VALUE;
        //     int closest = list.get(0);
        //     for (int num : list) {
        //         int diff = Math.abs(num - target);
        //         if (diff < mindiff || (diff == mindiff && num < closest)) {
        //             mindiff = diff;
        //             closest = num;
        //         }
        //     }
        //     result.add(closest);
        //     list.remove(Integer.valueOf(closest));
        // }
        // Collections.sort(result);
        // System.out.println(result);


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 8: Find Top K Largest Unique Elements
        // Given arr = {5, 2, 9, 5, 6, 2}, K = 3
        // Remove duplicates using Set, sort in reverse, print top K.
        // ─────────────────────────────────────────────────────────────────────

        // int[] arr = {5, 2, 9, 5, 6, 2};
        // int k = 3;
        // Set<Integer> set = new HashSet<>();
        // for (int num : arr) {
        //     set.add(num);
        // }
        // List<Integer> list = new ArrayList<>(set);
        // Collections.sort(list, Collections.reverseOrder());
        // for (int i = 0; i < k; i++) {
        //     System.out.println(list.get(i));
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 9: Find Second Smallest Unique Element
        // Given arr = {7, 2, 5, 2, 1, 1}
        // Remove duplicates, sort, then pick index 1.
        // ─────────────────────────────────────────────────────────────────────

        // int[] arr = {7, 2, 5, 2, 1, 1};
        // Set<Integer> set = new HashSet<>();
        // for (int num : arr) {
        //     set.add(num);
        // }
        // List<Integer> list = new ArrayList<>(set);
        // Collections.sort(list);
        // if (list.size() >= 2) {
        //     System.out.println("Second smallest: " + list.get(1));
        // } else {
        //     System.out.println("Not enough elements");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 10: Frequency Sort (Order Preserved)
        // Given arr = {4, 5, 6, 5, 4, 3}
        // Rule 1: Smaller frequency comes first.
        // Rule 2: If frequency is same → smaller number comes first.
        // ─────────────────────────────────────────────────────────────────────

        // int[] arr = {4, 5, 6, 5, 4, 3};
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int num : arr) {
        //     if (map.containsKey(num)) {
        //         map.put(num, map.get(num) + 1);
        //     } else {
        //         map.put(num, 1);
        //     }
        // }
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int num : arr) {
        //     list.add(num);
        // }
        // Collections.sort(list, (a, b) -> {
        //     int freqA = map.get(a);
        //     int freqB = map.get(b);
        //     if (freqA != freqB) {
        //         return freqA - freqB;
        //     }
        //     return a - b;
        // });
        // System.out.println(list);


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 11: Sort by Absolute Value
        // Given arr = {-4, 2, -1, 3}
        // Sort by absolute value. If same absolute value → smaller number first.
        // ─────────────────────────────────────────────────────────────────────

        // int[] arr = {-4, 2, -1, 3};
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int num : arr) {
        //     list.add(num);
        // }
        // Collections.sort(list, (a, b) -> {
        //     int absA = Math.abs(a);
        //     int absB = Math.abs(b);
        //     if (absA != absB) {
        //         return absA - absB;
        //     }
        //     return a - b;
        // });
        // System.out.println(list);


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 12: Sort Strings by Length
        // Given arr = {"bat", "apple", "cat", "dog"}
        // Sort by length. If same length → lexicographically (dictionary order).
        // ─────────────────────────────────────────────────────────────────────

        // String[] arr = {"bat", "apple", "cat", "dog"};
        // ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        // Collections.sort(list, (a, b) -> {
        //     if (a.length() != b.length()) {
        //         return a.length() - b.length();
        //     }
        //     return a.compareTo(b);
        // });
        // System.out.println(list);


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 13: Sort Students by Marks
        // Sort marks in descending order.
        // If same marks → smaller roll number first.
        // ─────────────────────────────────────────────────────────────────────

        // Collections.sort(list, (a, b) -> {
        //     if (a.marks != b.marks) {
        //         return b.marks - a.marks; // descending
        //     }
        //     return a.roll - b.roll;
        // });


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 14: Sort by Even-Odd + Value
        // Given arr = {5, 2, 8, 3, 1}
        // Even numbers come first, then odd. Within same group → ascending order.
        // ─────────────────────────────────────────────────────────────────────

        // int[] arr = {5, 2, 8, 3, 1};
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int num : arr) {
        //     list.add(num);
        // }
        // Collections.sort(list, (a, b) -> {
        //     if (a % 2 != b % 2) {
        //         return a % 2 - b % 2;
        //     }
        //     return a - b;
        // });
        // System.out.println(list);

    }
}
