public class ReverseString344 {
    public static void main(String[] args) {
        char[] s = {'r', 'e', 'v', 'e', 'r', 's', 'e'};

        reverseString(s);
        for (char i : s) {
            System.out.print(i + ",");
        }
        System.out.println();
        char[] s1 = {'j','a','v','a'};
        reverse(s1);

    }
    private static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
    private static void reverse(char[] s) {
        StringBuilder sb = new StringBuilder(new String(s));
        sb.reverse();
        char[] reversed = sb.toString().toCharArray();

        // Copy the reversed characters back to the original array
        for (int i = 0; i < s.length; i++) {
            s[i] = reversed[i];
            System.out.print(s[i]+",");
        }
    }
}