package com.kotlindemo
open class Parent
class Child:Parent()

fun main(){
    val parent:Parent=Child()
    val child=Child()
    println(parent.foo())
    println(child.foo())
}
fun Parent.foo()="parent"
fun Child.foo()="child"
