package site.qinyong.kotlindemo.Chapter3

/**
 * public class JavaMain {
 *   //Java中的常量如下
 *   public final String FINAL_HELLO_WORLD = "HelloWorld";
 * }
 *
 */

//val定义的量是不可改变的量，但是在编译期间它的值还是没有确定的
//虽然说val定义的量不可改变，但是还是可以通过反射的方式去更改
val FINAL_CONST: String = "HelloConst"

//我们甚至可以不用写类型就可以定义一个不可改变的量，这归功于编译器的类型推导
val FINAL_HELLO_CHINA = "HelloChina"

//val定义的量表示不可改变的量，但是在前面加上一个const表示这是一个编译期常量
//表示编译期间就已经赋值了，不能再改变了，所以说加上const的val变量表示编译期常量
const val FINAL_HELLO_WORLD: String = "HelloWorld"

//var定义的量表示变量
var helloWorld: String = FINAL_HELLO_WORLD

fun main(args: Array<String>) {

    //常量一旦初始化就不能修改其值
    //FINAL_HELLO_WORLD = "HelloDog"

    //变量可以更改
    helloWorld = "HelloSB"
}


