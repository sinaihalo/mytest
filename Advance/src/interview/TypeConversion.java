package interview;

/**
 * @version:
 * @Description:
 * @author: hxk
 * @date: 2021/3/17
 */
public class TypeConversion {
    public static void main(String[] args) {

    }
    void m1 (){
        String s = "你好"; int i=3; s +=i;// stringbuilder append
    }
    void m2 (){
        //String s = "你好"; int i=3; if(s==i){s +=i};
                                      //类型相同才能比
    }
    void m3 (){
        String s = "你好"; int i=3; s =i+s;
    }
    void m4 (){
        //String s = "你好"; int i=3; s =i+;
    }
    void m5 (){
        String s = null; int i=(s!=null)&&(s.length())>0?s.length():0;
    }
}
