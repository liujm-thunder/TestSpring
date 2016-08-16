package test;

/**
 * Created by liujianmeng on 16/8/16.
 */
public class Singleton {
    private Singleton() {
        System.out.println("Singleton is created");
    }

//    private static Singleton instance = new Singleton();
//
//    public static Singleton getInstance() {
//        return instance;
//    }

    public static void creatingString() {
        System.out.println("creatingString in Singleton");
    }


    //改进
    private static Singleton instance = null;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
//        Singleton.creatingString();
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100000; i++) {
                Singleton.getInstance();
                    System.out.println("spend:"+System.currentTimeMillis());
                }
            }
        }).start();

    }
}
