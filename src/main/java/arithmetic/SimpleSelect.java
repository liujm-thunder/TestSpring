package arithmetic;

/**
 * Created by liujianmeng on 16/4/16.
 */
public class SimpleSelect {


    public static void main(String[] args) {
        int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(numbers);
    }

    static void sort(int[] a) {
        if (a != null && a.length != 0) {
            int n = a.length;
            for (int i = 0; i <= n - 2; i++) {
                int min = a[i];
                int index = i;
                for (int j = i + 1; j <= n - 1; j++) {
                    if (a[j] < min) {
                        min = a[j];
                        int temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }

            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + "\t");
            }
        }
    }
}
