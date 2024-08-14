public class RemoveElement27 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5};
        int val = 2;
        System.out.println("Original array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line for clarity

        int newLength = removeElement(array, val);
        System.out.println("Balance count: "+newLength);
        System.out.println("Array after removing element:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int removeElement(int[] array, int val) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != val) {
                array[k] = array[i];
                k++;
            }
        }
        return k;
    }
}
