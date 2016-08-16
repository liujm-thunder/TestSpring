package arithmetic;

import java.util.Arrays;

/**
 * Created by liujianmeng on 16/8/8.
 */
public class Solution64 {

    /**
     * @param A: sorted integer array A which has m elements,
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public static void mergeSortedArray(int[] A, int m, int[] B, int n) {
        int[] C = new int[m + n];
        System.arraycopy(A, 0, C, 0, m);
        System.arraycopy(B, 0, C, m, n);
        Arrays.sort(C);

    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5};


    }

}
