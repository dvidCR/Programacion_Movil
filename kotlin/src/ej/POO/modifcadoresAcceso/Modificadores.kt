package ej.POO.modifcadoresAcceso

// Desarrollar una clase que defina una propiedad privada de tipo array de 5 enteros.
// En el bloque init llamar a un metodo privado que cargue valores aleatorios comprendidos entre 0 y 10.
// Definir otros tres métodos públicos que muestren el array, el mayor y el menor elemento.
class Modificadores {

    private val vec = IntArray(5)

    init {
        cargar()
    }

    private fun cargar() {
        for(i in vec.indices)
            vec[i] = ((Math.random() * 11)).toInt()
    }

    fun imprimir() {
        println("Listado completo del array")
        for(i in vec.indices)
            print("${vec[i]} - ")
        println()
    }

    fun mostrarMayor() {
        var mayor = vec[0]
        for(i in vec.indices)
            if (vec[i] > mayor)
                mayor = vec[i]
        println("El elemento mayor del array es $mayor")
    }

    fun mostrarMenor() {
        var menor = vec[0]
        for(i in vec.indices)
            if (vec[i] < menor)
                menor = vec[i]
        println("El elemento menor del array es $menor")
    }
}