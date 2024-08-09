import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value: ");
        int x =scan.nextInt();
        System.out.print("Entered Values is: "+x);
        System.out.println();
        Solution solution = new Solution();
        boolean a = solution.isPalindrome(x);
        System.out.println(a);
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        long reversed = 0;
        int y = x;

        while (y > 0) {
            reversed = reversed * 10 + y % 10;
            y /= 10;
        }

        return reversed == x;
    }
}