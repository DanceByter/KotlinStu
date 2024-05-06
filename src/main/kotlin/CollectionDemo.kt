//集合Collection
fun main() {

    //创建一个不可变List集合
    val list = listOf(1, 2, 3.0, 20.3)
    println(list)
    //创建一个可变的List集合
    val mutableList = mutableListOf(1, 2, 3.0, 20.3)
    println(mutableList)
    //添加元素
    mutableList.add(4)
    println(mutableList)
    //清空集合
    mutableList.clear()
    println(mutableList)
    //删除指定元素
    val mutableList1 = mutableListOf(1, 2, 3.0, 20.3)
    mutableList1.remove(2)
    println(mutableList1)
    //判断包含
    println(mutableList1.contains(2))
    println(mutableList1.contains(1))
    //判断非空
    println(mutableList1.isEmpty())
    mutableList1.clear()
    println(mutableList1.isEmpty())
    //计算大小
    val mutableList2 = mutableListOf(1, 2, 3.0, 20.3)
    println(mutableList2.size)
    //集合->数组
    val array = mutableList2.toTypedArray()
    println(array.joinToString())

    //迭代器遍历集合
    val mutableList3 = mutableListOf(1, 2, 3.0, 20.3)
    val it = mutableList3.iterator()
    while (it.hasNext()) {
        print(it.next())
        print(" ")
    }
    println(it.hasNext())
    //增强for循环迭代数组和集合
    for (it in mutableList3) {
        print("$it ")
    }
    println()
    //forEach简化书写
    mutableList3.forEach {
        print("$it ")
    }
    println()
    for (it in mutableList3) {
        if (it == 2) {
            break
        }
    }

    //使用List集合特有的方法
    val mutableList4 = mutableListOf(1, 2, 3.0, 20.3)
    //add(index,element)
    mutableList4.add(0, 0)
    println(mutableList4)
    //get(index)
    println(mutableList4.get(4))
    //remove(index)
    mutableList4.remove(0)
    println(mutableList4)
    //set(index,element)
    mutableList4.set(0, 0)
    println(mutableList4)
    println("__________________________")

    //HashSet
    val hashSet1 = hashSetOf(1, 3, 5, 7, 7, 8)
    println(hashSet1)
    println(hashSet1.hashCode())

    val hashSet2 = hashSetOf('a', 'c', 'b')
    println(hashSet2)
    println(hashSet2.hashCode())


}