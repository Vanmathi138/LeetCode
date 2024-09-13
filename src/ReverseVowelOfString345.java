public class ReverseVowelOfString345 {
    // Helper function to check if a character is a vowel
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static String reverseVowels(String s) {
        // Convert the string to a character array for easier manipulation
        char[] charArray = s.toCharArray();
        int left = 0, right = charArray.length - 1;

        // Two-pointer approach to swap vowels
        while (left < right) {
            // Move the left pointer to the next vowel
            while (left < right && !isVowel(charArray[left])) {
                left++;
            }
            // Move the right pointer to the previous vowel
            while (left < right && !isVowel(charArray[right])) {
                right--;
            }
            // Swap the vowels at left and right
            if (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }

        // Convert the character array back to a string and return it
        return new String(charArray);
    }

    public static void main(String[] args) {

        String result = reverseVowels("hello");
        System.out.println(result); // Output: "holle"

        result = reverseVowels("leetcode");
        System.out.println(result); // Output: "leotcede"
    }
}
