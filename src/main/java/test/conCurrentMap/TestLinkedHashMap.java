package test.conCurrentMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by liujianmeng on 16/9/7.
 */
public class TestLinkedHashMap {

    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<String, String>(16,0.75f,true);
        map.put("1","aa");
        map.put("2","bb");
        map.put("3","cc");
        map.put("4","dd");

        for (Iterator iterator = map.keySet().iterator();iterator.hasNext();){
            String name = (String) iterator.next();
            System.out.println(name+"-->>"+map.get(name));
        }
    }
}
