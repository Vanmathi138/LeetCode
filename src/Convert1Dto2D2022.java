

public class Convert1Dto2D2022 {
    public static int[][] construct2DArray(int[] original, int m, int n) {

        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[i * n + j];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] original1 = {1, 2, 3, 4};
        int m1 = 2, n1 = 2;
        int[][] result1 = construct2DArray(original1, m1, n1);
        System.out.println("Array 1: ");
        print2DArray(result1);

        int[] original2 = {1, 2, 3};
        int m2 = 2, n2 = 2;
        int[][] result2 = construct2DArray(original2, m2, n2);
        print2DArray(result2);

        int[] original3 = {1, 2, 3, 4, 5, 6};
        int m3 = 2, n3 = 3;
        int[][] result3 = construct2DArray(original3, m3, n3);
        print2DArray(result3);
    }

    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
