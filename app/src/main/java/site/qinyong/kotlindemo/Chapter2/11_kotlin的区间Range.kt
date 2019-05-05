package site.qinyong.kotlindemo.Chapter2

val range: IntRange = 0..1024                 //[0, 1024]
val range_exclusive: IntRange = 0 until 1024  //[0, 1024) = [0, 1023]
val empty_range: IntRange = 0..-1             //空区间

fun main(args: Array<String>) {
    println(range.contains(50))     //(true)判断区间range是否包含50
    println(50 in range)            //(true)判断50是否在区间range范围之内
    println(empty_range.isEmpty())  //(true)判断区间empty_range是否是空区间
    for (i in range_exclusive) {    //将区间的数字元素转换为字符串
        println("$i, ")
    }
}

