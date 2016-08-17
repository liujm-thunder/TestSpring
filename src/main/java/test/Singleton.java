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
//
//    public static void creatingString() {
//        System.out.println("creatingString in Singleton");
//    }

    //改进1(增加了延迟加载,并实现多线程同步)
//    private static Singleton instance = null;
//
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    //    改进2(使用内部类)
    /**
     * 内部类维护单例,当Singleton类加载时不会对内部类初始化,只有当调用getInstance方法时才会初始化内部类.
     * 由于实例的建立是在类初始化加载时完成,故而天生对多线程友好,不需要关键字sychronized同步.
     * **/
    private static class SingletonHolder {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }


    public static void main(String[] args) {
//        Singleton.creatingString();
        new Thread(new Runnable() {
            public void run() {
                long beginTime = System.currentTimeMillis();
                for (int i = 0; i < 100000; i++) {
                    Singleton.getInstance();
                }
                long endTime = System.currentTimeMillis();
                System.out.println("spend:" + (endTime - beginTime));
            }
        }).start();

    }
}
