public class MoveZeros283 {
    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        // Move all the non-zero elements to the beginning of the array.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i];
                lastNonZeroFoundAt++;
            }
        }

        // Fill the rest of the array with 0s.
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] num = {1,0,5,0,6};
        moveZeroes(num);
        for (int i : num){
            System.out.print(i+" ");
        }
    }

}
