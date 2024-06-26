package com.org.ds.v3.lohia.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BetweenTwoSetsTest {

  C7_DF_BetweenTwoSets betweenTwoSets = new C7_DF_BetweenTwoSets();

  @Test
  void testGetTotalX1() {
    List<Integer> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>();

    a.add(2);
    a.add(4);

    b.add(16);
    b.add(32);
    b.add(96);

    assertEquals(3, betweenTwoSets.getTotalX(a, b));
  }

  @Test
  void testGetTotalX2() {
    List<Integer> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>();

    a.add(2);
    a.add(6);

    b.add(24);
    b.add(36);

    assertEquals(2, betweenTwoSets.getTotalX(a, b));
  }

  @Test
  void testGetTotalX3() {
    List<Integer> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>();

    a.add(3);
    a.add(4);

    b.add(24);
    b.add(48);

    assertEquals(2, betweenTwoSets.getTotalX(a, b));
  }

  @Test
  void testGetTotalX4() {
    List<Integer> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>();

    a.add(2);

    b.add(20);
    b.add(30);
    b.add(12);

    assertEquals(1, betweenTwoSets.getTotalX(a, b));
  }
}