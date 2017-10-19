package ru.job4j.max;
/**
*Test add.
*@author Anton Tsema (alsinghspb@gmail.com)
*@version 0.1
*@since 19.10.2017
 */

public class MaxTest {
/**
Method whenFirstLessSecond.
*/
@Test
public void whenFirstLessSecond() {
    Max maxim = new Max();
    int result = maxim.max(1, 2);
    assertThat(result, is(2));
}
/**
Method whenSecondLessFirst.
*/
@Test
public void whenSecondLessFirst() {
    Max maxim = new Max();
    int result = maxim.max(2, 1);
    assertThat(result, is(1));
}
/**
Method whenFirstEqualsSecond.
*/
@Test
public void whenFirstEqualsSecond() {
    Max maxim = new Max();
    int result = maxim.max(2, 2);
    assertThat(result, is(2));
}
}