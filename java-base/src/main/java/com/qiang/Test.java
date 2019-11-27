package com.qiang;

/**
 * @author Qiang.wei
 * @date 2019/8/9 17:34
 * @Description
 */
public class Test {


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

        s(1000);
    }


}
