public class RepeatedSubstring459 {
    public static void main(String[] args) {
        String s = "aba";
        String f = "abab";

        System.out.println(repeatedSubstringPattern(s));
        System.out.println(repeatedSubstringPattern(f));
    }

    private static boolean repeatedSubstringPattern(String s) {

        String d = s+s;

        return d.substring(1, d.length()-1).contains(s);
    }
}
