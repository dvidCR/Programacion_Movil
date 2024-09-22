fun main() {
    problema1()
    problema2()
    problema3()
    problema4()
    problema5()
}

fun problema1() {
    val precioOriginal: Double
    precioOriginal = 100.0
    val porcentajeDescuento: Double
    porcentajeDescuento = 20.0
    val precioFinal = precioOriginal - (precioOriginal * porcentajeDescuento / 100)

    println("Precio original: $precioOriginal€")
    println("Porcentaje de descuento: $porcentajeDescuento%")
    println("Precio final: $precioFinal€")
}

fun problema2() {
    val gradosCelsius: Double
    gradosCelsius = 25.0
    val gradosFahrenheit = gradosCelsius * 9 / 5 + 32

    println("$gradosCelsius°C son equivalentes a $gradosFahrenheit°F")
}

fun problema3() {
    val numero = -5

    if (numero > 0) {
        println("El número $numero es positivo.")
    } else if (numero < 0) {
        println("El número $numero es negativo.")
    } else {
        println("El número es cero.")
    }
}

fun problema4() {
    val salarioPorHora: Double
    salarioPorHora = 15.0
    val horasTrabajadasSem: Double
    horasTrabajadasSem = 45.0
    val horasNormales = if (horasTrabajadasSem > 40) 40.0 else horasTrabajadasSem
    val horasExtras = if (horasTrabajadasSem > 40) horasTrabajadasSem - 40 else 0.0
    val salarioTotal = (horasNormales * salarioPorHora) + (horasExtras * salarioPorHora * 1.5)

    println("Horas normales: $horasNormales")
    println("Horas extra: $horasExtras")
    println("Salario total: $$salarioTotal")
}

fun problema5 () {
    val numero1: Int
    numero1 = 4
    val numero2: Int
    numero2 = 12

    if (numero2 % numero1 == 0) {
        println("$numero2 es múltiplo de $numero1.")
    } else {
        println("$numero2 no es múltiplo de $numero1.")
    }
}