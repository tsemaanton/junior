package ru.job4j.max;



public class Max{
/**
метод мах находит максимальное значение из 2х чисел.
*/
    public int max(int first, int second){ 
	 if (first < second) //если first меньше second ,возвращаем second
		 return second;
    else if (first > second)//иначе если если second меньше first ,возвращаем first
	 	 return first;
    else return second;// иначе раз первое и второе условия не выполнились,first равно second
 }
 }