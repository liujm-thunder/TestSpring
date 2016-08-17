package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by liujianmeng on 16/8/16.
 */
public class JdkDbQueryHandler implements InvocationHandler {
    IDBQuery real = null;


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (real == null)
            real = new DBQueryProxy();
        return real.request();
    }

    public static IDBQuery createJdkProxy() {
        IDBQuery jdkProxy = (IDBQuery) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{IDBQuery.class}, new JdkDbQueryHandler());
        return jdkProxy;
    }
}
