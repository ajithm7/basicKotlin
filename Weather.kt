package com.kotlindemo

enum class Color{
    BLUE,ORANGE,RED
}

fun main(){
    println("Enter the degree : ")
    val degree= readLine().toString().toInt()
     weatherUpdate(degree)
}
fun weatherUpdate(degree:Int) {
    val (description,color)=when{ //when without arguments
        degree<15 -> "cold" to Color.BLUE
        degree<25 -> "mild" to Color.ORANGE
        else -> "hot" to Color.RED
    }
    println("$description  ->  $color")

}