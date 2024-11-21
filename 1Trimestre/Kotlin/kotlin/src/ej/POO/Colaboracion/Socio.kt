package ej.POO.Colaboracion

// Plantear una clase Club y otra clase Socio.
// La clase Socio debe tener los siguientes propiedades: nombre y la antigüedad en el club (en años).
// Al constructor de la clase socio hacer que llegue el nombre y su antigüedad.
class Socio (val nombre: String, val antiguedad: Int) {

    fun imprimir() {
        println("$nombre tiene una antiguedad de $antiguedad")
    }
}