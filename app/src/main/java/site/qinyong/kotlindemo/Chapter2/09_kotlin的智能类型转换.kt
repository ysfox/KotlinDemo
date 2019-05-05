package site.qinyong.kotlindemo.Chapter2


fun main(args: Array<String>) {
    val parent: Parent = Parent()

    //Kotlin中的智能转换,parent对象如果能转换成Child类型则调用getName方法，
    //如果转换失败则返回null，KotLin中null调用任何方法都不错误
    (parent as? Child)?.name

    //Kotlin中智能转换的另外用法，判空
    val string: String? = "Hello"
    if(null != string){
        print(string.length)
    }
}


