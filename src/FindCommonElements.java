import java.util.HashSet;
import java.util.Set;

public class FindCommonElements {
    public static void main(String[] args){
        int[] num1 = {1,2,3,2,3}; //4
        int[] num2 = {2,3,4,5};   //2
        int[] num3 = {8,9,3,9};   //2
        int[] num4 = {9,6,7};     //1

        int[] result = findCommonElements(num1, num2);
        int[] result2 = findCommonElements(num3, num4);
        System.out.println("["+ result[0] +" "+result[1]+"]");
        System.out.println("["+ result2[0] +" "+result2[1]+"]");
    }

    private static int[] findCommonElements(int[] num1, int[] num2) {
        int a1 = 0;
        int a2 = 0;
        //first find whether num1 contains num2, if it is yes then increment a1
        //so we going to use set
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : num2){
            set2.add(num);
        }
        for(int num : num1){
            if(set2.contains(num)){
                a1++;
            }
        }
        for(int num : num1){
            set1.add(num);
        }
        for(int num : num2){
            if(set1.contains(num)){
                a2++;
            }
        }
        return new int[] {a1,a2};
    }
}
