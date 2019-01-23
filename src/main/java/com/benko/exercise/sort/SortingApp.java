package com.benko.exercise.sort;

public class SortingApp {

    public static void main(String[] args) {
        Sorter sorter = new BubbleSorter();
        //Sorter dummySorter = new DummySorter();
        int[] numbers = new int[]{4, 2, 0, 2, 10, 1, 9, 12, 3, 5};
        //dummySorter.sort(numbers);
        sorter.sort(numbers);
        printNumbers(numbers);
    }

    private static void printNumbers(int[] sortedNumbers) {
        for (int s: sortedNumbers){
            System.out.println(s);
        }
    }
}