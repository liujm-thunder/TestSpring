package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liujianmeng on 16/10/24.
 */
public class BlockQueue {
    private List list = new ArrayList();

    public synchronized Object pop() throws InterruptedException {
        if (list.size()==0){//如果队列为空则等待
            this.wait();
        }
        if (list.size()>0){//队列不为空,则返回第一个对象
            return list.remove(0);
        }else return null;

    }


    public synchronized void put(Object o){
        list.add(o);        //增加对象到队列中
        this.notify();//唤醒等待该对象的线程
    }

}
