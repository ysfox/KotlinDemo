package site.qinyong.kotlindemo.Chapter2

val string: String = "HelloWorld"
val fromChars: String = String(charArrayOf('H', 'e','l','l','o','W','o','r','l','d'))

fun main(args: Array<String>) {
    println(string == fromChars)    //比较字符串是否相同
    println(string === fromChars)   //比较字符串地址是否相同
    println(string)                 //输出字符串string

    //字符串相加有两种方式
    val arg1: Int = 0
    val arg2: Int = 1
    println("" + arg1 + " + " + arg2 + " = " + (arg1 + arg2))
    println("$arg1 + $arg2 = ${arg1 + arg2}") //这种写法比上面的写法方便

    //转移字符"
    val sayHello : String = "Hello \"Trump\""
    println(sayHello)

    //转移字符$
    val salary: Int = 1000
    println("\$salary")

    //大文本不转移
    val rawString: String = """
        \t
        \n
\\\\\\$$$ salary
    """
    println(rawString)
    println(rawString.length)
}