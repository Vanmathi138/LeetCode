public class RotateString796 {
    public static void main(String[] args) {
        String s = "rose";
        String goal = "eros";
        boolean result = rotateString(s, goal);
        System.out.print("Result: "+result);
    }

    private static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        for (int i=0; i<s.length(); i++){
            s = s.substring(1) + s.charAt(0);

            if(s.equals(goal)) return true;
        }
        return false;
        /*String combine = s+s;     // roserose
        return combine.contains(goal);*/
    }
}
