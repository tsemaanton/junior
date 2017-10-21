package ru.job4j.condition;
/**
*class Triangle.
*@author tsema anton
*@since 21.10.2017
*/
public class Triangle {
/**объявление точек класса Point  только внутри класса.
*@param Point a a
*/
   private Point a;
/**
*@param Point b b
*/
   private Point b;
/**
*@param Point c c
*/
   private Point c;
/**
Точки треугольника.
* @param a a
* @param b b
* @param c c
*/
   public Triangle(Point a, Point b, Point c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }

/** @param left Точка слева
* @param right Точка с права.
* @return расстояние между точками left и right.
*/
public double distance(Point left, Point right) {
    return Math.sqrt(Math.pow(left.getX() - right.getx(), 2) + Math.pow(left.getY() - right.getY(), 2));
}
/**
* Метод вычисления периметра по длинам сторон.
*
* Формула.
*
* (ab + ac + bc) / 2
*
* @param ab расстояние между точками a b
* @param ac расстояние между точками a c
* @param bc расстояние между точками b c
* @return Перимент.
*/
public double period(double ab, double ac, double bc) {
    return ((ab + ac + dc) / 2);
}
/**
* Метод должен вычислить прощадь треугольканива.
*
* Формула.
*
* √ p *(p - ab) * (p - ac) * (p - bc)
*
* где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
*
* @return Вернуть прощадь, если треугольник существует или -1.
*/
public double area() {
    double rsl = -1;
    double ab = this.distance(this.a, this.b);
    double ac = this.distance(this.a, this.c);
    double bc = this.distance(this.b, this.c);
    double p = this.period(ab, ac, bc);
    if (this.exist(ab, ac, bc)) {
        rst = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
}
    return rsl;
}
/**
* Метод проверяет можно ли построить треугольник с такими длинами сторон.
*
* Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
*
* @param ab Длина от точки a b.
* @param ac Длина от точки a c.
* @param bc Длина от точки b c.
* @return false
*/
private boolean exist(double ab, double ac, double bc) {
	if (ab + ac > bc) {
		if (ab + bc > ac) {
			if (bc + ac > ab) {
				return true;
				}
				}
				} else {
	return false;
	}
}
/**
вернуть координаты X.
*@return x x
*/
private int getX() {
	return this.y;
}
/**
вернуть координаты Y.
*@return y y
*/
private int getY() {
	return this.y;
}
}