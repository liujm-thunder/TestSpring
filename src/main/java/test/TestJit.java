package test;

/**
 * Created by liujianmeng on 16/8/11.
 */
public class TestJit {
    static long i = 0;

    public static void testJit() {      //Jit编译函数
        i++;
    }

    public static void main(String[] args) {
        for (int j = 0; j < 1509; j++) {
            testJit();
            long end = System.currentTimeMillis();
        }
    }
}
