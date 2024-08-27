public class Sqrt69 {
    public static int mySqrt(int x) {
        if (x == 0) return 0;  // Quick return for 0

        int left = 1, right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Use division to avoid potential overflow
            if (mid <= x / mid) {
                result = mid;  // Mid is a possible answer, save it
                left = mid + 1;  // Search in the right half
            } else {
                right = mid - 1;  // Search in the left half
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int x = 8;
        int result = mySqrt(x);
        System.out.println(result);
    }
}
