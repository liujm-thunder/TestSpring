package test;

/**
 * Created by liujianmeng on 16/9/5.
 */
public class SplitStr {
    public static void main(String[] args) {
        String orgStr = null;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
            sb.append(";");
        }
        orgStr = sb.toString();


        for (int i = 0; i < 1000; i++) {
            orgStr.split(";");
        }


    }
}
