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

        int[] nums1 = {1, 4, 4, 2, 2};
        System.out.println(countElementsWithMaxFrequency(nums1)); 

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(countElementsWithMaxFrequency(nums2));

        int[] nums3 = {1, 1, 2, 4, 4, 4};
        System.out.println(countElementsWithMaxFrequency(nums3));
    }
}
