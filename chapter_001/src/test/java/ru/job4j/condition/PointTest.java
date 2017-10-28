package ru.job4j.condition;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 ....*Test add.
 ....*
 ....*@author Anton Tsema (alsinghspb@gmail.com)
 ....*@version 0.1
 ....*@since 19.10.2017
 .*/

public class PointTest {
	/**
	*Method whenAddOnePlusOneThenTwo.
	*/
@Test
    public void whenPointOnLineThenTrue() {
        Point a = new Point(1, 1);
        boolean result = a.is(0, 1);
        assertThat(result, is(true));
    }
}