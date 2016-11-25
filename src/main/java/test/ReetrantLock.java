package test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by liujianmeng on 16/10/24.
 */
public class ReetrantLock {


    private static Runnable createTask() {
        final ReentrantLock lock = new ReentrantLock();
        return new Runnable() {
            public void run() {
                while (true) {
                    try {
                        if (lock.tryLock(500, TimeUnit.MILLISECONDS)) {
                            try {
                                System.out.println("locked --->>" + Thread.currentThread().getName());
                                Thread.sleep(1000);
                            } finally {
                                lock.unlock();
                                System.out.println("unlocked ===>> " + Thread.currentThread().getName());
                            }
                            break;
                        } else {
                            System.out.println("unable to lock " + Thread.currentThread().getName());//这段代码在lock和lockedInterruputibly()时候删除
                        }

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println(Thread.currentThread().getName() + " is Interrupted");
                    }
                }
            }
        };
    }


    public static void main(String[] args) {
        Thread first = new Thread(createTask(),"FirstThread");
        Thread second = new Thread(createTask(),"SecondThread");
        first.start();
        second.start();
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        second.interrupt();
    }
}
