package ru.job4j.array;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test class Turn.
 *
 *@author Anton Tsema (alsinghspb@gmail.com)
 *@version 0.1
 *@since 31.10.2017
.*/
public class TurnTest {
     /**
     *Метод reserveArrayFourElements тестирует для массива из 4х элементов.
     * */
    @Test
    public void reserveArrayFourElements() {
        Turn turn = new Turn();
        int[] j = {2, 6, 1, 4};
        int[] result = turn.back(j);
        int[] expected = {4, 1, 6, 2};
        System.out.print(Arrays.toString(result));
       assertThat(result, is(expected));
    }
    /**
     *Метод reserveArrayFiveElements тестирует для массива из 5х элементов.
     * */
    @Test
    public void reserveArrayFiveElements() {
        Turn turn = new Turn();
        int[] j = {1, 2, 3, 4, 5};
        int[] result = turn.back(j);
        int[] expected = {5, 4, 3, 2, 1};
        System.out.print(Arrays.toString(result));
        assertThat(result, is(expected));
    }

}

