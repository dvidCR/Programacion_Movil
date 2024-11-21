package ej

class While {
    // Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas
    // mayores o iguales a 7 y cuántos menores.
    fun Ej1() {
        var x = 1
        var cont1 = 0
        var cont2 = 0
        while (x <= 10) {
            print("Escribe una nota:")
            val nota = readln().toInt()
            if (nota >= 7)
                cont1 = cont1 + 1
            else
                cont2 = cont2 + 1
            x = x + 1
        }
        println("Los alumnos con notas mayores o iguales a 7: $cont1")
        println("Los alumons con notas menores a 7: $cont2")
    }
}