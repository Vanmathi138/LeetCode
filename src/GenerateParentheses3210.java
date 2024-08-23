import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses3210 {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        // If the current combination is complete
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // If we can still add an opening bracket
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        // If we can still add a closing bracket
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3; // Example value for n
        List<String> result = generateParenthesis(n);

        // Print the generated combinations
        System.out.println("Generated Parentheses Combinations for n = " + n + ":");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
