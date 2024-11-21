package ej

class condicionalIF {
//    Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".
    fun Ej1() {
        print("Pon la nota de lengua del alumno: ")
        val notaLengua = readln().toDouble()

        print("Pon la nota de matematicas del alumno: ")
        val notaMatematicas = readln().toDouble()

        print("Pon la nota de ingles del alumno: ")
        val notaIngles = readln().toDouble()

        val promedio = (notaLengua + notaIngles + notaMatematicas) / 3

        if (promedio >= 7)
            println("Promocionado")
        else
            println("No Promocionado")
    }
//    Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar un mensaje indicando
//    si el número tiene uno o dos dígitos.
//    (Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)

    fun Ej2() {
        print("Escribe un numero entre el 1 y el 99: ")
        val num = readln().toInt()

        if (num <= 99)
            if (num > 10)
                print("Tu numero tiene dos digitos")
            else
                print("Tu numero tiene un digito")
        else
            print("El numero introducido tiene que ser entre el 1 y el 99")
    }
}