//变长参数
fun multiParameters(vararg Ints:Int){
    println(Ints.joinToString())
}

//匿名函数
val func=fun(){
    println("匿名函数")
}//这种写法类似于普通函数的定义，因为函数名，参数，返回值都有

//Lambda表达式
val lambda={//这里是把fun()省略了
    println("Lambda表达式")
}


fun main() {

    multiParameters(1,2,3,4)
    var name = "joshua"
    println("""
        *
       ***
      *****
     *******
      *****
       ***
        *
    """.trimIndent())

}