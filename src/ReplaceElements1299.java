import java.util.Arrays;

public class ReplaceElements1299 {
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxRight = -1;
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, current);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] result = replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }
}
