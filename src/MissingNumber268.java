public class MissingNumber268 {
    public static void main(String[] args) {
        int[] arr = {0,2};
        int result = findMissingNum(arr);
        System.out.println(result);
    }
    public static int findMissingNum(int[] arr){
        int n = arr.length;
        int expectedNum = n*(n+1)/2;
        int actualSum = 0;
        for(int i:arr){
            actualSum+=i;
        }
        return expectedNum-actualSum;
    }
}
