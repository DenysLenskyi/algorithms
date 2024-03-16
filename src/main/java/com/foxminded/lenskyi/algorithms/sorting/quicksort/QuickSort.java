package com.foxminded.lenskyi.algorithms.sorting.quicksort;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Hoare scheme. Pivot is a random element from the List
 */

public class QuickSort {
  private static final Random RANDOM = new Random();

  public static void quickSort(List<Integer> list) {
    if (list == null || list.isEmpty()) {
      return;
    }
    quickSort(list, 0, list.size() - 1);
  }

  private static void quickSort(List<Integer> list, int low, int high) {
    if (low < high) {
      int pivotIndex = partition(list, low, high);
      quickSort(list, low, pivotIndex);
      quickSort(list, pivotIndex + 1, high);
    }
  }

  private static int partition(List<Integer> list, int low, int high) {
    int pivotIndex = getRandomPivotIndex(low, high);
    int pivot = list.get(pivotIndex);
    while (true) {
      while (list.get(low) < pivot) {
        low++;
      }
      while (list.get(high) > pivot) {
        high--;
      }
      if (low >= high) {
        return high;
      }
      Collections.swap(list, low, high);
      low++;
      high--;
    }
  }

  private static int getRandomPivotIndex(int low, int high) {
    return RANDOM.nextInt(high - low + 1) + low;
  }
}
