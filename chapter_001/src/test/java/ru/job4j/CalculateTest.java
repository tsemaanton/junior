package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
....*Test add.
....*
....*@author Anton Tsema (alsinghspb@gmail.com)
....*@version $Id$
....*@since 0.1
.*/

public class CalculateTest {
	
/**
....* Test add.
....*/

    public void whenTakeNameThenTreeEchoPlusName() {
	     String input = "Anton Tsema";
		 String expect = "Echo,Echo,Echo : Anton Tsema";
		 Calculate calc = new Calculate();
		 String result = calc.echo(input);
		 assertThat(result,is(expect));
    }	
}			