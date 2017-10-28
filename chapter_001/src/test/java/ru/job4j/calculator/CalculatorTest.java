package ru.job4j.calculator;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 ....*Test add.
 ....*@author Anton Tsema (alsinghspb@gmail.com)
 ....*@version 0.1
 ....*@since 19.10.2017
*/
public class CalculatorTest {
	/**
	*Method whenAddOnePlusOneThenTwo.
	*/
	@Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(4, 2);
        double result = calc.getResult();
        double expected = 6;
        assertThat(result, is(expected));
    }
	/**
	*Method whenAddOneMinusOneThenTwo.
	*/
	@Test
	  public void whenAddOneMinusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.subtract(4, 2);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));
	}
/**
	*Method whenAddOneDivOneThenTwo.
	*/
	@Test
	public void whenAddOneDivOneThenTwo() {
        Calculator calc = new Calculator();
        calc.div(4, 2);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));
    }
	/**
	*Method whenAddOneMultipleOneThenTwo.
	*/
	@Test
	  public void whenAddOneMultipleOneThenTwo() {
        Calculator calc = new Calculator();
        calc.multiple(4, 2);
        double result = calc.getResult();
        double expected = 8;
        assertThat(result, is(expected));
    }
}