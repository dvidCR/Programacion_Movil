package ej

class operadoresLogicos {
    // Realizar un programa que pida cargar
    // una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad.
    fun Ej1() {
        print("Escribe el día:")
        val dia = readln().toInt()
        print("Escribe el mes:")
        val mes = readln().toInt()
        if (mes==12 && dia==25)
            print("La fecha ingresada corresponde a navidad.")
    }

    // Se ingresan tres valores por teclado, si todos son iguales calcular el cubo del número y mostrarlo.
    fun Ej2() {
        print("Escribe el primer numero:")
        val valor1 = readln().toInt()
        print("Escribe el segundo numero:")
        val valor2 = readln().toInt()
        print("Escribe el tercer numero:")
        val valor3 = readln().toInt()
        if (valor1 == valor2 && valor1 == valor3) {
            val cubo = valor1 * valor1 * valor3
            print("El cubo de $valor1 es $cubo")
        }
    }

    //Se ingresan por teclado tres números, si todos los valores
    // ingresados son menores a 10, imprimir en pantalla la leyenda "Todos los números son menores a diez".
    fun Ej3() {
        print("Escribe el primer numero:")
        val valor1 = readln().toInt()
        print("Escribe el segundo numero:")
        val valor2 = readln().toInt()
        print("Escribe el tercer numero:")
        val valor3 = readln().toInt()
        if (valor1 < 10 && valor2 < 10 && valor3 < 10)
            print("Todos los numeros son menores a diez")
    }

    // Se ingresan por teclado tres números, si al menos uno de los valores ingresados
    // es menor a 10, imprimir en pantalla la leyenda "Alguno de los números es menor a diez".
    fun Ej4() {
        print("Escribe el primer numero:")
        val valor1 = readln().toInt()
        print("Escribe el segundo numero:")
        val valor2 = readln().toInt()
        print("Escribe el tercer numero:")
        val valor3 = readln().toInt()
        if (valor1 < 10 || valor2 < 10 || valor3 < 10)
            print("Alguno de los numeros es menor a diez")
    }

    // Escribir un programa que pida ingresar la coordenada de
    // un punto en el plano, es decir dos valores enteros x e y (distintos a cero).
    // Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto.
    // (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)
    fun Ej5() {
        print("Escribe la coordenada x:")
        val x = readln().toInt()
        print("Escribe la coordenada y:")
        val y = readln().toInt()
        if (x > 0 && y > 0)
            print("Se encuentra en el primer cuadrante")
        else
            if (x < 0 && y > 0)
                print("Se encuentra en el segundo cuadrante")
            else
                if (x < 0 && y < 0)
                    print("Se encuentra en el tercer cuadrante")
                else
                    if (x > 0 && y < 0)
                        print("Se encuentra en el cuarto cuadrante")
                    else
                        print("Se encuentra en un eje")
    }

    // Escribir un programa en el cual: dada una lista de tres valores enteros ingresados
    // por teclado se guarde en otras dos variables el menor y el mayor de esa lista.
    // Utilizar el if como expresión para obtener el mayor y el menor.
    // Imprimir luego las dos variables.
    fun Ej6() {
        print("Escribe el primer numero:")
        val valor1 = readln().toInt()
        print("Escribe el segundo numero:")
        val valor2 = readln().toInt()
        print("Escribe el tercer numero:")
        val valor3 = readln().toInt()
        val menor = if (valor1 < valor2 && valor1 < valor3) valor1 else if (valor2 < valor3) valor2 else valor3
        val mayor = if (valor1 > valor2 && valor1 > valor3) valor1 else if (valor2 > valor3) valor2 else valor3
        print("El mayor de la lista es $mayor y el menor $menor")
    }
}