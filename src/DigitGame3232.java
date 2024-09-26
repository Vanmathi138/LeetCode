public class DigitGame3232 {
    public static boolean canAliceWin(int[] nums) {
        int sumSingleDigits = 0;
        int sumDoubleDigits = 0;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
            if (num >= 1 && num <= 9) {
                sumSingleDigits += num;
            } else if (num >= 10 && num <= 99) {
                sumDoubleDigits += num;
            }
        }

        int bobSumIfAliceTakesSingleDigits = totalSum - sumSingleDigits;
        int bobSumIfAliceTakesDoubleDigits = totalSum - sumDoubleDigits;

        if (sumSingleDigits > bobSumIfAliceTakesSingleDigits || sumDoubleDigits > bobSumIfAliceTakesDoubleDigits) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3,14,7,2,3};
        boolean result = canAliceWin(nums);
        System.out.println(result);
    }
}
