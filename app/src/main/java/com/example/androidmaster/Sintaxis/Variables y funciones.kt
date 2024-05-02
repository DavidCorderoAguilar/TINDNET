package com.example.androidmaster.Sintaxis

fun main() {
    variablesComentario()
    variablesCalculadas()
    variablesBooleanas()
    val mysubtract = subtract(100, 50)
    println (mysubtract)
}

fun variablesComentario() {
    val stringEdad = "21"
    val stringExample = "Javier el puto"
    var stringComentario: String = "Hola"
    stringComentario = "Hola me llamo $stringExample, un gusto, tengo $stringEdad years"
    println(stringComentario)
}

fun variablesCalculadas() {
    val age = 5
    val age2 = 5
    println("Multiplicar")
    println(age * age2)
    println("Resta")
    println(age - age2)
    println("Suma")
    println(age + age2)
    println("Division")
    println(age / age2)
}

fun variablesBooleanas() {
    val nombreExiste: Boolean = true
    val edadExiste: Boolean = true
    val trabajoExiste = false
    println("Existe nombre? $nombreExiste , existe edad? $edadExiste , existe trbajo? $trabajoExiste")
}

fun muestraEdad(edad: Int  ) {
    println("Tengo $edad años de edad")
}

fun add(primerNumero: Int, segundoNumero: Int) {
    print(primerNumero + segundoNumero)
}
fun subtract(primerValor: Int, segundoValor: Int):Int {
    return primerValor - segundoValor
}

