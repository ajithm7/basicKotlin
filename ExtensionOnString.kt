package com.kotlindemo

fun main(){
    usingTrimMargin()
    usingTrimMarginWithStraightLine()
    usingTrimMarginWithHash()
    usingTrimIndent()
}
fun usingTrimMargin(){
    val q="""To code,
        or not to code""".trimMargin()
    println(q)
}
fun usingTrimMarginWithStraightLine(){
    val q="""To code,
        |or not to code""".trimMargin()
    println(q)
}
fun usingTrimMarginWithHash(){
    val q="""To code,
        #or not to code""".trimMargin(marginPrefix = "#")
    println(q)
}
fun usingTrimIndent(){
    val q="""
        To code,
                 or not to code""".trimIndent()
    println(q)
}