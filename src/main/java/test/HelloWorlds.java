package test;

import javax.jws.WebService;
import java.util.Date;

/**
 * Created by liujianmeng on 16/10/24.
 */
@WebService(endpointInterface = "test.HelloWorld",serviceName = "HelloWorlds")
public class HelloWorlds implements HelloWorld {
    public String sayHi(String name) {
        return name+"您好,显示时间是: "+new Date();
    }
}
