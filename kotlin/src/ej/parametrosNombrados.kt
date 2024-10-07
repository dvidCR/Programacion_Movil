package ej

class parametrosNombrados {
    // Elaborar una función que muestre la tabla de multiplicar del valor que le enviemos como parámetro.
    // Definir un segundo parámetro llamado termino que por defecto almacene el valor 10.
    // Se deben mostrar tantos términos de la tabla de multiplicar como lo indica el segundo parámetro.
    //Llamar a la función desde la main con argumentos nombrados.
    fun Ej1(num: Int, termino: Int = 10) {
        for(i in num..num*termino step num)
            println(i)
    }
}