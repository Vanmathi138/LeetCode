public class StringScore {
    public static int scoreOfString(String s) {
        int totalScore = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            totalScore += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        return totalScore;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println("Score of the string: " + scoreOfString(s)); // Output: 2
    }
}
