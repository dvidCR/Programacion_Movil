package ej

class doWhile {
    // Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999
    // (no sumar dicho valor, indica que ha finalizado la carga).
    // Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero.
    fun Ej1() {
        var suma = 0
        do {
            print("Escribe un numero del -9999 al 9999:")
            val valor = readln().toInt()
            if (valor != 9999)
                suma += valor
        } while (valor != 9999)
        println("El numero acumulado es $suma")
        if (suma==0)
            println("El numero acumulado es cero.")
        else if (suma>0)
                println("El numero acumulado es positivo.")
             else
                println("El numero acumulado es negativo")
    }
}