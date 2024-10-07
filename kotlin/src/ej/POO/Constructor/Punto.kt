package ej.POO.Constructor

// Cofeccionar una clase que represente un punto en el plano, la coordenada de un punto
// en el plano está dado por dos valores enteros x e y.
// Al constructor llega la ubicación del punto en x e y.
// Implementar un metodo que retorne un String que indique en que cuadrante se ubica dicho punto.
// (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, 3º Cuadrante: x < 0 Y y < 0, 4º
// Cuadrante: x > 0 Y y < 0)
// Si alguno o los dos valores son cero luego el punto se encuentra en un eje.
// Definir luego 5 objetos de la clase Punto en cada uno de los cuadrantes y uno en un eje.
class Punto (val x: Int, val y: Int) {

    fun retornarCuadrante() = when {
        x > 0 && y > 0 -> "Primer cuadrate"
        x < 0 && y > 0 -> "Segundo cuadrante"
        x < 0 && y < 0 -> "Tercer cuadrante"
        x > 0 && y < 0 -> "Cuarto cuadrante"
        else -> "Un eje"
    }
}