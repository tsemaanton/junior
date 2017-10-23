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
        Factorial testOne = new Factorial();
		test.one(5);
		assertThat(j, is(120));
    }
	/**
	*Method whenCalculateFactorialForZeroThenOne.
	*/
	@Test
    public void whenCalculateFactorialForZeroThenOne() {
		Factorial testOne = new Factorial();
		test.one(0);
		assertThat(j, is(1));
    }
}