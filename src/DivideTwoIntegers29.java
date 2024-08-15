public class DivideTwoIntegers29 {
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        return dividend / divisor;
    }
    public static void main(String[] args){
        int dividend = 10;
        int d = 3;
        int dividend2 = 12;
        int d2 = 5;
        int result1 = divide(dividend,d);
        System.out.println("Result 1: "+result1);
        int result2 = divide(dividend2,d2);
        System.out.println("Result 2: "+result2);
    }
}
