import java.util.HashMap;

public class CountElements3005 {
    public static int countElementsWithMaxFrequency(int[] nums) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        for (int frequency : freqMap.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }
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
        System.out.println(countElementsWithMaxFrequency(nums1)); 

        int[] nums2 = {5, 5, 5, 2, 2};
        System.out.println(countElementsWithMaxFrequency(nums2));

        int[] nums3 = {7, 8, 8, 9, 9, 9};
        System.out.println(countElementsWithMaxFrequency(nums3));
    }
}
