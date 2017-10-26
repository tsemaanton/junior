package ru.job4j.loop;

/**
 ....*class Counter.
 ....*
 ....*@author Anton Tsema (alsinghspb@gmail.com)
 ....*@version 0.1
 ....*@since 23.10.2017
 .*/

public class Counter {
	/**
	*Метод вычисляет сумму четныx чисел в диапазоне от start до finish.
	@param start start
	@param finish finish
	@return result
	*/
    public int add(int start, int finish) {
		int result = 0;
		for (; start <= finish; start++) {
		if (start % 2 == 0) {
		result += start;
		    }
		}
		return result;
    }
}