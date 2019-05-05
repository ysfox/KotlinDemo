package site.qinyong.kotlindemo.Chapter3

//main函数表示入口函数，返回值为Unit，Unit相当于Java中的void
//如果返回值类型为Unit则可以省略不写
//传递的参数args可以从外面传递进来
fun main(args: Array<String>):Unit {

    checkArgs(args)

    val arg1 = args[0].toInt()
    val arg2 = args[1].toInt()
    println("$arg1 + $arg2 = ${add(arg1, arg2)}")

    //调用匿名函数int2Long
    println(int2Long(6))
}

//检查参数个数的函数
fun checkArgs(args: Array<String>) {
    if(args.size > 1) {
        printUsage()
        System.exit(-1)
    }
}

//没有参数没有返回值的函数
fun printUsage(){
    println("请传递至少两个整型字符串参数，例如1，2")
}

//普通函数，相加函数，有参数有返回值的函数
fun add(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}

//如果这个函数的函数体直接是一个表达式的值，那么可以简写如下
//其实这个函数和上面的函数等价
fun sum(arg1: Int, arg2: Int): Int  = arg1 + arg2


//匿名函数,如果我们定义一个变量接收某个函数的返回结果
//那么我们可以将这个函数写成一个匿名函数
//这个类似于C语言中的函数指针
val int2Long = fun(x: Int):Long{
    return x.toLong()
}