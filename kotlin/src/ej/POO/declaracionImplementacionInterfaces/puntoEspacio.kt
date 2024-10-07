package ej.POO.declaracionImplementacionInterfaces

class puntoEspacio(val x: Int, val y: Int, val z: Int): Punto {

    override fun imprimir() {
        println("Punto en el espacio: ($x,$y,$z)")
    }
}