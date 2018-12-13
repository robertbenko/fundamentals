package com.benko.exercise.sort;

public class BubbleSorter {

    public int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            swapElements(numbers);
        }
        return numbers;
    }

    private static int[] swapElements(int[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            if (isGeraterThan(i, i+1, numbers)) {
                int temp;
                temp = numbers[i + 1];
                numbers[i + 1] = numbers[i];
                numbers[i] = temp;
            }
        }
        int[] swapedElements = numbers;
        return swapedElements;
    }

    private static boolean isGeraterThan(int x, int y, int[] numbers) {
        return numbers[x]>numbers[y];
    }

    public static void printNumbers(int[] sortedNumbers) {
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.println(sortedNumbers[i]);
        }
    }
}