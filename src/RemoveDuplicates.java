import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = scan.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter the elements for arr1: ");
        for(int i=0;i<n;i++){
            arr1[i]=scan.nextInt();
        }
        System.out.println("Original Array of arr1: ");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        Set<Integer> result1 = removeDuplicates(arr1);
        System.out.println("After removed duplicates in arr1: ");
        for (int i: result1){
            System.out.print(i+" ");
        }
        System.out.println();

    }

    private static Set<Integer> removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        return set;
    }
}
