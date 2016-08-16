package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liujianmeng on 16/6/5.
 */
public class Resource {


    public static void main(String[] args) {
        String str = "AbcDGH";
        String strr = new String("AbcDGH");
        String part = "fg";
        str.length();
        System.out.println(str.hashCode()==strr.hashCode());
        System.out.println(str.contains(part));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        int[] a ={'1','3','4','5','6','7'};
        String strrt = new String(a,2,4);
        str.indexOf("ddd");
        System.out.println(strrt);
        List list = new ArrayList<String>();
        System.out.println(Math.ceil(2.3));
        System.out.println(Math.floor(2.3));
    }
}
