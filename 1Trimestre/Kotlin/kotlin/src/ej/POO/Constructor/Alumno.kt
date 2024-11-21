package ej.POO.Constructor

// Implementar una clase llamada Alumno que tenga como propiedades su nombre y su nota.
// Al constructor llega su nombre y nota.
//Imprimir el nombre y su nota. Mostrar un mensaje si está regular (nota mayor o igual a 4)
//Definir dos objetos de la clase Alumno.
class Alumno(val nombre: String, val nota: Int) {

    fun imprimir() {
        println("Alumno: $nombre tiene una nota de $nota")
    }

    fun mostrarEstado () {
        if (nota >= 4)
            println("$nombre se encuentra en estado REGULAR")
        else
            println("$nombre no está REGULAR")
    }
}