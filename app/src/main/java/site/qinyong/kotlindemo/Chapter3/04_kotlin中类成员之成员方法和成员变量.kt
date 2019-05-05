package site.qinyong.kotlindemo.Chapter3

//类的成员方法
class 妹子(var 性格: String, var 长相: String, var 声音: String){
    fun 唱歌(歌名: String){
        println("妹子正在唱歌: $歌名")
    }

    fun 跳舞(舞蹈名: String) {
        println("妹子正在跳舞: $舞蹈名")
    }
}


//类的成员变量的set和get
class A{
    //这个成员变量默认就实现了get和set方法
    var a = 0
    //如果我们想要在get和set方法中事项额外的代码，则需要我们重写get和set方法并在该方法中添加额外的代码
    get() {
        println("这里是get方法中的额外代码")
        return field
    }
    set(value) {
        println("这里是set方法中的额外代码")
        a = value
    }

}

//类的成员变量的权限
class B{
    var b = 0
    //如果想控制成员变量的属性权限，可以在set和get前面加上权限控制符
    //这里在set前面加上private全向修饰符则外界只能通过getB获取成员变量b的值而不能通过set给b设置权限
    private set
}

//类的成员变量默认权限是public,所以在设置set和get方法的时候需要和成员变量的修饰符一致才可以
class C{
    //类的成员变量为private的时实际上没有必要给set和get前面加上set和get，因为没有意思
    private var c = 0
    private set
    private get

    //protected修饰符只能在子类中调用，外部不能调用
    protected var c1 = 0
    protected set
    protected get

    //类的成员变量的默认权限是public，所以写public和不写public都是一样的
    public var c2 = 0
    public set
    public get

}


//类的成员变量的初始化和延迟初始化,常量的延迟初始化，可选类型的初始化
class D{
    //类的基本数据类型的变量初始化直接给基本数据类型默认值即可
    //比如Int使用0来初始化，boolean使用false来初始化
    var d1 = 0
    //但是对于非基础数据类型的变量，虽然我们可以使用空字符串来初始化，但是这会占据内存
    var d2: String = ""
    //所以我们可以使用延迟初始化来设置它
    lateinit var d3: String
    //lateinit只针对于变量，不能针对常量
    //lateinit val d4: String
    //常量的延迟初始化只能使用delegate lazy的方式初始化
    //lazy其实就是一个Lambda表达式，我们在表达式中初始化一个对应类型的实例对象即可
    val d5: String by lazy {
        "lazy str"
    }

    //可选类型的初始化为null
    var d6: String? = null
}

fun main(args: Array<String>) {
    val 莫文蔚 = 妹子("温柔", "优雅", "甜美")
    莫文蔚.唱歌("当你老了")
    莫文蔚.跳舞("天鹅湖")


    val a = A()
    a.a = 10
    println(a.a)

    val b = B()
    //b.b = 12   //外界无法设置b的值，因为set方法的权限是private
    println(b.b)


    //类的成员变量的初始化和延迟初始化
    val d = D()
    println(d.d1)
    println(d.d2)
    d.d3 = "d3"     //这里必须初始化，不初始化则会报错提示d3没有初始化
    println(d.d3)
    println(d.d5)
    //对于可选类型的成员变量必须使用强解析和软解析之后才能调用对应类型的方法
    println(d.d6!!.length)
    println(d.d6?.length)
}