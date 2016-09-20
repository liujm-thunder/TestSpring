package lintcode.stack;

import java.util.Stack;

/**
 * Created by liujianmeng on 16/9/19.
 */
public class SimplePath {
    /**
     * @param path the original path
     * @return the simplified path
     */
    public static String simplifyPath(String path) {
        // Write your code here
        Stack<String>  stack=new Stack<String> ();
        while(path.length()>0){
            int start=path.indexOf("/"); //第一个斜杠的位置
            path=path.substring(start+1); //Path一进被截取
            int end=path.indexOf("/");//第二个斜杠的位置
            if(end==-1)
                end=path.length();

            String part=path.substring(0,end);
            path=path.substring(end);

            // System.out.println(part+"  "+path);
            if(part.equals(".") || part.equals(""))
                continue;
            if(part.equals("src/main")){
                if(stack.isEmpty()==false)
                    stack.pop();
            }

            else stack.push("/"+part);
        }
        String result="";
        while(stack.isEmpty()==false){
            result=stack.pop()+result;
        }
        if(result.length()==0)
            result="/";
        return result;
    }

    public static void main(String[] args) {
        String path = "/User/liujianmeng/../libarary/";
        System.out.println(simplifyPath(path));
    }
}
