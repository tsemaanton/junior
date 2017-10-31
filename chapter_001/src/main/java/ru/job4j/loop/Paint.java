package ru.job4j.loop;

/**
*class Paint.
*
*@author Anton Tsema (alsinghspb@gmail.com)
*@version 0.1
*@since 28.10.2017
 * */
class Paint {
    /**
     * method piramid.
     *
     * @param h hight
     *          return toString
     */
    String piramid(int h) {
        StringBuilder piramide = new StringBuilder();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= h * 2 - 2; j++) {
                if (j > h - 2 - i && j < h + i) {
                    piramide.append('^');
                } else {
                    piramide.append(' ');
                }

            }
            piramide.append("\r\n");
        }
        return piramide.toString();
    }
}
