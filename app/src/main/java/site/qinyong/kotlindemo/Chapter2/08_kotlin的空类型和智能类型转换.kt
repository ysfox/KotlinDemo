package site.qinyong.kotlindemo.Chapter2



/*
//Java中对于getName()方法返回的值必须做判断，不判断获取到的值是不可预料的
public class  NullUnSafe {
    public static String getName(){
        return null;
    }

    public static void main(String... args) {
        //这里会发生空指针异常
        System.out.println(getName().length);
    }
}
*/


//编译失败，getAddress返回值必须为一个String，不能是null,只有可选类型才能是null
/*
fun getAddress(): String {
    return null
}*/


//如果返回值可能为null，则返回值为可选类型String?
fun getName(): String? {
    return null
}

fun main(args: Array<String>) {
    /*
    val name = getName()
    if(null == name){
      return
    }*/

    //上面的简写方式如下,它会尝试解析getName()的结果是否为String类型
    //如果解析成功则赋值给name，如果失败则返回
    val name: String = getName() ?: return
    print(name.length)


    //可选类型强制转换,可选类型如果确定它的类型，我们可以使用!!来解析结果
    val value: String? = "HelloWorld"
    print(value!!.length)

}