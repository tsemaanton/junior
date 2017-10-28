package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Anton Tsema (mailto:alsinghspb@gmail.com)
 * @version 0.01
 * @since 0.1
 */
public class CalculateTest {
    /**
     * Test echo.
     */ @Test
    public void whenTakeNameThenTreeEchoPlusName() {
        String input = "Anton Tsema";
        String expect = "Echo, echo, echo : Anton Tsema";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        assertThat(result, is(expect));
    }

}