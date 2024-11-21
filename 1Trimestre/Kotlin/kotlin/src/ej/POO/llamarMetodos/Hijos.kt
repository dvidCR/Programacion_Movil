package ej.POO.llamarMetodos

// Declarar una clase llamada Hijos. Definir dentro de
// la misma un arreglo para almacenar las edades de 5 personas.
// Definir un metodo cargar donde se ingrese por teclado el arreglo de las edades y llame a
// otros dos metodo que impriman la mayor edad y el promedio de edades.
class Hijos {

    val edades = IntArray(5)

    fun cargar() {
        for(i in edades.indices) {
            print("Escribe la edad:")
            edades[i] = readln().toInt()
        }
        mayorEdad()
        promedio()
    }

    fun mayorEdad() {
        var mayor = edades[0]
        for(i in edades.indices)
            if (edades[i] > mayor)
                mayor = edades[i]
        println("El hijo mayor tiene $mayor años")
    }

    fun promedio() {
        var suma = 0
        for(i in edades.indices)
            suma += edades[i]
        val promedio = suma / edades.size
        println("La edad promedio de los hijos es de $promedio años")
    }
}