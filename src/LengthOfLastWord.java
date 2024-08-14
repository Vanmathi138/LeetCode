public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int lastWordLength = 0;
        boolean foundWord = false;

        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                lastWordLength++;
                foundWord = true;
            }else if(foundWord){
                break;
            }
        }
        return lastWordLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("Output 1: "+lengthOfLastWord("Hello World"));  // Output: 5
        System.out.println("Output 2: "+lengthOfLastWord("   fly me   to   the moon  "));  // Output: 4
        System.out.println("Output 3: "+lengthOfLastWord("luffy is still joyboy"));  // Output: 6
        System.out.println("Output 4: "+lengthOfLastWord("a "));  // Output: 1
    }
}
