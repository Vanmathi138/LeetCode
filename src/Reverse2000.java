public class Reverse2000 {
    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);

        if (index != -1) {
            StringBuilder sb = new StringBuilder(word.substring(0, index + 1));
            sb.reverse();
            return sb.toString() + word.substring(index + 1);
        }

        return word;
    }

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        String result = reversePrefix(word, ch);
        System.out.println(result);  // Output: "dcbaefd
    }
}
