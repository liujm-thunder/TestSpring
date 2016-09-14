package test.conCurrentMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liujianmeng on 16/9/5.
 */
public class removeEntry {

    /**
     * hashMap remove操作报异常
     */


    public static void main(String[] args) {
        Map<Long, String> mreqPacket = new HashMap<Long, String>();
        for (long i = 0; i < 15; i++) {
            mreqPacket.put(i, i + "");
        }

        for (Map.Entry<Long, String> entry : mreqPacket.entrySet()) {
            long key = entry.getKey();
            String value = entry.getValue();
            if (key < 10) {
                mreqPacket.remove(key);
            }
        }


        for (Map.Entry<Long, String> entry : mreqPacket.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        /**
         * 使用迭代器删除元素
         */
//        for (Iterator<Map.Entry<Long, String>> iterator = mreqPacket.entrySet().iterator(); iterator.hasNext(); ) {
//            Map.Entry<Long, String> entry = iterator.next();
//            long key = entry.getKey();
//            if (key < 10) {
//                iterator.remove();
//            }
//        }
//
//        for (Map.Entry<Long, String> entry : mreqPacket.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }







    }
}
