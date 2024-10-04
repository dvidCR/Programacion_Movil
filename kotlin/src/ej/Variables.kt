package ej

class Variables {
    //Definir una variable inmutable con el valor 50 que representa el
    //lado de un cuadrado, en otras dos variables inmutables almacenar la superficie y el perímetro del cuadrado.
    //Mostrar la superficie y el perímetro por la Consola.
    fun Ej1() {
        val lado: Int
        val superficie: Int
        val perimetro: Int

        lado = 50
        superficie = 30
        perimetro = 80

        println("El lado es: $lado")
        println("La superficie es: $superficie")
        println("El perimetro es: $perimetro")
    }

    //Definir tres variables inmutables y cargar por asignación los pesos de
    //tres personas con valores Float. Calcular el promedio de pesos de las personas y mostrarlo.
    fun Ej2() {
        val peso1: Float
        val peso2: Float
        val peso3: Float

        peso1 = 70.5f
        peso2 = 65.3f
        peso3 = 80.2f

        val promedio = (peso1 + peso2 + peso3) / 3

        println("El promedio de los pesos es: $promedio kg")
    }
}