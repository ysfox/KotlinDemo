package site.qinyong.kotlindemo.Chapter3


//普通函数具名函数
fun sum1(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}

//这个也是一个具名函数
//如果这个函数的函数体直接是一个表达式的值，那么可以简写如下
//该Lambda表达式的类型是(Int, Int) -> Int
fun sum2(arg1: Int, arg2: Int): Int  = arg1 + arg2

//在简写一下就成了Lambda表达式，Lambda表达式的参数和返回值之间用->来分割，但是也不是绝对的
//Lambda表达式其实就是匿名函数
val sum3 = {arg1: Int, arg2: Int -> arg1 + arg2}

//Lambda表达式的参数和返回值之间用->来分割，但是也不是绝对的
//如果没有参数则可以将->省略掉,该Lambda表达式的类型是()->Unit
val printlnHello = { println("Hello") }

//Lambda表达式的表达式不仅仅只有一行，我们可以在->后面写多个表达式
//但是只有最后一个表达式的结果才是Lambda表达式的返回值
val sum4 = {arg1: Int, arg2: Int ->
    println("$arg1 + $arg2 = ${arg1 + arg2}")
    arg1 + arg2         //这一句表达式的结果才是Lambda表达式的返回值
}

//这个是一个匿名函数，匿名函数其实就是Lambda表达式
val intToLong = fun(x: Int):Long {
    return x.toLong()
}

//Lambda表达式其实就是匿名函数
fun main(args: Array<String>) {

    //函数的调用方式
    println(sum1(1,2))
    println(sum2(1,2))

    //Lambda表达式的调用方式
    //调用Lambda表达式,这里调用使用(),这个()其实相当于invoke
    println(sum3(1,2))
    //这个()其实相当于invoke，invoke相当于
    println(sum3.invoke(1,2))

    println(sum4(1,2))
    println(sum4.invoke(1,2))

    printlnHello()
    printlnHello.invoke()


    //Lambda表达式的循环
    //这个it参数实际值传递参数是这个样子
    args.forEach ({it -> println(it)})
    //我们可以将外面的括号去掉，简写如下
    args.forEach { it -> println(it) }


    //加上括号(),其实传递的参数就是println这个表达式
    args.forEach ({ println(it)})
    //我们还可以将()移动到外面去
    args.forEach() { println(it)}
    //如果括号没有参数我们还可以将()省略
    args.forEach { println(it)}
    //如果传递的这个函数和这个接收的Lambda表达式类型是一样的
    //我们还可以将其写成reference的方式
    //这里用::来引用一个函数println
    args.forEach(::println)


    //具有筛选的Lambda表达式
    args.forEach {
        //这里因为是Lambda表达式，返回的是main函数
        if(it == "3") return
        println(it)
    }
    //这句执行不到
    println("print end")

    args.forEach ForEach@{
        //如果要在Lambda表达式返回值当前Lambda则需要做一个标记ForEach@
        if(it == "3") return@ForEach
        println(it)
    }
    //这句执行到
    println("print end")


    //打印具名函数类型,具名函数类型是打印不出类型的
    println(::sum1)
    //具名函数类型可以通过is的方式来判断类型
    println(::sum2 is ((Int, Int) -> Int))
    //打印Lambda表达式的类型
    println(sum3)
    println(sum4)
    println(printlnHello)
    println(intToLong)

    //kotlin中的函数参数不能超过23个，否则出错
}



