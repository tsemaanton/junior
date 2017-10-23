package ru.job4j.max;
/**
класс ,находящий наибольшее из 2х целых чисел.
*/
public class Max {
/**
максимальное значение из 2х чисел.
@param first first
@param second second
@return наибольшее
*/
    public int max(int first, int second) {
		return (first > second ? first : second);
 }
/**
максимальное значение из 3х чисел.
@param first first
@param second second
@param third third
@return наибольшее
*/
public int max(int first, int second, int third) {
	return max(max(first, second), third);
}
 }