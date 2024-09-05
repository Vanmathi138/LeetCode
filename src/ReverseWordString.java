import java.util.*;

public class ReverseWordString {
    public static void main(String[] args) {
        String s = "Hello World Java";
        String result = reverse(s);
        System.out.println(result);
    }
    public static String reverse(String s){
        String[] word = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(word));
        return String.join(" ", word);

    }
}
