package ru.job4j.loop;
/**
 ....*class Factorial.
 ....*
 ....*@author Anton Tsema (alsinghspb@gmail.com)
 ....*@version 0.1
 ....*@since 23.10.2017
 .*/
class Factorial {
	/**
	 * Метод вычисляет сумму четныx чисел в диапазоне от start до finish.
	 *
	 * @param num num,
	 * @return j
	 */
	int calc(int num) {
		int j = 1;
		if (num == 0) {
			j = 1;
		}
		for (int i = 1; i <= num; ++i) {
			j *= i;
		}
return j;
	}
}
