package com.benko.exercise.sort;

public class SortingApp {

    public static void main(String[] args) {

        BubbleSorter BubbleSorter = new BubbleSorter();
        int[] numbers = new int[]{4, 2, 0, 2, 10, 1, 9, 12, 3, 5};
        BubbleSorter.sort(numbers);
    }
}