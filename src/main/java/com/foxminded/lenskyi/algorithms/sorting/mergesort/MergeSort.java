package com.foxminded.lenskyi.algorithms.sorting.mergesort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

  public static void mergeSort(List<Integer> list) {
    if (list == null || list.size() <= 1) {
      return;
    }

    List<Integer> left = new ArrayList<>(list.subList(0, list.size() / 2));
    List<Integer> right = new ArrayList<>(list.subList(list.size() / 2, list.size()));

    mergeSort(left);
    mergeSort(right);

    merge(list, left, right);
  }

  private static void merge(List<Integer> list, List<Integer> left, List<Integer> right) {
    int leftIndex = 0;
    int rightIndex = 0;
    int listIndex = 0;

    while (leftIndex < left.size() && rightIndex < right.size()) {
      if (left.get(leftIndex) < right.get(rightIndex)) {
        list.set(listIndex++, left.get(leftIndex++));
      } else {
        list.set(listIndex++, right.get(rightIndex++));
      }
    }

    while (leftIndex < left.size()) {
      list.set(listIndex++, left.get(leftIndex++));
    }

    while (rightIndex < right.size()) {
      list.set(listIndex++, right.get(rightIndex++));
    }
  }
}
