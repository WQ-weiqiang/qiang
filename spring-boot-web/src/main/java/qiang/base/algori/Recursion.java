package qiang.base.algori;

/**
 * @author Qiang.wei
 * @date 2019/11/25 14:38
 * @Description 递归
 */

public class Recursion {

    static int f(int n) {
        //f(0) = 0,f(1) = 1，等价于 n<=2时，f(n) = n。
        if (n <= 2) {
            return n;
        }
        return f(n - 1) + f(n - 2);
    }

    static int ff(int n, int[] arr) {
        if (n <= 2) {
            arr[0] = 1;
            arr[1] = 2;
            return arr[n - 1];
        }


        if (arr[n - 1] > 0) {
            return arr[n - 1];
        } else {
            arr[n - 1] = ff(n - 1, arr) + ff(n - 2, arr);
            return arr[n - 1];
        }

    }

    static int fff(int n) {
        int f1 = 1;
        int f2 = 2;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;

        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 40;
        int[] arr = new int[n];

        long start = System.currentTimeMillis();
        System.out.println(f(n));
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        System.out.println("-------------------------------------");
        start = System.currentTimeMillis();
        System.out.println(fff(n));
        end = System.currentTimeMillis();
        System.out.println(end - start);

        System.out.println("-------------------------------------");
        start = System.currentTimeMillis();
        System.out.println(ff(n, arr));
        end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("-------------------------------------");
        //Arrays.stream(arr).forEach(System.out::println);
    }


}
