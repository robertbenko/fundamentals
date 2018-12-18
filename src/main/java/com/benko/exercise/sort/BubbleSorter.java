package com.benko.exercise.sort;

class BubbleSorter {

    static void sort(int[] numbers) {
        BubbleSorter bubbleSorter = new BubbleSorter();
        for (int n: numbers) {
            for (int i = 0; i < numbers.length - 1; i++){
                if (bubbleSorter.isGreaterThan(i, i+1, numbers)) {
                    bubbleSorter.swapElements(i, numbers);
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