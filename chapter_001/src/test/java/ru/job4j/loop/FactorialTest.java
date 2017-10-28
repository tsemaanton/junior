package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 ....*Test add.
 ....*
 ....*@author Anton Tsema (alsinghspb@gmail.com)
 ....*@version 0.1
 ....*@since 23.10.2017
 .*/
public class FactorialTest {
	/**
	*Method whenCalculateFactorialForFiveThenOneHundreedTwenty.
	*/
	@Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factorial = new Factorial();
		assertThat(factorial.calc(5), is(120));
    }
	/**
	*Method whenCalculateFactorialForZeroThenOne.
	*/
	@Test
    public void whenCalculateFactorialForZeroThenOne() {
		Factorial factorial = new Factorial();
		assertThat(factorial.calc(0), is(1));
    }
}