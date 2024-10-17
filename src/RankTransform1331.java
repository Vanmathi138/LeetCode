import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransform1331 {
    public static void main(String[] args){
        int[] arr ={40,30,50,20};
        int[] result = rankTransform(arr);
        System.out.println(result);
    }

    private static int[] rankTransform(int[] arr) {
        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);

        Map<Integer, Integer> rankedArr = new HashMap<>();
        int rank = 1;

        for(int i : sortArr){
            if(!rankedArr.containsKey(i)){
                rankedArr.put(i, rank++);
            }
        }
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            result[i] = rankedArr.get(arr[i]);
        }
        return result;
    }
}
