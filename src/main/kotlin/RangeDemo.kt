//区间Range
fun main() {

    //闭区间的创建
    val intRange = 1..10
    val charRange = 'a'..'z'
    val longRange = 1L..100L

    //前闭后开的区间
    val intRangeExclusive = 1 until 10
    val charRangeExclusive = 'a' until 'z'
    val longRangeExclusive = 1L until 100L

    //倒序区间
    val intRangeReverse = 10 downTo 1
    val charRangeReverse = 'z' downTo 'a'
    val longRangeReverse = 100L downTo 1L

    //设置步长，离散区间的特性，默认步长都是1
    val intRangeWithStep = 1..10 step 2
    val charRangeWithStep = 'a'..'z' step 2
    val longRangeWithStep = 1L..100L step 2

    //无符号类型的区间
    val uIntRange = 1U..10U
    val uLongRange = 1UL..10UL

    //打印离散区间的值
    println(intRange.joinToString())
    println(intRangeExclusive.joinToString())
    println(intRangeReverse.joinToString())
    println(intRangeWithStep.joinToString())
    println(uIntRange.joinToString())

    //连续区间
    val floatRange = 1.0f..10.0f
    val doubleRange = 1.0..10.0

    //判断一个元素是否在区间中
    if (5 in intRange) {
        println("5 is in intRange")
    } else {
        println("5 is not in intRange")
    }

    if (15 !in intRange) {
        println("15 is not in intRange")
    } else {
        println("15 is in intRange")
    }

    //区间的迭代
    for (element in intRange) {
        print("$element ")
    }
    println()
    //调用了for(element in intRange)
    intRange.forEach {
        print("$it ")
    }
    println()

    //数组的迭代
    val intArray = arrayOf(11, 22, 33)
    for (i in 0 until intArray.size) {
        print(intArray[i])
        print(" ")
    }
    println()
    //本质还是for(i in 0 until intArray.size)
    for (i in intArray.indices) {
        print(intArray[i])
        print(" ")
    }


}