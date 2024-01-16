package week2_day5;

public class ThreeDArrayOperations {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int z = 3;

        int[][][] threeDArray = {
            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
            {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
            {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };

        // Finding the maximum value in the array
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    maxValue = Math.max(maxValue, threeDArray[i][j][k]);
                }
            }
        }

        // Calculating the average of all elements
        int sum = 0;
        int count = 0;

        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    sum += threeDArray[i][j][k];
                    count++;
                }
            }
        }

        double average = (double) sum / count;

        // Displaying the array
        System.out.println("3D Array:");

        for (int[][] matrix2D : threeDArray) {
            for (int[] row : matrix2D) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Maximum value in the array: " + maxValue);
        System.out.println("Average of all elements: " + average);
    }
}
