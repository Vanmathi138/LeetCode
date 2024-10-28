public class NumberOfPairs2023 {
    public static void main(String[] args) {
        String[] nums = {"777", "7", "77", "77"};
        String target = "7777";

        int result = numOfPairs(nums, target);
        System.out.println(result);  // Output: 2
    }

    private static int numOfPairs(String[] nums, String target) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    String concat = nums[i] + nums[j];
                    if(concat.equals(target)){
                        count++;
                    }
                }
            }
        }
        return count ;
    }
}