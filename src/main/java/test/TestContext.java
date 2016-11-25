package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liujianmeng on 16/10/10.
 */
public class TestContext {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        HelloApi helloApi =  applicationContext.getBean("factory",HelloApi.class);
        helloApi.sayHello();
    }
}
