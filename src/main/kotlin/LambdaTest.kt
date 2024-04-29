fun main() {

    //定义一个普通函数func1,输出Hello World
    fun func1() {
        println("Hello 😭")
    }

    //定义一个匿名函数作为函数类型赋给变量func2
    val func2 = fun() {
        println("Hello 😊")
    }

    //定义一个Lambda表达式
    val lambda: () -> Unit = fun() {
        println("this is a lambda")
    }

    //实战测试一个匿名函数
    val len1 = "killing".count();
    val len2 = "killing".count() { element ->
        element == 'i'
    }
    println(len1)
    println(len2)

    val func3: () -> Int = {
        5
    }

    val func4: (Int) -> String = { n ->
        "输出$n"
    }

    //如果只有一个参数，那么可以使用默认参数it
    val func5: (String) -> String = {
        "输出你的城市:$it"
    }

    //匿名函数的返回值推断
    val func6 = { a: Double, b: Int, c: Float ->
        "输出 a=$a,b=$b,c=$c"
    }


    //测试
    func1()
    func2.invoke()
    func2()
    lambda.invoke()

    println(func3.invoke())
    println(func4.invoke(520))
    println(func5.invoke("大连市"))
    println(func6.invoke(1.3, 2, 3f))

}