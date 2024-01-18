package com.example.myapplication2

 abstract class Student(val sno:String , val grade:Int, name: String,age:Int ): Person (name,age),Dance {
   constructor(name: String,age: Int) :this ("",0,name, age){
   }

     override fun state() {
          println("he is ")
     }

}