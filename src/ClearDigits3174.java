import java.util.Stack;

public class ClearDigits3174 {
    public static void main(String[] args) {
        String s = "abc7r8hhji8yj";
        String result = clearDigits(s);
        System.out.println(result);
    }
    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        // Traverse the string character by character
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // If we encounter a digit, pop the stack (remove the closest non-digit character)
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // If it's a non-digit character, push it onto the stack
                stack.push(c);
            }
        }

        // Build the result string from the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}
