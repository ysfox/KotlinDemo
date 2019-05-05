package site.qinyong.kotlindemo.Chapter3

//自定义复数类，该类有两个参数实部real和虚部imagenary
//该类中我们自定义的相加运算符plus
class Complex(var real:Double, var imagenary:Double){
    //自定义相加运算符plus
    operator fun plus(other:Complex): Complex{
        return Complex(real + other.real, imagenary + other.imagenary)
    }

    //自定义相加运算符plus
    operator fun plus(other: Int): Complex{
        return Complex(real + other, imagenary)
    }

    //自定义相加运算符plus
    operator fun plus(other: Any): Int{
        return real.toInt()
    }

    //自定义invoke方法
    operator fun invoke(): Double{
        //求默运算
        return Math.hypot(real, imagenary)
    }

    //重写toString方法
    override fun toString(): String {
        return "$real + $imagenary"
    }
}

//自定义中缀表达式
class Book{
    infix fun on(any: Any):Boolean{
        return false
    }
}
class Desk


fun main(args: Array<String>){
    val c1 = Complex(3.0, 4.0)
    val c2 = Complex(2.0, 7.5)
    val c3 = c1 + c2
    println(c3)

    //调用自定义plus方法
    val c4 = c3 + 5
    println(c4)

    //调用invoke运算符
    println(c1())


    if("-name" in args){
        println(args[args.indexOf("-name") + 1])
    }

    //调用中缀表达式
    if(Book() on Desk()){
        println("Book on Desk")
    }

}