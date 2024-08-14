import java.util.HashMap;
import java.util.Map;

public class RomanToInteger13 {

    public static int romanToInt(String s) {
        // Map to store Roman numerals and their integer values
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanToIntMap.get(currentChar);

            // If the previous numeral is larger, we subtract the current numeral's value
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                // Otherwise, we add it to the total
                total += currentValue;
            }

            // Update the previous value to the current one
            prevValue = currentValue;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));     // Output: 3
        System.out.println(romanToInt("IV"));      // Output: 4
        System.out.println(romanToInt("IX"));      // Output: 9
        System.out.println(romanToInt("LVIII"));   // Output: 58
        System.out.println(romanToInt("MCMXCIV")); // Output: 1994
    }
}
