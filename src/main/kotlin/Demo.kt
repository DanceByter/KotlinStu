fun main() {
//simpleStart

    //基本类型
//    val a = 2
//    val b = "hello world"
//    val c = 123456789L
//    //类型转换
//    val d = 4
//    val e = d.toLong()
//    //字符串
//    val str = "我😍中国"
//    println("输出$str")
//    println("输出${str.length}")
//    println("输出\n${str.length}")
//    //类型比较
//    val str1 = "joshua"
//    val str2 = String("joshua".toCharArray())
//    println(str1 == str2)
//    println(str1 === str2)
//    val str3="""
//        *
//        **
//        ***
//        ****
//    """.trimIndent()
//    println(str3)

    //************************************

    //创建一个带元素的一维数组
//    val simpleArray = arrayOf(1, 2, 3)
//    println(simpleArray.joinToString())
    //创建一个不带元素大小固定类型固定的一维数组
//    val nullArray = arrayOfNulls<Int>(5)
//    println(nullArray.joinToString(" "))
    //创建一个大小不固定类型固定的数组
//    val emptyArray = emptyArray<Int>()
//    println(emptyArray.joinToString())
    //创建一个二维数组
//    val twoDArray = Array(2) { Array<Int>(2) { 0 } }
//    println(twoDArray.contentDeepToString())
    //创建一个三维数组
//    val threeDArray = Array(2) { Array(3) { Array<Int>(3) { 0 } } }
//    println(threeDArray.contentDeepToString())
    //比较数组
    //创建两个个int数组，分别用contentEquals()和contentDeepEquals()进行比较
//    val oneArray = arrayOf(1, 2, 3)
//    val twoArray = arrayOf(1, 2, 3)
//    println(oneArray.contentEquals(twoArray))
//    oneArray[0] = 10
//    println(oneArray.contentEquals(twoArray))
//    println(oneArray contentEquals twoArray)
    //创建两个多维数组进行比较
//    val threeDArray = Array(2) { Array(2) { Array<Int>(2) { 0 } } }
//    val fourDArray = Array(2) { Array(2) { Array<Int>(2) { 1 } } }
//    println(threeDArray.contentDeepToString())
//    println(fourDArray.contentDeepToString())
//    println(threeDArray contentEquals fourDArray)
    //创建一个int数组用sum()求和
//    val fiveArray = arrayOf(1, 2, 3, 4)
//    println(fiveArray.sum())
    //用fiveArray数组测试shuffle()
//    fiveArray.shuffle()
//    println(fiveArray.joinToString())
    //测试原生数组
//    val sixArray = IntArray(3) { it + 1 }
//    val sixArrayDemo = arrayOf(0, 0, 0)
//    val sixArrayElse = intArrayOf(1, 2, 3)
//    val sixArrayD = Array(2) { Array(2) { it } }
//    println(sixArray.size)
//    println(sixArray.joinToString())
//    println(sixArrayDemo.joinToString())
//    println(sixArrayElse.joinToString())
//    println(sixArrayElse.contentToString())
//    println(sixArrayD.contentToString())
//    println(sixArrayD.contentDeepToString())
//    println(sixArrayD.joinToString())
//    val sevenArray = arrayOfNulls<String>(5)
    //使用迭代器遍历数组
//    val eightArray= arrayOf(1,2,3,4,5)
//    for (e in eightArray){
//        print("$e,")
//    }
//    println()
//    eightArray.forEach { element->
//        print("$element,")
//    }

    //************************************

    //变量与只读变量测试
//    var a=4
//    val b=4
//    println("$a $b")
//    a=5
//    println("$a $b")

    //匿名函数测试
    //定义普通函数
//    fun func1() {
//        println("hello world")
//    }
//    //使用匿名函数定义普通函数
//    val func2 = fun() {
//        println("hello world")
//    }
//    //测试
//    func1()
//    func2()
//    func2.invoke()

    //************************************

//simpleEnd
}
