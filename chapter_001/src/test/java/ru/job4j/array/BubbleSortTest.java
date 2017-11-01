package ru.job4j.array;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Class BubbleSortTest tests a class BubbleSort.
 */
public class BubbleSortTest {
    @Test
    public void sortirovka() {
        BubbleSort array = new BubbleSort();
        int[] j = {1, 5, 2, 4, 6};
        int[] expected = {1, 2, 4, 5, 6};
        System.out.print(Arrays.toString(array.sort(j)));
        assertThat(array.sort(j), is(expected));

    }
}
