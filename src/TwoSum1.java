import java.util.*;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        int target = 6;
        for(int i:nums){
            System.out.print(i+" ");
        }
        System.out.println();

        int[] result = twoSum(nums, target);
        System.out.println("Result of Two Sum is: ");
        for (int i:result){
            System.out.print(i+" ");
        }
    }

    private static int[] twoSum(int[] nums, int target) {
       for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]+nums[j]==target){
                   return new int[] {i,j};
               }
           }
       }
       throw new IllegalArgumentException("Not found");
    }

}
