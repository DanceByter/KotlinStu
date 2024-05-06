//class SimpleClass(a: Int, b: String) {
//    val c = 10L
//
//    fun printHello(){
//        println("hello world")
//    }
//
//    override fun simpleMethod() :Int{
//        println("i'm joshua")
//        return 1
//    }
//
//    override fun absMethod() {
//        println("😱")
//    }
//}

////定义一个接口，接口名为SimpleInterface
//interface SimpleInterface{
//    fun simpleMethod():Int{return 1}
//}
//
////定义一个抽象类，类名为AbstractClass
//abstract class AbstractClass{
//    abstract fun absMethod()
//    open fun absMethodOne(){}
//    fun absMethodTwo(){}
//}


//定义一个普通类，类名为Person
//class Person(age: Int, name: String) {
//    var age: Int = age
//        get() {
//            return field
//        }
//        set(value) {
//            field = value
//        }
//
//}

//测试init初始化代码块
//class TestInitOne(s: String, i: Int) {
//
//    var name: String? = null
//    var age = 0
//
//    init {
//        this.name = s
//        this.age = i
//        println("KotlinActivity,姓名：$name,$age")
//    }
//
//    fun printOne() {
//        println("KotlinActivity,姓名：$name,$age")
//    }
//
//}
//
////简化写法
//class TestInitTwo(var name: String, var age: Int) {
//
//    fun printTwo() {
//        println("KotlinActivity,姓名：$name,$age")
//    }
//
//}
//}


//class Student(name:String,age:Int){
//
//    init{
//        println("主构造函数的参数：name:${name},age:${age}")
//    }
//
//    var name = name+" Love"
//    var age = age + 1
//
//    init{
//        println("该对象的参数：name:${this.name},age:${this.age}")
//        println("主构造函数的参数：name:${name},age:${age}")
//    }
//
//}


//定义一个Parent接口
interface Person{
    //接口中的属性默认为public abstract
    val name:String
}

//定义一个Child实现类
class Child:Person{
    override val name:String="joshua"
}


fun main() {

//    val simpleClass=SimpleClass(2,"joshua")
//    println(simpleClass.a)
//    println(simpleClass.b)
//    println(simpleClass.c)
//    println(simpleClass.printHello())
//    println(simpleClass.simpleMethod())
//    println(simpleClass.absMethod())

//    val person = Person(22, "joshua")
//    println()
//    val testInitOne = TestInitOne("陈嘉豪", 22)
//    val testInitTwo = TestInitTwo("joshua", 22)
//    testInitOne.printOne()
//    testInitTwo.printTwo()

//    //不可空类型不能赋值为null
//    var notNull:String = "Hello"
//
//    //notNull = null会发生编译错误
//    val length1 = notNull.length
//
//    //但是有时候我们不确定类型是否可空
//    var ableNull:String? = "Hello"
//    //这时可以赋值null，即ableNull = null
//    ableNull=null
//    //我们可以用安全访问方式
//    val length2 = ableNull?.length
//    println(ableNull)


    //测试主构造函数
//    val student=Student("joshua",20)



}