package test;

/**
 * Created by liujianmeng on 16/10/11.
 */
public class HelloApiStaticFactory {
        public static HelloApi newInstance(String message){
            return new HelloImpl2(message);
        }
}
