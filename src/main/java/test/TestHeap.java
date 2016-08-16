package test;

import java.util.Vector;

/**
 * Created by liujianmeng on 16/8/10.
 */
public class TestHeap {

    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            byte[] b = new byte[1024 * 1024];
            v.add(b);
            System.out.println(i + "M is allocated");
        }

        System.out.println("Max memory is "+ Runtime.getRuntime().maxMemory()/1024/1024+"M");
    }
}
