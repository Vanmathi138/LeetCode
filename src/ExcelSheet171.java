public class ExcelSheet171 {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            // Get the value of the current character
            int currentCharValue = columnTitle.charAt(i) - 'A' + 1;
            // Update the result by multiplying the current result by 26 and adding the current character's value
            result = result * 26 + currentCharValue;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));  // Output: 1
        System.out.println(titleToNumber("Z"));  // Output: 26
        System.out.println(titleToNumber("AA")); // Output: 27
        System.out.println(titleToNumber("AB")); // Output: 28
    }
}
