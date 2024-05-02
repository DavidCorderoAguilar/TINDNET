package com.example.androidmaster.Sintaxis


fun main() {
    condicionif()
    hiperif()
    getMonth(7)
}
fun hiperif() {
    val pet = "dog"
    val isHappy: Boolean = true
    if (pet == "dog" && isHappy || pet == "cat") {
        println("es un perrito felis")
    }
}

fun condicionif(){
    val name = "David"

    if(name == "David"){
        println("Este nombre es David")
}else if (name == "Maria"){
    println("Este nombre es Maria")
}else if (name == "Peter"){
    println("Este nombre es Peter")
}else{
    println("Este nombre no esta registrado")
    }
}
fun getMonth(month:Int):Any{
   return when(month){
       in 1..6 -> println("de la primera mitad del ano")
       in 7..12 -> println("Es de la segunda mitad")
       else ->"Este semestre no existe"
   }
}





