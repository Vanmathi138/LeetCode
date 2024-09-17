public class NumberOfPairs2023 {
    public static String restoreString(String s, int[] indices) {
        char[] shuffled = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            shuffled[indices[i]] = s.charAt(i);
        }

        return new String(shuffled);
    }

    public static void main(String[] args) {
        int[] indices = {3, 1, 2, 0};
        String s = "code";
        String result = restoreString(s,indices);
        System.out.println(result);  // Output: "edoc"
    }
}
