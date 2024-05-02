package com.example.androidmaster.Sintaxis

fun main() {
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays[0] = "Buenos dias, es Lunes"
    println(weekDays[0])
    println(weekDays.size)
    if (weekDays.size >= 8) {
        println(7)
    } else {
        println("No hay mas valores")
    }
for((position, values) in weekDays.withIndex()){
    println("La posicion $position, tiene el calor $values")
}
    for (weekDay in weekDays){
        println("Ahora es $weekDay")
    }
}