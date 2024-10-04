package ej

class funcionesConParametros {
    // En la función main solicitar que se ingrese una clave dos veces por teclado.
    // Desarrollar una función que reciba dos String como parametros y muestre un
    // mensaje si las dos claves ingresadas son iguales o distintas.
    fun Ej1(clave1: String, clave2: String) {
        if (clave1 == clave2)
            println("Ambas claves son iguales")
        else
            println("Las claves son distintas")
    }

    // Confeccionar una función que reciba tres enteros y los muestre ordenados de menor a mayor.
    // En la función main solicitar la carga de 3 enteros por teclado y proceder a llamar
    // a la primer función definida.
    fun Ej2(num1: Int, num2: Int, num3: Int) {
        when {
            num1 < num2 && num1 < num3 -> {
                if (num2 < num3)
                    println("$num1 $num2 $num3 ")
                else
                    println("$num1 $num3 $num2 ")
            }
            num2 < num3 -> {
                if (num1 < num3)
                    println("$num2 $num1 $num3")
                else
                    println("$num2 $num3 $num1")
            }
            else -> {
                if (num1 < num2)
                    println("$num3 $num1 $num2")
                else
                    println("$num3 $num2 $num1")
            }
        }
    }
}