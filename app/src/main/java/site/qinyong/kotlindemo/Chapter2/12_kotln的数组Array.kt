package site.qinyong.kotlindemo.Chapter2

import site.qinyong.kotlindemo.Chapter2.十包的概念.beijing.市委书记

val arrayOfInt: IntArray = intArrayOf(1,3,5,7)
val arrayOfChar: CharArray = charArrayOf('H', 'e','l','l','o','W','o','r','l','d')
val arrayOfString: Array<String> = arrayOf("我", "是", "码农")
val arrayOf书记: Array<市委书记> = arrayOf(市委书记("章"), 市委书记("赵"), 市委书记("黄"))

fun main(args: Array<String>) {
    println(arrayOfInt.size)                 //打印数组元素长度
    for(int in arrayOfInt){                  //循环打印数组元素
        println(int)
    }
    println(arrayOfInt.slice(1..2))   //截取数组元素

    println(arrayOfChar.joinToString())       //将数组中的元素拼接打印

    println(arrayOfString)                    //打印数组

    println(arrayOf书记[1])                   //修改数组元素
    arrayOf书记[1] = 市委书记("方")
    println(arrayOf书记[1])
}


