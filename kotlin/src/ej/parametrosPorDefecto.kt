package ej

class parametrosPorDefecto {
    // Confeccionar una función que reciba entre 2 y 5 enteros.
    // La misma nos debe retornar la suma de dichos valores. Debe tener tres parámetros por defecto.
    fun Ej1(num1: Int, num2: Int, num3: Int = 5, num4: Int = 15, num5: Int = 8) = num1 + num2 + num3 + num4 + num5
}