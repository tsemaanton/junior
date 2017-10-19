package ru.job4j.calculator;
/**
*class Calculator операции с цислами.
 *@author tsema anton
 *@since 18.10.2017
*/
public class Calculator {
/**
@param result
*/
private double result;
/**
сложение.
@param  first first
@param  second second
*/
public void add(double first, double second) {
this.result = first + second;
}
/**
вычитание.
@param first first
@param second second
*/
public void subtract(double first, double second) {
this.result = first - second;
}
/**
деление.
@param first first
@param second second
*/
public void div(double first, double second) {
this.result = first / second;
}
/**
умножение.
@param first first
@param second second
*/
public void multiple(double first, double second) {
this.result = first * second;
}
/**
вынос значения из метода.
@return result
*/
public double getResult() {
return this.result;
}
}