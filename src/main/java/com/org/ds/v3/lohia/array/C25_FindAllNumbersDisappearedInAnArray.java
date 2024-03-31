package com.org.ds.v3.lohia.array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * https://www.youtube.com/watch?v=oEBHLcucDYg&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=26
 */
public class C25_FindAllNumbersDisappearedInAnArray {

  public List<Integer> findDisappearedNumbers(int[] nums) {

    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      int idx = Math.abs(nums[i]) - 1;
      if (nums[idx] < 0)
        continue;

      nums[idx] *= -1;
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0)
        result.add(i + 1);
    }

    return result;
  }

}