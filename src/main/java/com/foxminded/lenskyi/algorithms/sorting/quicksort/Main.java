package com.foxminded.lenskyi.algorithms.sorting.quicksort;

import com.foxminded.lenskyi.algorithms.sorting.RandomIntegerListGenerator;
import com.foxminded.lenskyi.algorithms.sorting.bubblesort.BubbleSort;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    RandomIntegerListGenerator generator = new RandomIntegerListGenerator();
    List<Integer> list = generator.generateRandomList(100000, 10, 1000);

    long start = System.currentTimeMillis();
    QuickSort.quickSort(list);
    //    BubbleSort.bubbleSort(list);
    long end = System.currentTimeMillis() - start;
    System.out.println("Time : " + end);
  }
}
