import java.util.HashSet;

public class KeepMultiply2154 {
    public static int findFinalValue(int[] nums, int original) {

        HashSet<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        while (numSet.contains(original)) {
            original *= 2;
        }
        return original;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 8};
        int original = 2;
        int result = findFinalValue(nums, original);
        System.out.println("Final value of original: " + result);
    }
}
