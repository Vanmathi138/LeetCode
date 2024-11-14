public class FindTheDiff389 {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "abcde";
        char c = findTheDifference(a,b);
        System.out.println(c);
    }

    private static char findTheDifference(String a, String b) {
        int sumA = 0;
        int sumB = 0;

        for(char i : a.toCharArray()){
            sumA += i;
        }
        for(char j : b.toCharArray()){
            sumB += j;
        }
        if(sumA > sumB){
            return (char)(sumA-sumB);
        }else{
            return (char) (sumB- sumA);
        }

    }
}
