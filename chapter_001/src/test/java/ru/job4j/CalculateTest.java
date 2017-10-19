package ru.job4j;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 ....*Test add.
 ....*
 ....*@author Anton Tsema (alsinghspb@gmail.com)
 ....*@version 0.1
 ....*@since 19.10.2017
 .*/

public class CalculatorTest {
	/**
	*Method whenAddOnePlusOneThenTwo.
	*/
@Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}