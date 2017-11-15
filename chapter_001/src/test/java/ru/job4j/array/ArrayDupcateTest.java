package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *Test class ArrayDuplicate.
 *
 *@author Anton Tsema (alsinghspb@gmail.com)
 *@version 0.1
 *@since 14.11.2017
*/
public class ArrayDupcateTest {
/**
 *Метод whenRemoveDuplicatesThenArrayWithoutDuplicate тестирует класс ArrayDuplicate/
 */
@Test
public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
    ArrayDuplicate arr = new ArrayDuplicate();
    String massiv[] = {"Привет","Мир","Привет","Супер","Мир"};
    String result[] = {"Привет","Мир","Супер"};
    assertThat(result, is(arr.remove(massiv)));

    }

}
