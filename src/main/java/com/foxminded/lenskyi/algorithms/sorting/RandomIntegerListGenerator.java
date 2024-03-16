package com.foxminded.lenskyi.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomIntegerListGenerator {
  private Random random = new Random();

  public List<Integer> generateRandomList(int length, int minValue, int maxValue) {
    if (length <= 0) {
      throw new IllegalArgumentException("Length must be greater than zero.");
    }
    if (minValue >= maxValue) {
      throw new IllegalArgumentException("Minimum value must be less than maximum value.");
    }

    List<Integer> randomList = new ArrayList<>();
    for (int i = 0; i < length; i++) {
      randomList.add(random.nextInt(maxValue - minValue + 1) + minValue);
    }
    return randomList;
  }
}
