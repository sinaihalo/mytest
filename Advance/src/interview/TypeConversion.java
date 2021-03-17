package interview;

/**
 * @version:
 * @Description:
 * @author: hxk
 * @date: 2021/3/17
 */
public class TypeConversion {
    public static void main(String[] args) {
        new TypeConversion().m6();
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
    void m6(){
        int a = 129;int b = 129;System.out.println(a==b);
        /*
         * 当==两边是对象时（String,Integer...），两边比的都是地址
           当==两边是基本类型时(int,float)，两边比的都是值
           默认equals比的是对象的地址，但是重写的话可以改变成比较值，String和Integer的equals就是重写过的
        */
    }
}
