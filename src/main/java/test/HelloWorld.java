package test;

import javax.jws.WebService;

/**
 * Created by liujianmeng on 16/10/24.
 */
@WebService
public interface HelloWorld {
    String sayHi(String name);

}
