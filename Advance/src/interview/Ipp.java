package interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @version:
 * @Description:
 * @author: hxk
 * @date: 2021/3/17
 */
public class Ipp {
    public int method(){
         int i=0;//不能定义static变量
        ++i;
        System.out.println(i);//1
        return i;//得有返回值
    }
    public static void main(String[] args) {
        new Ipp().method();
        new Ipp().method1();
    }
    void method1(){//方法：入参出参必有
        int x = 1,y=2,z=3;
        y+=z--/++x;
        System.out.println(y);//3
        List l = new LinkedList();
        ((LinkedList) l).removeLast();
        l = new ArrayList();

    }
}
