public class Excercise_13 {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        // The first is just a try
        int[] matrix = {0, 1};
        int number = 4;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (j == i) {
                    System.out.print(matrix[1] + " ");
                } else {
                    System.out.print(matrix[0] + " ");
                }
            }
            System.out.println();
        }

        // Maybe the proper solution

        int[][] matrix2 = new int[4][4];

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                if (j == i) {
                    matrix2[i][j] = 1;
                } else {
                    matrix2[i][j] = 0;
                }
            }
        }
        for (int[] a : matrix2) {
            for (int i: a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}