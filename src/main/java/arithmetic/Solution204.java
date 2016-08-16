package arithmetic;

/**
 * Created by liujianmeng on 16/4/20.
 */
public class Solution204 {
    private Solution204() {
    }

    private static Solution204 solution204 = null;

    public static Solution204 getInstance() {
        if (solution204 == null) {
            solution204 = new Solution204();
        }

        return solution204;
    }


    public static void main(String[] args) {
        System.out.println(Solution204.getInstance().toString());
    }
}
