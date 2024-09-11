public class ValidPerfectSquare367 {
    public static boolean isPerfectSquare(int num) {
        if (num < 1) {
            return false;
        }

        long low = 1;
        long high = num;

        // Binary search for the square root
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));  // Output: true

        num = 14;
        System.out.println(isPerfectSquare(num));  // Output: false
    }
}
