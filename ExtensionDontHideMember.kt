package com.kotlindemo

class A{
    fun foo()=1
}
fun A.foo()=2    //Extension is shadowed by a member: public final fun foo(): Int :6  --> warning
fun A.foo(i:Int)="extension($i)"
fun main(){
    println(A().foo())
    println(A().foo(12))
    val f:()->Int?={null} // () -> Int? ===> return type nullable
    //{null}  ==> lambda without args always return null
    println(f)
    val f1:(()->Int)?=null // (()->Int)? ==> the variable is nullable
    println(f1)
}