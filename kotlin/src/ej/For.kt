package ej

class For {
    // Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base
    // y la altura de un triángulo. El programa deberá informar:
    //a) De cada triángulo la medida de su base, su altura y su superficie
    // (la superficie se calcula multiplicando la base por la altura y dividiendo por dos).
    //b) La cantidad de triángulos cuya superficie es mayor a 12.
    fun Ej1() {
        var cantidad = 0
        print("Cuantos triangulos hara:")
        val n = readln().toInt()
        for(i in 1..n) {
            print("Escribe el la base:")
            val base = readln().toInt()
            print("Escribe el la altura:")
            val altura = readln().toInt()
            val superficie = base * altura / 2
            println("La superficie es de $superficie")
            if (superficie > 12)
                cantidad++
        }
        print("La cantidad de triangulos con superficie superior a 12 son: $cantidad")
    }

    // Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50)
    fun Ej2() {
        for(i in 5..50 step 5)
            println(i)
    }

    // Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre la tabla
    // de multiplicar del mismo (los primeros 12 términos)
    //Ejemplo: Si ingresó 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.
    fun Ej3() {
        print("Ingrese un numero entre 1 y 10:")
        val numMul = readln().toInt()
        for(i in numMul..numMul*12 step numMul)
            println(i)
    }
}