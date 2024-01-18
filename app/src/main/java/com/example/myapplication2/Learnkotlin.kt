package com.example.myapplication2

import kotlin.math.max

//fun main(){
//   for (i in 0..10 step 2)
//    println(i)
//}
//fun main(){
//    val a = 10
//    val b = 50
//    var c = sc(a,b)
//    println("maxnumber is "+c)
//}
//fun sc(a: Int ,b:Int ):Int =  max(a,b)
//data class Learner(var name:String ,var age:Int )


//fun main(){
//    val list = mutableListOf<String >("sfsaf","dfaf","sfe","sdf")
//    list.add("khk")
//    val list1 = list.map { it.uppercase() }
//    val newlist = list1.maxBy {list1:String ->list1.length }
//for (i in newlist  ){
//    println(i)
//}
//}
//val content:String = "EXO "
//fun main(){
//  if (content !=null ){
//      sc()
//  }
//
//}
//fun sc(){
//    println(content +"are one!")
//}
val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
//fun main(){
//    val result = with(StringBuilder()) {
//        append("Start eating fruits.\n")
//        for (fruit in list) {
//            append(fruit).append("\n")
//        }
//        append("Ate all fruits.")
//        toString()
//    }
//    println(result)
//}
fun main(){
    val result = StringBuilder().apply {
        append("Start eating fruits.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("Ate all fruits.")
    }
    println(result.toString())
}