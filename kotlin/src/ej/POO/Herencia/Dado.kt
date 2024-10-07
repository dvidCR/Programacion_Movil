package ej.POO.Herencia

// Declarar una clase Dado que genere un valor aleatorio entre 1 y 6, mostrar su valor.
// Crear una segunda clase llamada DadoRecuadro que genere un valor entre 1 y 6, mostrar el valor
// recuadrado en asteríscos.
// Utilizar la herencia entre estas dos clases.
open class Dado {

    protected var valor: Int = 1
    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
    }

    open fun imprimir() {
        println("$valor")
    }
}