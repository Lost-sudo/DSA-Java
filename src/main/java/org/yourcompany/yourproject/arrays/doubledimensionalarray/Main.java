package org.yourcompany.yourproject.arrays.doubledimensionalarray;

public class Main {
    public static void main(String[] args) {
        // int[][] int2DArray;
        // int2DArray = new int[2][2];

        // int2DArray[0][0] = 1;
        // int2DArray[0][1] = 2;
        // int2DArray[1][0] = 3;
        // int2DArray[1][1] = 4;

        // System.out.println(Arrays.deepToString(int2DArray));

        // // All together
        // String s2DArray[][] = {{"a", "b"}, {"c", "d"}};
        // System.out.println(Arrays.deepToString(s2DArray));

        TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
        tda.insertValueInTheArray(0, 0, 10);
        tda.insertValueInTheArray(0, 1, 20);
        tda.insertValueInTheArray(1, 2, 30);
        tda.insertValueInTheArray(2, 0, 40);
        // System.out.println(Arrays.deepToString(tda.arr));
        // tda.accessCell(0, 1);
        tda.traverse2DArray();
        tda.searchValue2DArray(40);
        tda.deleteValue2DArray(40);
        tda.traverse2DArray();

    }
}
