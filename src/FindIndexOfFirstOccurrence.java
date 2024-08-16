public class FindIndexOfFirstOccurrence {
    public static void main(String[] args){
        String haystack1 = "sadButSad";
        String needle1 = "sad";
        String haystack2 = "leetcode";
        String needle2 = "leets";

        int indexOfFirstOccurrence1 = firstOccurrence(haystack1, needle1);
        System.out.println(indexOfFirstOccurrence1);

        int indexOfFirstOccurrence2 = firstOccurrence(haystack2, needle2);
        System.out.println(indexOfFirstOccurrence2);

    }
    public static int firstOccurrence(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
