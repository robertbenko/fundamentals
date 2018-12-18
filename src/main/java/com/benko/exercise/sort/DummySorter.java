package com.benko.exercise.sort;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * This sorter implements the dumbest sorting algorithm I could imagine in 1 minute or less:
 * it tries to sort array by swapping its elements randomly,
 * believing that maybe some day it will guess correct order.
 */
class DummySorter {

    private final Random random = new Random();

    void sort(int[] numbers) {
        IntStream.range(0, numbers.length).forEach(i ->
            swapElements(i, randomDestination(numbers), numbers)
        );
    }

    private int randomDestination(int[] numbers) {
        return random.nextInt(numbers.length);
    }

    private void swapElements(int a, int b, int[] numbers) {
        int tmp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = tmp;
    }

}
