package ej.POO.enumClass

// Definir un enum class almacenando como constante los nombres de varios países sudamericanos y
// como propiedad para cada país la cantidad de habitantes que tiene.
// Definir una variable de este tipo e imprimir la constante y la cantidad de habitantes de dicha variable.
enum class Paises (val habitantes: Int) {

    BRASIL (202450649),
    COLOMBIA (50364000),
    PERU (31151643),
    VENEZUELA (31028337),
    CHILE (18261884),
    ECUADOR (16298217),
    BOLIVIA (10888000),
    PARAGUAY (6460000),
    URUGUAY (3372000)
}