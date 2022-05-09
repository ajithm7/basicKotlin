package com.kotlindemo

fun main(args:Array<String>){
    helloWorld()
    println("Hello,${args.getOrNull(0)}!")
    println("Hello,${null}!")
    println(listOf("a","b","c").joinToString ("","(",")")) // default => "," "" ""
    println(sum(a=5))
    println(sum())
    iteratingWithIndex()

}
fun helloWorld(){
    val name="Ajith"
    println("Hello, $name!")
}

fun sum(a:Int=1,b:Int=2,c:Int=3)=a+b+c

fun sum(a:Int=1,b:Int=2)=a+b
//@JvmOverloads //when we call from java as sum() It doesn't show any error. otherwise compiler error will be thrown
fun sum(d:Int=1)=d
/*fun sum()=0*/

fun iteratingWithIndex(){
    val list=listOf("a","b","c")
    for((ind,ele) in list.withIndex()){
        println("$ind,$ele")
    }
}