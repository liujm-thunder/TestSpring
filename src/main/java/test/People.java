package test;

/**
 * Created by liujianmeng on 16/10/10.
 */
public class People {
    private String name;
    private String age;
    public People(String name,String age){
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
