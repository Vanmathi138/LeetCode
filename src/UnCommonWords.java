import java.util.*;
import java.util.Map;

public class UnCommonWords {
    public static String[] uncommonFromSentences(String s1, String s2){
        String[] word1 = s1.split(" ");
        String[] word2 = s2.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for(String words : word1){
            wordCount.put(words, wordCount.getOrDefault(words,0)+1);
        }
        for(String words : word2){
            wordCount.put(words, wordCount.getOrDefault(words,0)+1);
        }
        List<String> unCommonWords = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
            if(entry.getValue() == 1){
                unCommonWords.add(entry.getKey());
            }
        }
        return unCommonWords.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String s1 = "apple banana orange";
        String s2 = "banana grape orange";

        String[] result = uncommonFromSentences(s1, s2);
        System.out.println(Arrays.toString(result));
    }
}
