package com.benko.exercise.sort;

class BubbleSorter {

    void sort(int[] numbers) {
        for (int n: numbers) {
            for (int i = 0; i < numbers.length - 1; i++){
                if (isGreaterThan(i, i+1, numbers)) {
                    swapElements(i, numbers);
                }
            }
        }
    }

    private boolean isGreaterThan(int current, int next, int[] numbers) {
        return numbers[current] > numbers[next];
    }

    private void swapElements(int actual, int[] numbers) {
                int temp;
                temp = numbers[actual + 1];
                numbers[actual + 1] = numbers[actual];
                numbers[actual] = temp;
    }


}