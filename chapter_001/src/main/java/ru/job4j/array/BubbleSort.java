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
            for (int j = 0; j < i; j++) {
            if (array[j] > array[j + 1]) {
                int tmp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = tmp;
            }
            }
        }
        return array;
    }
}
