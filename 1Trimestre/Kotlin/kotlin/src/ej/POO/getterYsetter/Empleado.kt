package ej.POO.getterYsetter

// Confeccionar una clase que represente un Empleado. Definir como propiedades su nombre y su sueldo.
// No permitir que se cargue un valor negativo en su sueldo.
// Codificar el metodo imprimir en la clase.
class Empleado(nombre: String, sueldo: Double) {

    var nombre: String = nombre
    var sueldo: Double = sueldo

    set(valor) {
        if (valor < 0)
            field = 0.0
        else
            field = valor
    }

    get() {
        return field
    }

    init {
        this.sueldo = sueldo
    }

    fun imprimir() {
        println("$nombre tiene un sueldo de $sueldo")
    }
}