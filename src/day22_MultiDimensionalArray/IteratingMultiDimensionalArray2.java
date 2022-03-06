package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {

        int[][] arr2D = { {1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13} };

        for (int i = arr2D.length - 1; i >= 0; i--) { // i: is the index number of one dimensional array starting
                                                      // from last index to 0

            for (int j = 0; j < arr2D[i].length; j++) { // j: is the index number of elements starting from 0
                System.out.print(arr2D[i][j] + " ");
            }

            System.out.println();

        }

        System.out.println("-------------------------------------------------------------------------------------");

        for (int i = 0; i < arr2D.length; i++) { //i: is the index (of each 1D) number that started from 0

            for (int j = arr2D[i].length - 1; j >= 0; j--) { // j: is the index number for each element starting
                                                                    // from last index
                System.out.print(arr2D[i][j] + " ");
            }

            System.out.println();
            }

        System.out.println("------------------------------------------------");






    }

}




/*
task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9
task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1
 */