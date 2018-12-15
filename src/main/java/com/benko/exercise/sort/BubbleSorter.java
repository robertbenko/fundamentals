package com.benko.exercise.sort;

class BubbleSorter {

    void swapElements(int actual, int[] numbers) {
                int temp;
                temp = numbers[actual + 1];
                numbers[actual + 1] = numbers[actual];
                numbers[actual] = temp;
    }

    boolean isGreaterThan(int current, int next, int[] numbers) {
        return numbers[current] > numbers[next];
    }
}