package site.qinyong.kotlindemo.Chapter2

val aIntNumber: Int = 5
//不能直接赋值，必须强制转换
val aLongNumber: Long = aIntNumber.toLong()

fun main(args: Array<String>) {
    println(aIntNumber)
    println(aLongNumber)
}