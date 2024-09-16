public class Reverse2000 {
    public static String reversePrefix(String word, char ch) {
        // Find the index of the first occurrence of 'ch'
        int index = word.indexOf(ch);

        // If 'ch' is found, reverse the prefix up to 'index'
        if (index != -1) {
            // Reverse the prefix part and concatenate with the rest of the string
            StringBuilder sb = new StringBuilder(word.substring(0, index + 1));
            sb.reverse();
            return sb.toString() + word.substring(index + 1);
        }

        // If 'ch' is not found, return the original word
        return word;
    }

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        String result = reversePrefix(word, ch);
        System.out.println(result);  // Output: "dcbaefd
    }
}
