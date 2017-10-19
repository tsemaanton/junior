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
 }