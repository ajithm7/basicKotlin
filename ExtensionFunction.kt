package com.kotlindemo
fun main(){
    findLastChar()
}
fun findLastChar(){
    println("Enter String ")
    val s= readLine().toString()
    println(s.lastChar())
}
fun String.lastChar()=get(length-1)