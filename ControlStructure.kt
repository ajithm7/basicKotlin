package com.kotlindemo
class Cat{
    fun meow(){
        print("meow meow...")
    }
}
class Dog{
    fun woof(){
        println("pow pow...")
    }
}
fun main(){
    checkMax()
    sayYesOrNo()
    petSelect()
}
fun checkMax(){
    println("Enter two numbers : ")
    val a:Int= readLine().toString().toInt()
    val b:Int= readLine().toString().toInt()
    val max=if(a>b) a else b
    println("Biggest number is $max")
}
fun sayYesOrNo(){
    println("\nSay Yes or No :")

    when( readLine().toString().toLowerCase()){
        "y","yes" -> println("I'm glad you agree")
        "n","no" -> println("Sorry to hear that")
        else -> println("I don't understand")
    }
}
fun  petSelect(){
    println("\n1 -> dog\n2 -> cat")
    val num= readLine().toString().toInt()
    when(val pet=getMyFavorite(num)){
        is Cat -> pet.meow()
        is Dog -> pet.woof()
    }
}
fun getMyFavorite(i:Int)=if(i==1)Dog() else Cat()