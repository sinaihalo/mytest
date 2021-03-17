package interview;

/**
 * @version:
 * @Description:变量初始化
 * @author: hxk
 * @date: 2021/3/17
 */
public class VariableInitializationCode {
    int n ;//成员变量会初始化
    static int m;//静态成员变量会初始化
    public static void fun(){
        System.out.println(m);
        System.out.println(new VariableInitializationCode().n);

    }
    public static void main(String[] args) {
        fun();
        System.out.println(new VariableInitializationCode().n);
    }
    /*modify 报错在20行，k属于局部变量，没有初始化 */
    public void modify(){
        int i,j,k;//局部变量不会初始化，得手动
        i = 100;
        while (i>0){
            j = i+2;
            System.out.println("J:"+j);
            /*k = k +1;*/
        }
    }
}
