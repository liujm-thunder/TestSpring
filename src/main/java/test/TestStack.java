package test;

import org.junit.Test;

/**
 * Created by liujianmeng on 16/8/10.
 */
public class TestStack {


    private int count=0;
    public void recursion(){
        count++;
        recursion();
    }

    @Test
    public void PermGenGC(){
        for (int i =0;i<Integer.MAX_VALUE;i++){
            String t = String.valueOf(i).intern();
        }
    }

    @Test
    public void testStack(){

        try {
            recursion();
        }catch (Throwable e){

            System.out.println("deep of stack is "+ count);
            e.printStackTrace();
        }
    }


}
