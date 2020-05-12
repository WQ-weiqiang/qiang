package qiang.algori;

import org.junit.Test;
import qiang.base.algori.Sort;

import java.util.Arrays;
import java.util.Random;

public class SortTest {

    public static int[] getIntArray(int length, int min, int max) {
        Random ran = new Random();
        return ran.ints(length, min, max).toArray();
    }

    @Test
    public void testSort() {

        int[] arr = getIntArray(10, 1, 10000);

        long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        Sort.insertSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("插入排序时间： " + (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        Sort.shellSort(arr);
        System.out.println("希尔排序时间： " + (System.currentTimeMillis() - start) + " ms");

        //start = System.currentTimeMillis();
        //arr2 = Sort.selectionSort(arr);
        //System.out.println("选择排序时间： " + (System.currentTimeMillis() - start) + " ms");

        //start = System.currentTimeMillis();
        //arr2 = Sort.bubbleSort(arr);
        //System.out.println("冒泡排序时间： " + (System.currentTimeMillis() - start) + " ms");


        //start = System.currentTimeMillis();
        //arr2 = Sort.mergeSort(arr);
        //System.out.println("归并排序时间： " + (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        Sort.quickSort(arr);
        System.out.println("快速排序时间： " + (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        Sort.quickSort2(arr);
        System.out.println("快速排序2时间： " + (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        Sort.heapSort(arr);
        System.out.println("堆排序时间： " + (System.currentTimeMillis() - start) + " ms");


        start = System.currentTimeMillis();
        Sort.countingSort(arr);
        System.out.println("计数排序时间： " + (System.currentTimeMillis() - start) + " ms");


        start = System.currentTimeMillis();
        Sort.bucketSort(arr);
        System.out.println("桶排序时间： " + (System.currentTimeMillis() - start) + " ms");

        //start = System.currentTimeMillis();
        //arr2 = Sort.radixSort(arr);
        //System.out.println("基数排序时间： " + (System.currentTimeMillis() - start) + " ms");
        //Arrays.stream(arr2).forEach(System.out::println);
    }

    @Test
    public void bubbleSort() throws Exception {
        int[] arr = getIntArray(50, 1, 100);

        long start = System.currentTimeMillis();

        int[] arr2 = Sort.bubbleSort(arr);
        System.out.println("排序时间： " + (System.currentTimeMillis() - start) + " ms");

    }


    @Test
    public void selectionSort() throws Exception {
        int[] arr = getIntArray(50, 1, 100);

        long start = System.currentTimeMillis();

        int[] arr2 = Sort.selectionSort(arr);
        System.out.println("排序时间： " + (System.currentTimeMillis() - start) + " ms");
//        Arrays.stream(arr2).forEach(System.out::println);

    }

    @Test
    public void insertSort() {
        int[] arr = getIntArray(10, 1, 100);

        long start = System.currentTimeMillis();
//        System.out.println(Arrays.toString(arr));
        int[] arr2 = Sort.insertSort(arr);
//        System.out.println(Arrays.toString(arr2));
        System.out.println("插入排序时间： " + (System.currentTimeMillis() - start) + " ms");

    }

    @Test
    public void shellSort() {

        int[] arr = getIntArray(100, 1, 100);
        long start = System.currentTimeMillis();

        int[] arr2 = Sort.shellSort(arr);
        System.out.println("希尔排序时间： " + (System.currentTimeMillis() - start) + " ms");

//        Arrays.stream(arr2).forEach(System.out::println);
    }


    @Test
    public void mergeSort() {
        int[] arr = getIntArray(100, 1, 100);
        long start = System.currentTimeMillis();
        int[] arr2 = Sort.mergeSort(arr);
        System.out.println("归并排序时间： " + (System.currentTimeMillis() - start) + " ms");

//        Arrays.stream(arr2).forEach(System.out::println);
    }

    @Test
    public void quickSort() {
        int[] arr = getIntArray(10, 1, 1000);

        long start = System.currentTimeMillis();
//        System.out.println(Arrays.toString(arr));
        int[] arr2 = Sort.quickSort(arr);
//        System.out.println(Arrays.toString(arr2));
        System.out.println("快速排序时间： " + (System.currentTimeMillis() - start) + " ms");

    }

    @Test
    public void heapSort() {
        int[] arr = getIntArray(100, 1, 100);

        long start = System.currentTimeMillis();
        int[] arr2 = Sort.heapSort(arr);
        System.out.println("堆排序时间： " + (System.currentTimeMillis() - start) + " ms");

        //Arrays.stream(arr2).forEach(System.out::println);
    }

    @Test
    public void countSort() {
        int[] arr = getIntArray(100, 1, 100);

        long start = System.currentTimeMillis();
        int[] arr2 = Sort.countingSort(arr);
        System.out.println("计数排序时间： " + (System.currentTimeMillis() - start) + " ms");

        //Arrays.stream(arr2).forEach(System.out::println);
    }

    @Test
    public void bucketSort() {
        int[] arr = getIntArray(100, 1, 100);

        long start = System.currentTimeMillis();
        int[] arr2 = Sort.bucketSort(arr);
        System.out.println("桶排序时间： " + (System.currentTimeMillis() - start) + " ms");

        //Arrays.stream(arr2).forEach(System.out::println);
    }

    @Test
    public void radixSort() {
        int[] arr = getIntArray(100, 1, 100);

        long start = System.currentTimeMillis();
        int[] arr2 = Sort.radixSort(arr);
        System.out.println("基数排序时间： " + (System.currentTimeMillis() - start) + " ms");

        //Arrays.stream(arr2).forEach(System.out::println);
    }

    @Test
    public void test() {
        System.out.println(26 - 22.6);
    }
}