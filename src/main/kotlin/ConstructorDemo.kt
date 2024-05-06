class Student constructor(name: String, age: Int) {

    init {
        println("主构造函数参数 : name : ${name} , age : ${age} ;")
    }

    var name: String = name + " Love"
    var age: Int = age + 1

    init {
        println("成员变量 : name : ${this.name} , age : ${this.age} ; ")
        println("主构造函数参数 : name : ${name} , age : ${age} ;")
    }

    //身高成员变量
    var height: Int = 0;

    constructor(name: String, age: Int, height: Int) : this(name, age) {
        this.height = height
    }

    fun printStudent() {
        println("name:${this.name},age:${this.age},height:${this.height}")
    }

}


fun main() {

    //调用主构造函数
    var student: Student = Student("Tom", 18)
    println(student.printStudent())

    //调用次构造函数
    var student2 = Student("Jerry", 18, 165)
    println(student2.printStudent())

}
