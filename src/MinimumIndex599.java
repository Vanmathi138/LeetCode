import java.util.*;

public class MinimumIndex599 {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        // List to store the result (common strings with least index sum)
        List<String> result = new ArrayList<>();
        int minIndexSum = Integer.MAX_VALUE;

        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int indexSum = j + map.get(list2[j]);

                if (indexSum < minIndexSum) {
                    minIndexSum = indexSum;
                    result.clear();
                    result.add(list2[j]);
                }
                else if (indexSum == minIndexSum) {
                    result.add(list2[j]);
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println();  // Output: ["Shogun"]
    }
}
