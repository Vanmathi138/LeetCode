import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String[] strs = {"flame","flow","fly"};
        String result = longestCommonPrefix(strs);
        System.out.println("Longest common Prefix is: "+result);
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0 && strs==null){
            return "";
        }
        String prefix = strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
