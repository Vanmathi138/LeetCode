import java.util.HashMap;

public class CountElements3005 {
    public static int countElementsWithMaxFrequency(int[] nums) {
        // Step 1: Count frequencies of each element using a HashMap
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the maximum frequency
        int maxFrequency = 0;
        for (int frequency : freqMap.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        // Step 3: Sum the frequencies of elements with the maximum frequency
        int totalCount = 0;
        for (int frequency : freqMap.values()) {
            if (frequency == maxFrequency) {
                totalCount += frequency;
            }
        }

        return totalCount;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 3, 3, 2, 2, 2};
        System.out.println(countElementsWithMaxFrequency(nums1)); // Output: 3 (because 2 appears 3 times)

        int[] nums2 = {5, 5, 5, 2, 2};
        System.out.println(countElementsWithMaxFrequency(nums2)); // Output: 3 (because 5 appears 3 times)

        int[] nums3 = {7, 8, 8, 9, 9, 9};
        System.out.println(countElementsWithMaxFrequency(nums3)); // Output: 3 (because 9 appears 3 times)
    }
}
