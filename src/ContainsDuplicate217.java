import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] n1 = {1,2,1,3};
        int[] n2 = {1,2,3};
        System.out.println("Output for n1: "+FindDuplicate.containsDuplicate(n1));
        System.out.println("Output for n2: "+FindDuplicate.containsDuplicate(n2));
    }
}
class FindDuplicate{
    public static boolean containsDuplicate(int[] n){
        Set<Integer> set = new HashSet<>();
        for (int i:n){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }
}