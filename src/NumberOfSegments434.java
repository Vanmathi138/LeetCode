public class NumberOfSegments434 {
    public static int countSegments(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        // Trim the string to remove leading and trailing spaces
        s = s.trim();

        // If the string is empty after trimming, return 0
        if (s.isEmpty()) {
            return 0;
        }

        // Split the string by spaces
        String[] segments = s.split("\\s+");

        // Return the number of segments
        return segments.length;
    }

    public static void main(String[] args) {
        String s = "Hello, my name is John";

        int result = countSegments(s);
        System.out.println(result);  // Output: 5
    }
}
