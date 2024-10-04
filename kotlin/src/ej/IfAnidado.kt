package ej

class IfAnidado {
//    Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.
    fun Ej1() {
        print("Escribe el primer numero:")
        val num1 = readln().toInt()

        print("Escribe el segundo nnumero:")
        val num2 = readln().toInt()

        print("Escribe el tercer numero:")
        val num3 = readln().toInt()

        if (num1 > num2)
            if (num1 > num3)
                print(num1)
            else
                print(num3)
        else
            if (num2 > num3)
                print(num2)
            else
                print(num3)
    }

//    Se ingresa por teclado un valor entero, mostrar una leyenda que indique si
//    el número es positivo, nulo o negativo.
    fun Ej2() {
        print("Escribe un un numero:")
        val valor = readln().toInt()
        if (valor == 0)
            println("El numero es nulo o 0")
        else
            if (valor > 0)
                println("El numero es positivo")
            else
                println("El numero es negativo")
        }

//    Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras
//    y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el
//    número de cifras es mayor.
    fun Ej3() {
        print("Pon un numero entre el 1 y el 999: ");
        val valor = readln().toInt()
        val canDig = if ( valor < 10)
            1
        else
            if ( valor < 100)
                2
            else
                if ( valor < 1000)
                    3
                else
                    "Error"

    if (canDig == "Error")
        print("Tu numero tiene $canDig digito/s")
    else
        print("Error: Tienes que poner un numero entre el 1 y el 999")
    }

//    Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información:
//    cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente.
//    Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo
//    según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
//
//    Nivel máximo:	Porcentaje>=90%.
//    Nivel medio:	Porcentaje>=75% y <90%.
//    Nivel regular:	Porcentaje>=50% y <75%.
//    Fuera de nivel:	Porcentaje<50%.
    fun Ej4() {
//      No he entendido lo que el ejercicio quisiera que hiciera asique e copiado y pegado la solucion

        print("Ingrese la cantidad total de preguntas del examen: ")
        val totalPreguntas = readln().toInt()
        print("Ingrese la cantidad total de preguntas contestadas correctamente: ")
        val totalCorrectas = readln().toInt()
        val porcentaje = totalCorrectas * 100 / totalPreguntas;
        if ( porcentaje >= 90)
            println("Nivel máximo")
        else
            if (porcentaje >= 75)
                println("Nivel medio")
            else
                if ( porcentaje >= 50)
                    println("Nivel regular")
                else
                    println("Fuera de nivel")
    }
}