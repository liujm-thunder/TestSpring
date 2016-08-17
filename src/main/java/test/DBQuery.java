package test;

/**
 * Created by liujianmeng on 16/8/16.
 */
public class DBQuery implements IDBQuery {

    public DBQuery() {
        try {
            Thread.sleep(1000);//可能包括数据库的耗时操作
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String request() {
        return "request string";
    }
}
