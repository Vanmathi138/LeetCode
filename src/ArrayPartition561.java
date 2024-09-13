import java.util.Arrays;

public class ArrayPartition561 {
    public static int arrayPairSum(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);

        int sum = 0;
        // Step 2: Sum up the elements at even indices
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        int result = arrayPairSum(nums);
        System.out.println(result);  // Output: 4
    }
}
