public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');

        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(lengthOfLastWord("Hello World"));  // Output: 5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));  // Output: 4
        System.out.println(lengthOfLastWord("luffy is still joyboy"));  // Output: 6
        System.out.println(lengthOfLastWord("a "));  // Output: 1
    }
}
