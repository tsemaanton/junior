package ru.job4j.loop;

/**
 *class Board.
 *@author Anton Tsema (alsinghspb@gmail.com)
 *@version 0.1
 *@since 27.10.2017
 * .
 */
class Board {
    /**
     * Метод строит доску параметрами wight и hight.
     *
     * @param wigth  width
     * @param height height
     * @return vert
     */
    String paint(int wigth, int height) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= wigth; i++) {
            for (int j = 1; j <= height; j++) {
                if ((i + j) % 2 == 0) {
                    builder.append('X');
                } else {
                    builder.append(" ");
                }
            }
            builder.append("\r\n");
        }
        return builder.toString();
    }
}