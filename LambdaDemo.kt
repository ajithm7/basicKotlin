package com.kotlindemo

fun main(){
    usingList()
    multiLambda()
    destructuring()
    usingPartition()
    usingZip()
}
fun usingList(){
    val list= arrayListOf(1,3,4,8)
    val list1= list.filter({i->i%2==0})
    for(j in list1){
        println(j)
    }
    val list2= list.filter({it%2!=0})
    for(j in list2){
        println(j)
    }
    println("first")
    println(list.firstOrNull({it%9==0}))
}
fun multiLambda(){
    println("multi lambda")
    val list= arrayListOf(1,3,4,8)
    println(list.find { it%2==0 })
   println( list.any{
        println("processing $it")
        it>9
    })
}
fun destructuring(){
    val map= mapOf<Int,String>(1 to "Ajith",2 to "Subash",3 to "Sriram")
     println(map.mapValues { entry ->"${entry.key} -> ${entry.value}" })
    println()
    println(map.mapValues { (key,value) ->"$key -> $value" })
}
fun usingPartition(){
    println("partition")
    val list= arrayListOf(1,3,4,8)
    println(list.partition{ it%2==0 })
}
fun usingZip(){
    println("zip")
    val list= arrayListOf(1,3,4,8)
    val listChar= arrayListOf("a","b","c")
    println(list.zip(listChar))
    println("zipWithNext")
    val list1= arrayListOf(1,3,4,8)
    println(list1.zipWithNext())
}
fun usingFlatten(){
    println("FlattenMap")
    val name="abc"
    val name1="def"
    var list= mutableListOf<Char>()
    //list.flatMap { name,name1}
}