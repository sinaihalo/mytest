package interview;

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
    }
}
