package com.benko.exercise.sort;

public class SortingApp {

    public static void main(String[] args) {
        int[] numbers = new int[]{4, 2, 0, 2, 10, 1, 9, 12, 3, 5};
        SortingApp.sort(numbers);
    }

    private static void sort(int[] numbers) {
        BubbleSorter bubbleSorter = new BubbleSorter();
        for (int x: numbers) {
            for (int i = 0; i < numbers.length - 1; i++){
                if (bubbleSorter.isGreaterThan(i, i+1, numbers)) {
                    bubbleSorter.swapElements(i, numbers);
                }
            }
        }
        SortingApp.printNumbers(numbers);
    }

    private static void printNumbers(int[] sortedNumbers) {
        for (int x: sortedNumbers){
            System.out.println(x);
        }
    }
}