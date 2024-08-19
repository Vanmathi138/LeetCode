import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int k = 3;
        boolean b = containsDuplicates(nums1,k);
        System.out.println(b);
    }

    private static boolean containsDuplicates(int[] nums1, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                int pre = map.get(nums1[i]);
                if(i-pre <= k){
                    return true;
                }
            }
            map.put(nums1[i],i);
        }
        return false;
    }
}
