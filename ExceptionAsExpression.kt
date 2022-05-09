@file:JvmName("ExceptionAsExp")
package com.kotlindemo

import java.io.IOException

fun main(args: Array<String>){
    usingThrow()
    usingTry()
    println("Hello, ${args.getOrNull(0)}!")
}

fun usingThrow(){
    println("Enter number to check percentage : ")
    val number:Int= readLine().toString().toInt()
    val percentage=if(number in 1..100 )  number else throw java.lang.IllegalArgumentException("A percentage value must be between 0 and 100: $number")
    println("$percentage in percentage")
}

fun usingTry(){
    println("Enter string to check number or null : ")
    val string:String= readLine().toString()
    val number:Int?=try{
        string.toInt()
    }catch(e : NumberFormatException){
       // return //--> throws exception
        null
    }
    println("You enter a number $number")
}
@Throws(IOException::class)
fun throwAnnotation(){
    throw IOException()
}
