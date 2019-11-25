package com.qiang.algori;

import java.util.Arrays;

/**
 * @author Qiang.wei
 * @date 2019/11/25 10:45
 * @Description
 */

public class Sort {

    //冒泡排序
    public static int[] BubbleSort(int[] sourceArr) throws Exception {
        int[] arr = Arrays.copyOf(sourceArr, sourceArr.length);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }

        }
        return arr;
    }

    //选择排序
    public static int[] selectionSort(int[] soruceArr) throws Exception {
        int[] arr = Arrays.copyOf(soruceArr, soruceArr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
        return arr;
    }
}
