import java.util.TreeSet;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {2,1};
        int result = thirdMax(nums);
        System.out.println(result);
    }
    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i:nums) {
            set.add(i);
            if (set.size() > 3) {
                set.pollFirst();
            }
        }
        if(set.size() < 3){
            return set.last();
        }else{
            return set.first();
        }

    }

}
