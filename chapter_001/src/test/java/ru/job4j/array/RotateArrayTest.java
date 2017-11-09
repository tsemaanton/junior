package ru.job4j.array;
import org.junit.Test;
import java.util.Arrays;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *Test class RotateArrayTest.
 *
 *@author Anton Tsema (alsinghspb@gmail.com)
 *@version 0.1
 *@since 09.11.2017
.*/
public class RotateArrayTest {
    /**
     *Метод whenRotateTwoRowTwoColArrayThenRotatedArray тестирует для массива 2*2.
     * */
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray arr = new RotateArray();
        int[][] j = {{1, 2},
                     {3, 4}};
        int[][] result = arr.rotate(j);
        int[][] expected = {{3, 1}, {4, 2}};
        System.out.print(Arrays.toString(result));
        assertThat(result, is(expected));
    }
    /**
     *Метод whenRotateTwoRowTwoColArrayThenRotatedArray тестирует для массива 3*3.
     * */
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {

        RotateArray arr = new RotateArray();
        int[][] j = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] result = arr.rotate(j);
        int[][] expected = {{7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}};
        System.out.print(Arrays.toString(result));
        assertThat(result, is(expected));  //напишите здесь тест, проверяющий поворот массива размером 3 на 3.
    }
}

