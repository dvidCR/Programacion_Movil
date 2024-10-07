package ej.POO.declaracionImplementacionInterfaces

class puntoPlano(val x: Int, val y: Int): Punto {

    override fun imprimir() {
        println("Punto en el plano: ($x,$y)")
    }
}