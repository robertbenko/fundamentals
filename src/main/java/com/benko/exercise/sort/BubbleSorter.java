package com.benko.exercise.sort;

public class BubbleSorter {

    public void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            swapElements(numbers);
        }
    }

    private static void swapElements(int[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            if (isGreaterThan(i, i+1, numbers)) {
                int temp;
                temp = numbers[i + 1];
                numbers[i + 1] = numbers[i];
                numbers[i] = temp;
            }
        }
    }

    private static boolean isGreaterThan(int x, int y, int[] numbers) {
        return numbers[x]>numbers[y];
    }

    public static void printNumbers(int[] sortedNumbers) {
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.println(sortedNumbers[i]);
        }
    }
}