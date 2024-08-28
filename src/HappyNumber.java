import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        boolean result = ishappyNum(n);
        System.out.println(result);
    }
    public static boolean ishappyNum(int n) {
        // A set to store numbers we've seen to detect cycles
        Set<Integer> seenNumbers = new HashSet<>();

        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = getSumOfSquares(n);
        }

        // If n becomes 1, it's a happy number
        return n == 1;
    }

    // Helper method to calculate the sum of the squares of the digits
    private static int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
