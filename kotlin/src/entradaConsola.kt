class entradaConsola {
//    Escribir un programa en el cual se ingresen cuatro números enteros,
//    calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.
    fun Ej1() {
        print("Escribe el primer numero: ")
        val num1 = readln().toInt()

        print("Escribe el segundo numero: ")
        val num2 = readln().toInt()

        print("Escribe el tercer numero: ")
        val num3 = readln().toInt()

        print("Escribe el cuarto numero: ")
        val num4 = readln().toInt()

        val suma = num1 + num2

        val producto = num3 * num4

        println("La suma de los dos primeros números es: $suma")
        println("El producto del tercer y cuarto número es: $producto")
    }

//    Realizar un programa que lea por teclado cuatro valores numéricos enteros e informar su suma y promedio.
    fun Ej2(){
        print("Escribe el primer numero: ")
        val num1 = readln().toInt()

        print("Escribe el segundo numero: ")
        val num2 = readln().toInt()

        print("Escribe el tercer numero: ")
        val num3 = readln().toInt()

        print("Escribe el cuarto numero: ")
        val num4 = readln().toInt()

        val suma = num1 + num2

        val promedio = (num3 + num4) / 2

        println("La suma de los dos primeros números es: $suma")
        println("El producto del tercer y cuarto número es: $promedio")
    }
}