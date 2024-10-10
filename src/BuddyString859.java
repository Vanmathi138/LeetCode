public class BuddyString859 {
    public static boolean buddyStrings(String s, String goal) {
        // Step 1: If the lengths are not equal, return false
        if (s.length() != goal.length()) {
            return false;
        }

        // Step 2: If the strings are equal, check for duplicate characters
        if (s.equals(goal)) {
            // Check if there is any character that appears more than once
            int[] count = new int[26]; // Assuming the input consists of lowercase English letters
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
                if (count[c - 'a'] > 1) {
                    return true; // If any character appears more than once, return true
                }
            }
            return false; // No duplicate characters, can't swap to stay the same
        }

        // Step 3: Find the positions where s and goal differ
        int first = -1, second = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false; // More than two differences, return false
                }
            }
        }

        // Step 4: Check if swapping the mismatched characters will make the strings equal
        return (second != -1 && s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first));
    }

    public static void main(String[] args) {

        System.out.println(buddyStrings("ab", "ba")); // true
        System.out.println(buddyStrings("ab", "ab")); // false
        System.out.println(buddyStrings("aa", "aa")); // true
        System.out.println(buddyStrings("abcd", "badc")); // false
    }
}
