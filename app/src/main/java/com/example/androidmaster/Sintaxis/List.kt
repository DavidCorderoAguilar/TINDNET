package com.example.androidmaster.Sintaxis
fun main(){
   inmutablelist()
    mutablelist()
}
fun inmutablelist(){
//    val readonly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
////    println(readonly.size)
//    val example = readonly.filter { it.contains("a") }
//    println(example)
}
fun mutablelist(){
    val weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays.add(3,"David")
    println(weekDays)
    if (weekDays.isEmpty()){
    } else  {
     weekDays.forEach { println(it) }
    }
}
