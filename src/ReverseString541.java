public class ReverseString541 {
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < s.length(); i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, s.length() - 1);  // reverse at most k characters

            // Reverse the first k characters in the current 2k block
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "adbcefghij";
        int k = 3;
        String result = reverseStr(s,k);
        System.out.println(result);  // Output: "bacdfeg"
    }
}

