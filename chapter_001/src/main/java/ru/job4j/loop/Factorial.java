package ru.job4j.loop;
/**
 ....*class Factorial.
 ....*
 ....*@author Anton Tsema (alsinghspb@gmail.com)
 ....*@version 0.1
 ....*@since 23.10.2017
 .*/
public class Factorial {
		/**
	*Метод вычисляет сумму четныx чисел в диапазоне от start до finish.
	@param num num,
	@return j
	*/
public int calc(int num) {
int j;
if (num == 0) {
	j = 1;
}
for (int i = 1; i <= num; i++) {
	j = j * i;
}
return j;
}
}