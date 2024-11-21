package ej

class funcionesConArrays {
    // Desarrollar un programa que permita ingresar un arreglo de n elementos, ingresar n por teclado.
    //Elaborar dos funciones una donde se lo cree y cargue al arreglo y otra que sume todos sus elementos
    // y retorne dicho valor a la main donde se lo imprima.
    fun Ej1() {
        var array = cargar()
        imprimir(array)
        println("La suma de todos sus elementos es ${sumar(array)}")
    }

    fun cargar(): IntArray {
        print("Cuantos elementos contendra el array:")
        val cantidad = readln().toInt()
        val array = IntArray(cantidad)
        for(i in array.indices) {
            print("Escribe un numero:")
            array[i] = readln().toInt()
        }
        return array
    }

    fun imprimir(array: IntArray) {
        println("Listado completo del array")
        for(elemento in array)
            println(elemento)
    }

    fun sumar(array: IntArray): Int {
        var suma = 0
        for(i in array)
            suma += i
        return suma;
    }
}