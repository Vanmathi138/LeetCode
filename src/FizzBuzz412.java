import java.util.*;
import java.util.Scanner;

public class FizzBuzz412 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        List<String> result = fizzBuzz(n);
        for (String i: result){
            System.out.print(i+",");
        }
    }

    private static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                result.add("FizzBuzz");
            } else if (i%3==0) {
                result.add("Fizz");
            }else if(i%5==0){
                result.add("Buzz");
            }else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
