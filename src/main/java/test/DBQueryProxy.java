package test;

/**
 * Created by liujianmeng on 16/8/16.
 */
public class DBQueryProxy implements IDBQuery {

    private DBQuery real = null;

    public String request() {
//当真正需要的时候,才会去创建真是对象,创建过程可能很慢.
        if (real == null) {
            real = new DBQuery();
        }
//在多线程环境下,这里返回一个虚假类,类似于future模式

        return real.request();
    }


    public static void main(String[] args) {
        IDBQuery q = new DBQueryProxy();//使用代理
        q.request();//在真正使用的时候才创建真是对象
    }
}
