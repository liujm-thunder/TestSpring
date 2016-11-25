package test;

import javax.xml.ws.Endpoint;

/**
 * Created by liujianmeng on 16/10/24.
 */
public class ServiceMain {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorlds();
        Endpoint.publish("http://172.21.1.114:8080/hello",helloWorld);
        System.out.println("Web Service 暴露成功!");
    }
}
