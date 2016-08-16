package arithmetic;

/**
 * Created by liujianmeng on 16/4/16.
 */
public class Select {
    public static void main(String[] args) {
        int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = numbers.length;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= i; j++) {
                if (numbers[i + 1] < numbers[j]) {
                    int temp = numbers[i + 1];
                    numbers[i + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i = 0; i <n; i++) {
            System.out.print(numbers[i]+"\t");
        }
    }


}
