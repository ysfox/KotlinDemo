package site.qinyong.kotlindemo.Chapter2;

public class TypeCast {
    public static void main(String... args) {
        Parent parent = new Parent();
        //提示转换失败
        //System.out.println(((Child)parent).getName());

        //需要判断类型是否为Child，如果parent为Child类型才执行getName()
        if(parent instanceof Child) {
            System.out.println(((Child)parent).getName());
        }
    }
}
