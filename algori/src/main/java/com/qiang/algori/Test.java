package com.qiang.algori;

import java.util.Random;

/**
 * @author Qiang.wei
 * @date 2019/8/9 17:34
 * @Description
 */
public class Test {
    //二分法查找
    public static int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

    //交换
    public static void swap(int[] arr, int i, int j) {
        //普通
//        int tmp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=tmp;

        //位运算
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }

    //插入排序 升序
    public static void insertSort(int[] a) {
        int i, j, insertNote;// 要插入的数据
        for (i = 1; i < a.length; i++) {// 从数组的第二个元素开始循环将数组中的元素插入
            insertNote = a[i];// 设置数组中的第2个元素为第一次循环要插入的数据
            j = i - 1;
            while (j >= 0 && insertNote < a[j]) {
                a[j + 1] = a[j];// 如果要插入的元素小于第j个元素,就将第j个元素向后移动
                j--;
            }
            a[j + 1] = insertNote;// 直到要插入的元素不小于第j个元素,将insertNote插入到数组中
        }
    }

    //冒泡排序 升序
    public static void select(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    // 选择排序升序
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < tmp) {
                    tmp = arr[j];
                    index = j;
                }
            }
            if (index != i) {
                //交换
                arr[i] = arr[index];
                arr[index] = tmp;
            }
        }
    }

    //去重
    public static void searchRepeatIndex(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("重复元素下标:" + i);
                    break;//去掉这句可以查找重复次数
                }
            }
        }
    }

    public static int[] generatorIntArray(int length) {
        // 创建数组的三种方式
        int[] arr = new int[length];
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = r.nextInt(100) + 1;
            //arr[i]=Math.random();
        }
        return arr;
    }

    public static void s(int a) {
        for (int i = 1; i <= a; i++) {
            int n = 1;
            for (int j = 2; j < a; j++) {
                if (i % j == 0)
                    n++;

            }
            if (n == 2)
                System.out.println("质数： " + i);
        }

    }

    public static void main(String[] args) {
//        int[] arr = generatorIntArray(100);
//        System.out.println(arr.length+Arrays.toString(arr));
//        selectSort(arr);
//        System.out.println(arr.length+Arrays.toString(arr));

        //s(1000);
        long start = System.currentTimeMillis();
        System.out.println(f(50));
        System.out.println(System.currentTimeMillis() - start);
    }

    static int f(int n) {
        //f(0) = 0,f(1) = 1，等价于 n<=2时，f(n) = n。
        if (n <= 2) {
            return n;
        }
        return f(n - 1) + f(n - 2);
    }
}
