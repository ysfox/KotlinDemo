package site.qinyong.kotlindemo.Chapter2

//Int类型
val anInt: Int = 8
val anotherInt: Int = 0xFF
val moreInt: Int = 0b00000011
val maxInt: Int = Int.MAX_VALUE
val minInt: Int = Int.MIN_VALUE

//Long类型
val aLong: Long = 12368172397127391
val anotherLong: Long = 123
val maxLong: Long = Long.MAX_VALUE
val minLong: Long = Long.MIN_VALUE

//Float类型
val aFloat: Float = 2.0F
val anotherFloat: Float = 1E3f
val maxFloat: Float = Float.MAX_VALUE
val minFloat: Float = -Float.MAX_VALUE

//Double类型
val aDouble: Double = 3.0
val anotherDouble: Double = 3.1415926
val maxDouble: Double= Double.MAX_VALUE
val minDouble: Double= -Double.MAX_VALUE

//Short类型
val aShort: Short = 127
val maxShort: Short = Short.MAX_VALUE
val minShort: Short = Short.MIN_VALUE

//Byte类型
val maxByte: Byte = Byte.MAX_VALUE
val minByte: Byte = Byte.MIN_VALUE


fun main(args: Array<String>) {

    print("============Int=============\n")
    println(anInt)
    println(anotherInt)
    println(moreInt)
    println(maxInt)
    println(Math.pow(2.0, 31.0) - 1)
    println(minInt)
    println( - Math.pow(2.0, 31.0))


    print("============Long=============\n")
    println(aLong)
    println(anotherLong)
    println(maxLong)
    println(Math.pow(2.0, 63.0) - 1)
    println(minLong)
    println(- Math.pow(2.0, 63.0))


    print("============Float=============\n")
    println(aFloat)
    println(anotherFloat)
    println(maxFloat)
    println(minFloat)


    print("============Double=============\n")
    println(aDouble)
    println(anotherDouble)
    println(maxDouble)
    println(minDouble)


    print("============Short=============\n")
    println(aShort)
    println(maxShort)
    println(minShort)


    print("============Byte=============\n")
    println(maxByte)
    println(minByte)
}