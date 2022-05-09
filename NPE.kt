package com.practise

import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable
import java.util.*

val name:String?=null //"Aji"
fun main(){
    //?. ->> safe access
    //?: --> elvis operator
    // !! --> making NPE explicit
    //
    @NotNull
    val s="ajith"
    @Nullable
    val n=null
    println("$s...$n")
    length()
    checkNullOrEmpty()
    println(check())
    valid()
    usingSafeCast()

}

fun length() {
    //println("Enter String : ")
    val str: String? = null
    //print(str?.length) -> o/p-> null  //if str=null
    val len = str?.length
    println(len) // --> o/p --> null
    val length1: Int = str?.length ?: 0
    println(length1)// --> o/p --> 0
    val length2: Int? = str?.length
    println(length2)// --> o/p --> null
    //println(str!!.length) --> o/p --> Throws NPE
    println()
}
fun checkNullOrEmpty(){
    val a:String="AJit"
    val b:String=""
    val c:String?=null
    println(a.isEmptyOrNull())
    println(b.isEmptyOrNull())
    println(c.isEmptyOrNull())
    println()
}

fun check():Boolean = name != null
fun valid(){
    val value=name!!
    println(value)
    println()
}
fun String?.isEmptyOrNull()=this?.length==0||this==null
fun usingSafeCast(){
    val place:String?=null
    println((place as? String)?.uppercase(Locale.getDefault()))
  /*  println(place is String)
    if(place is String){
        val s=place //as String
        println(s.toUpperCase())
        //println(s)
    }*/
}