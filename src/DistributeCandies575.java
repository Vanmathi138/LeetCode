import java.util.*;

public class DistributeCandies575 {
    public static int distributeCandies(int[] candyType) {

        Set<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        int maxCandiesAliceCanEat = candyType.length / 2;

        return Math.min(uniqueCandies.size(), maxCandiesAliceCanEat);
    }

    public static void main(String[] args) {
        int[] candies = {1,2,2,3};
        int result = distributeCandies(candies);
        System.out.println(result);
    }
}
