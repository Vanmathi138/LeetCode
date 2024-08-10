import java.util.*;

public class StringPalindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String word = scan.nextLine();
        boolean result = isPalindrome(word);
        if(result){
            System.out.println("The given word is a Palindrome: "+word);
        }else {
            System.out.println("The given word is Not Palindrome: "+word);
        }

    }

    private static boolean isPalindrome(String word) {
        word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left =0;
        int right = word.length()-1;
        while (left<right){
            if(word.charAt(left)!=word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
