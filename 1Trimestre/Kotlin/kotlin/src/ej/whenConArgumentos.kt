package ej

class whenConArgumentos {
    // Realizar la carga de la cantidad de hijos de 10 familias.
    // Contar cuantos tienen 0,1,2 o más hijos. Imprimir dichos contadores.
    fun Ej1() {
        var hijos0 = 0
        var hijos1 = 0
        var hijos2 = 0
        var familiaNumerosa = 0
        for(i in 1..10) {
            print("Cuantos hijos tiene la familia:")
            val cantidad = readln().toInt()
            when (cantidad) {
                0 -> hijos0++
                1 -> hijos1++
                2 -> hijos2++
                else -> familiaNumerosa++
            }
        }
        println("Hay $hijos0 familias con 0 hijos")
        println("Hay $hijos1 familias con 1 hijo")
        println("Hay $hijos2 familias con 2 hijos")
        println("Hay $familiaNumerosa familias numerosas")
    }
}