package site.qinyong.kotlindemo.Chapter2.十包的概念

import site.qinyong.kotlindemo.Chapter2.十包的概念.beijing.市委书记
import site.qinyong.kotlindemo.Chapter2.十包的概念.shanghai.市委书记 as 贪污书记
import site.qinyong.kotlindemo.Chapter2.十包的概念.tianjing.市委书记 as 地痞书记

fun main(args: Array<String>) {
    val 北京市市委书记: 市委书记 = 市委书记("张")
    val 上海市市委书记: 贪污书记 = 贪污书记("李")
    val 天津市市委书记: 地痞书记 = 地痞书记("刘")
}

