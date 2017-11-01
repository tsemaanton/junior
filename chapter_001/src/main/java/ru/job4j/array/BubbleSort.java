package ru.job4j.array;

/**
 *In the class BubbleSort implemented sorting bubble.
 */
class BubbleSort {
    /**
     * Method sort.
     * @param array array
     * @return array
     */
    int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int tmp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = tmp;
            }
        }
        return array;
    }
}
