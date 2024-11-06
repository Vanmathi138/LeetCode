import java.util.*;

public class TwoSneakyNumbers3289 {
    private static int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> countNums = new HashMap<>();
        List<Integer> sneakyNums = new ArrayList<>();

        for (int i : nums) {
            countNums.put(i, countNums.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countNums.entrySet()) {
            if (entry.getValue() > 1) {
                sneakyNums.add(entry.getKey());
            }
        }
        int[] result = sneakyNums.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 4, 3, 2};
        System.out.println(Arrays.toString(getSneakyNumbers(nums)));
        List<Integer> n = new ArrayList<>();
        n.add(1); n.add(2);n.add(3);
        int count =0;
        for(int a : n){
            count+=a;
        }
        System.out.println(count);
    }
}
