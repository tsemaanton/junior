package ru.job4j.array;
/**
 *class Rotate array.
 *
 *@author Anton Tsema (alsinghspb@gmail.com)
 *@version 0.1
 *@since 09.11.2017
 */
public class RotateArray {
    /**
     *Method rotate.
     *@param array array
     *@return  array
     */
    public int[][] rotate(int[][] array) {
        for (int i = 0; ;) {
            for(int j = 0; j < 2 ; j++) {
                    int tmp = array[i][j];
                    array[i][j] = array[array.length - j - 1][i];
                    array[array.length - 1 - j][i] = array[array.length - 1 - i][array.length - 1 - j];
                    array[array.length - 1 - i][array.length - j - 1] = array[j][array.length - 1 - i];
                    array[j][array.length - 1 - i] = tmp;
                    if (array.length == 2) {
                        break;
                    }

                    }
            return  array;
        }
    }
}
