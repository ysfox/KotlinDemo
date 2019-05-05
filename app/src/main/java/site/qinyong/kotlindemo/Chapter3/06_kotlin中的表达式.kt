package site.qinyong.kotlindemo.Chapter3

private const val USERNAME = "kotlin"
private const val PASSWORD = "jetbrains"

private const val ADMIN_USER = "admin"
private const val ADMIN_PASSWD = "admin"

private const val DEBUG = 1
private const val USER = 0



fun main(args: Array<String>) {
    //kotlin中的if语句是有返回值的，返回值是每一个分支的最后一句表达式
    val mode = if(args.isNotEmpty() && args[0] == "1"){
        DEBUG
    } else {
        USER
    }

    println("请输入用户名: ")
    val username = readLine()
    println("请输入密码: ")
    val passwd = readLine()

    if(mode == DEBUG && username == ADMIN_USER && passwd == ADMIN_PASSWD) {
        println("管理员登录成功")
    } else if(username == USERNAME && passwd == PASSWORD) {
        println("登录成功")
    } else {
        println("登录失败")
    }

}




class PlayerKt {

    //定义枚举
    enum class State {
        IDLE, BUFFERING, PLAYING, PAUSED
    }

    //Java中的switch只支持byte，char，short，int，另外在jdk6以后还支持String和枚举enum
    //Kotlin中的switch支持任何数据类型
    private var state = State.IDLE

    fun pause() {
        when (state) {
            PlayerKt.State.BUFFERING, PlayerKt.State.PLAYING -> doPause()
            else -> {
                println("做别的事情")
            }
        }
    }

    private fun doPause() {
        state = State.PAUSED
    }
}