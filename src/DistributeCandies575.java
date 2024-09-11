import java.util.*;

public class DistributeCandies575 {
    public int distributeCandies(int[] candyType) {

        Set<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        int maxCandiesAliceCanEat = candyType.length / 2;

        return Math.min(uniqueCandies.size(), maxCandiesAliceCanEat);
    }
}
