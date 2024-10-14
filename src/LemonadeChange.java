public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bills1 = {5, 5, 5, 10, 20};
        int[] bills2 = {5,5,10,10,20};
        System.out.println(lemonadeChange(bills1));
        System.out.println(lemonadeChange(bills2));
    }
}
