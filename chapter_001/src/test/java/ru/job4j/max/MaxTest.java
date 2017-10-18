package ru.job4j.max;

public class MaxTest{

public void whenFirstLessSecond() {
    Max maxim = new Max();
    int result = maxim.max(1, 2);
    assertThat(result, is(2));
}
public void whenSecondLessFirst() {
    Max maxim = new Max();
    int result = maxim.max(1, 2);
    assertThat(result, is(1));
}
public void whenFirstEqualsSecond() {
    Max maxim = new Max();
    int result = maxim.max(2, 2);
    assertThat(result, is(2));
}
}