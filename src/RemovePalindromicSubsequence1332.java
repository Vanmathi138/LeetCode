public class RemovePalindromicSubsequence1332 {
        public static int removePalindromeSub(String s) {

            if (isPalindrome(s)) {
                return 1;
            } else {
                return 2;
            }
        }

        private static boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

    public static void main(String[] args) {
        String s1 = "ababa";
        int result = removePalindromeSub(s1);
        String s2 = "abab";
        System.out.println(removePalindromeSub(s2));
        System.out.println(result);
    }
}
