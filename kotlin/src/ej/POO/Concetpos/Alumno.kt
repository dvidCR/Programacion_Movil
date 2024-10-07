package ej.POO.Concetpos

// Implementar una clase llamada Alumno que tenga como propiedades su nombre y su nota.
// Definir los métodos para inicializar sus propiedades por teclado, imprimirlos
// y mostrar un mensaje si está regular (nota mayor o igual a 4)
//Definir dos objetos de la clase Alumno.
class Alumno {
    var nombre: String = ""
    var nota: Int = 0

    fun inicializar() {
        print("Escribe el nombre del alumno:")
        nombre = readln().toString()
        print("Escribe su nota:")
        nota = readln().toInt()
    }

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