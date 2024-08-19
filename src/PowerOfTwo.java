import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = scan.nextInt();
        System.out.println(n);
        if(powerOfTwo(n)){
            System.out.println(n + " is Power of Two");
        }else {
            System.out.println(n + " is not Power of two");
        }
    }
    private static boolean powerOfTwo(int n) {
        if(n<=0){
            return false;
        }
       /* while(n%2==0){
            n=n/2;
        }
        return n==1;*/
        return (n & (n-1)) == 0; // bitwise operator
    }
}
