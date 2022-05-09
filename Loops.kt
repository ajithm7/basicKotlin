package com.kotlindemo

fun main(){
    loopsRange()
    iterateInList()
    iterateOverMap()
    notInRange()
    rangeOfString()
    elementType()
    iteratingWithIndexs()
}
fun loopsRange(){
    for(i in 0..9 step 2){
        print(i)
    }
    println()
    for(i in 0 until 9 step 3){
        print(i)
    }
    println()
    for(i in 9 downTo  1 step 2){
        print(i)
    }
    println()
    val str  ="abcd"
    for(ch in str){
        print(ch+1)
    }
    println()
}
fun iterateInList(){
    val list=listOf("a","b","c")
   /* lateinit*/ var str:String=""
    for(ch in list){
        str+=ch
    }
    println(str)
}
fun elementType(){
    val list=listOf("a","b","c")
    /* lateinit*/ var str:String=""
    for(ch:String in list){
        str+=ch
    }
    println(str)
}
 fun iterateOverMap(){
     val map= mapOf<Int,String>(1 to "Ajith",2 to "Subash", 3 to "Sriram")
     for(entry in map){
         println("$entry")
     }
     for((key,value) in map){
         println("$key -> $value")
     }
 }
fun notInRange(){
    for(i in 1..9){
        if (i !in 0..5) print(i)
    }
    println()
}
fun rangeOfString(){
    println("Enter string : ")
    val str:String= readLine().toString()
    if(str in "a".."m") println("under single")
    if(str in "ab".."az")println("under double")
}
fun iteratingWithIndexs() {
    val list = listOf("a", "b", "c")
    for ((ind, ele) in list.withIndex()) {
        println("$ind,$ele")
    }
}