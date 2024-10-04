package ej

class When {
    // Se ingresa por teclado un valor entero,
    // mostrar una leyenda por pantalla que indique si el número es positivo, nulo o negativo.
    fun Ej1() {
        print("Escribe un numero: ")
        val valor = readln().toInt()
        when {
            valor == 0 -> println("El numero que has escrito es nulo")
            valor > 0 -> println("El numero que has escrito es positivo")
            else -> println("El numero que has escrito es negativo")
        }
    }

    // Plantear una estructura que se repita 5 veces y dentro de la misma cargar 3 valores enteros.
    // Acumular solo el mayor del cada lista de tres valores.
    fun Ej2() {
        var suma = 0
        for(i in 1..5) {
            print("Ingrese primer valor:")
            val num1 = readln().toInt()
            print("Ingrese segundo valor:")
            val num2 = readln().toInt()
            print("Ingrese tercer valor:")
            val num3 = readln().toInt()
            when {
                num1 > num2 && num1 > num3 -> println("El numero mas alto es $num1")
                num2 > num3 -> println("El numero mas alto es $num2")
                else -> println("El numero mas alto es $num3")
            }
        }
    }
}