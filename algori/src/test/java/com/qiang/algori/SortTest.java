package com.qiang.algori;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class SortTest {


    @Test
    public void bubbleSort() throws Exception {
        Random ran = new Random(9);
        int[] arr = ran.ints(50000).toArray();

        long start = System.currentTimeMillis();

        int[] arr2 = Sort.BubbleSort(arr);
        System.out.println((System.currentTimeMillis() - start));

    }

    @Test
    public void selectionSort() throws Exception {
        Random ran = new Random(9);
        int[] arr = ran.ints(50).toArray();

        long start = System.currentTimeMillis();

        int[] arr2 = Sort.selectionSort(arr);
        System.out.println((System.currentTimeMillis() - start));
        Arrays.stream(arr2).forEach(System.out::println);

    }
}