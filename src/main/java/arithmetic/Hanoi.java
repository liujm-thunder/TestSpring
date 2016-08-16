package arithmetic;

/**
 * Created by liujianmeng on 16/4/16.
 */
public class Hanoi {
    public static void main(String[] args) {
        hanoi(10, "A", "B", "C");
    }

    static void hanoi(int n, String src, String mid, String dest) {
        if (n == 1) {
            System.out.println(src + "-->" + dest);
        } else {
            hanoi(n - 1, src, dest, mid);
            hanoi(1, src, "", dest);
            hanoi(n - 1, mid, src, dest);
        }
    }
}
