package com.foxminded.lenskyi.algorithms.sorting.bubblesort;

import java.util.List;

public class BubbleSort {

  public static void bubbleSort(List<Integer> list) {
    if (list == null || list.isEmpty()) {
      return;
    }

    int n = list.size();
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (list.get(j) > list.get(j + 1)) {
          // Swap list[j] with list[j+1]
          int temp = list.get(j);
          list.set(j, list.get(j + 1));
          list.set(j + 1, temp);
        }
      }
    }
  }
}
