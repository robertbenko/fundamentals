package com.benko.exercise.sort;

class BubbleSorter {

    void sort(int[] numbers) {
        for (int n: numbers) {
            for (int i = 0; i < numbers.length - 1; i++){
                if (isGreaterThan(i, i+1, numbers)) {
                    swapElements(i, i+1, numbers);
                }
            }
        }
    }

    private boolean isGreaterThan(int current, int next, int[] numbers) {
        return numbers[current] > numbers[next];
    }

    private void swapElements(int current, int next, int[] numbers) {
                int temp;
                temp = numbers[next];
                numbers[next] = numbers[current];
                numbers[current] = temp;
    }


}