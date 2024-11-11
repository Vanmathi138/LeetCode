public class MoveZeros283 {
    public static void moveZeroes(int[] nums) {
        int nonZeroFoundAt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroFoundAt] = nums[i];
                nonZeroFoundAt++;
            }
        }

        for (int i = nonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] num = {1,0,5,0,6};
        moveZeroes(num);
        System.out.println("After moving zeros to the end of array:");
        for (int i : num){
            System.out.print(i+",");
        }
    }

}
