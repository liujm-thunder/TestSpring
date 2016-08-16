package arithmetic;

/**
 * Created by liujianmeng on 16/4/20.
 */
public class ThreadTest {
    public static void main(String[] args) {

        final Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("t1");
            }
        });

        final Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    t1.join();//等待t1执行完
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t2");
            }
        });
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                try {
                    t2.join();//等待t2执行完
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t3");
            }
        });
        t1.start();
        t2.start();
        t3.start();

    }


}
