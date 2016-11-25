package test;

/**
 * Created by liujianmeng on 16/10/11.
 */
public class HelloImpl2  implements HelloApi{
    private String message;
    public HelloImpl2(String message){
        this.message = message;
    }

    public void sayHello(){
        System.out.println(message);
    }
}
