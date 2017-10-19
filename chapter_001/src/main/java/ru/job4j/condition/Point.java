package ru.job4j.condition;

/**
 *class Point.
 *@author tsema anton
 *@since 19.10.2017
 */

public class Point {
/**объявление x только внутри класса.
@param x
*/
private int x;
/**объявление y только внутри класса.
@param y
*/
private int y;
/**
Значения координат.
@param x x
@param y y
*/
public Point(int x, int y) {
this.x = x;
this.y = y;
}
/**
Значения координат x.
@return x x
*/
public int getX() {
return this.x;
}
/**
Значения координат y.
@return y y
*/
public int getY() {
return this.y;
}
/**
Значения точки.
@param a a
@param b b
@return true false
*/
public boolean is(int a, int b) {
if return (y = x * a + b)
}
}