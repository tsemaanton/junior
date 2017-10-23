package ru.job4j.loop;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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
        counter.add(0, 10);
        assertThat(result, is(30));
    }
}