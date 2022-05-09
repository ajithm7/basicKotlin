package com.kotlindemo

class Person(val name:String,val age:Int)
/*
3
Ajith
25
Subash
24
Sriram
22
Ajith :25
Subash :24
Sriram :22
*/
fun main(){
    println("Enter the size of list")
    var num:Int= readLine().toString().toInt()
    var name:String
    var age:Int
    val list= mutableListOf<Person>()

    while (num--!=0){
        name= readLine().toString()
        age= readLine().toString().toInt()
        val person=Person(name,age)
        list.add(person)
    }
    for(i in list){
        println("${i.name} :${i.age}")
    }
    /*println("${person.name} : ${person.age}")*/
}