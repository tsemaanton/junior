package ru.job4j.loop;
import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.io.PrintStream;

/**
 ....*Test add.
 ....*
 ....*@author Anton Tsema (alsinghspb@gmail.com)
 ....*@version 0.1
 ....*@since 23.10.2017
 .*/

public class CounterTest {
	/**
	*Method addition.
	*/
@Test
    public void addition() {
        Counter counter = new Counter();
        int result = counter.add(0, 10);
        assertThat(result, is(30));
    }
}