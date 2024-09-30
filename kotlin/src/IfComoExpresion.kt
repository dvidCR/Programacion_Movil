class IfComoExpresion {
//    Cargar un valor entero por teclado comprendido entre 1 y 99. Almacenar en otra variable la
//    cantidad de dígitos que tiene el valor ingresado por teclado.
//    Mostrar la cantidad de dígitos del número ingresado por teclado.
    fun Ej1() {
        print("Escribe un numero entre el 1 y el 99: ")
        val num = readln().toInt()
        val cantDig = if (num < 10) 1 else 2
        if (num < 100)
            println("El numero tiene un total de $cantDig digito/s")
        else
            println("Tienes que introducir un numero entre el 1 y el 99")
    }

}