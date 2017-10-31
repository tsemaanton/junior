package ru.job4j.array;
/**
*class Turn reverses the array.
*
*@author Anton Tsema (alsinghspb@gmail.com)
*@version 0.1
*@since 31.10.2017
*/
class Turn{
/**
*Method "back" reverses the array.
*@param array array
*@return  array
*/
int[] back(int[] array) {
for (int i = 0; i < array.length/2; i++) {
    int arr = array[i];//значение элемента индексом i
    array[i] = array[array.length - 1 - i];
    array[array.length - 1 - i] = arr;
}
return array;
}
}