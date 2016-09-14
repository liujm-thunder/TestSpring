package test.conCurrentMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by liujianmeng on 16/9/2.
 */
public class TestConCurrentMp {
    private final Map<String, Long> wordCount = new ConcurrentHashMap<String, Long>();

    public long increase(String word) {
        Long oldValue = wordCount.get(word);
        Long newvalue = (oldValue == null) ? 1L : oldValue + 1;
        wordCount.put(word, newvalue);
        return newvalue;
    }


    private final ConcurrentHashMap<String, Long> wordCounts = new ConcurrentHashMap<String, Long>();

    public long increase1(String word) {
        Long oldValue;
        Long newValue;
        while (true) {
            oldValue = wordCounts.get(word);
            if (oldValue == null) {
                newValue = 1L;
                if (wordCounts.putIfAbsent(word, newValue) == null) {
                    break;
                }
            } else {
                newValue = oldValue + 1;
                if (wordCounts.replace(word, oldValue, newValue)) {
                    break;
                }
            }
        }
        return newValue;
    }


    private final ConcurrentHashMap<String, AtomicLong> wordCountss = new ConcurrentHashMap<String, AtomicLong>();

    public long increase2(String word){
        AtomicLong number = wordCountss.get(word);
        if (number==null){
            AtomicLong newNumber = new AtomicLong(0);
            number = wordCountss.putIfAbsent(word,newNumber);
            if (number==null){
                number=newNumber;
            }
        }
        return number.incrementAndGet();
    }

    public static void main(String[] args) {
        AtomicInteger ai=new AtomicInteger(0);
        int i1=ai.get();
        System.out.println(i1);
        int i2=ai.getAndSet(5);
        System.out.println(i2);
        int i3=ai.get();
        System.out.println(i3);
        int i4=ai.getAndIncrement();
        System.out.println(i4);
        System.out.println(ai.get());
    }

    static void v(int i)
    {
        System.out.println("i : "+i);
    }



}
