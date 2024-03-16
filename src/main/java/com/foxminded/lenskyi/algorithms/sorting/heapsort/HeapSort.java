package com.foxminded.lenskyi.algorithms.sorting.heapsort;

import java.util.ArrayList;
import java.util.List;

public class HeapSort {

  public static void heapSort(List<Integer> list) {
    if (list == null || list.size() <= 1) {
      return;
    }

    int n = list.size();

    // Build heap (rearrange array)
    for (int i = n / 2 - 1; i >= 0; i--) {
      heapify(list, n, i);
    }

    // One by one extract an element from heap
    for (int i = n - 1; i > 0; i--) {
      // Move current root to end
      int temp = list.get(0);
      list.set(0, list.get(i));
      list.set(i, temp);

      // call max heapify on the reduced heap
      heapify(list, i, 0);
    }
  }

  private static void heapify(List<Integer> list, int n, int i) {
    int largest = i; // Initialize largest as root
    int left = 2 * i + 1; // left = 2*i + 1
    int right = 2 * i + 2; // right = 2*i + 2

    // If left child is larger than root
    if (left < n && list.get(left) > list.get(largest)) {
      largest = left;
    }

    // If right child is larger than largest so far
    if (right < n && list.get(right) > list.get(largest)) {
      largest = right;
    }

    // If largest is not root
    if (largest != i) {
      int swap = list.get(i);
      list.set(i, list.get(largest));
      list.set(largest, swap);

      // Recursively heapify the affected sub-tree
      heapify(list, n, largest);
    }
  }

}
