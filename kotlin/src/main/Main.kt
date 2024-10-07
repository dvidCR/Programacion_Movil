package main

import ej.*
import ej.POO.Colaboracion.Club
import ej.POO.Concetpos.Alumno
import ej.POO.Constructor.*
import ej.POO.dataClass.Dado
import ej.POO.enumClass.Paises
import ej.POO.getterYsetter.Empleado
import ej.POO.llamarMetodos.Hijos
import ej.POO.modifcadoresAcceso.Modificadores
import ej.POO.objetoNombrado.Mayor
import ej.POO.Herencia.*
import ej.POO.Herencia.clasesAbstractas.cajaAhorro
import ej.POO.Herencia.clasesAbstractas.plazoFijo
import ej.POO.arraysConObjetos.Articulo
import ej.POO.arraysConObjetos.Main
import ej.POO.declaracionImplementacionInterfaces.puntoEspacio
import ej.POO.declaracionImplementacionInterfaces.puntoPlano

fun main() {
    val Ej3 = Variables()
    val Ej4 = entradaConsola()
    val Ej5 = condicionalIF()
    val Ej6 = IfComoExpresion()
    val Ej7 = IfAnidado()
    val Ej8 = operadoresLogicos()
    val Ej9 = While()
    val Ej10 = doWhile()
    val Ej11 = For()
    val Ej12 = When()
    val Ej13 = whenConArgumentos()
    val Ej15 = funcionesConParametros()
    val Ej16 = funcionesConReturn()
    val Ej17 = funcionesUnaExpresion()
    val Ej18 = parametrosPorDefecto()
    val Ej19 = parametrosNombrados()
    val Ej20 = funcionesInternas()
    val Ej21 = Arrays()
    val Ej22 = funcionesConArrays()
    val Ej23 = Alumno()
    val Ej24_1 = Alumno("Juan", 5)
    val Ej24_2 = Punto(50, 17)
    val Ej25 = Hijos()
    val Ej26 = Club()
    val Ej27 = Modificadores()
    val Ej28 = Empleado("Juan", 1799.99)
    val Ej29 = Dado(5)
    val Ej30 = Paises.PERU
    val Ej31 = Mayor
    val Ej32_1 = Dado()
    val Ej32_2 = DadoRecuadro()
    val Ej33_1 = cajaAhorro("Enrique", 56.00)
    val Ej33_2 = plazoFijo("Enrique", 56.00, 15, 100.00)
    val Ej34_1 = puntoPlano(5, 5)
    val Ej34_2 = puntoEspacio(7, 10, 63)
    val Ej35 = Main()

    //Punto 3
    Ej3.Ej1()
    Ej3.Ej2()

    //Punto 4
    Ej4.Ej1()
    Ej4.Ej2()

    //Punto 5
    Ej5.Ej1()
    Ej5.Ej2()

    //Punto 6
    Ej6.Ej1()

    //Punto 7
    Ej7.Ej1()
    Ej7.Ej2()
    Ej7.Ej3()
    Ej7.Ej4()

    //Punto 8
    Ej8.Ej1()
    Ej8.Ej2()
    Ej8.Ej3()
    Ej8.Ej4()
    Ej8.Ej5()
    Ej8.Ej6()

    // Punto 9
    Ej9.Ej1()

    // Punto 10
    Ej10.Ej1()

    // Punto 11
    Ej11.Ej1()
    Ej11.Ej2()
    Ej11.Ej3()

    // Punto 12
    Ej12.Ej1()
    Ej12.Ej2()

    // Punto 13
    Ej13.Ej1()

    // Punto 15
    Ej15.Ej1("Hola", "Hola")
    Ej15.Ej1("Hola", "Adios")
    Ej15.Ej2(5, 6, 1)

    // Punto 16
    Ej16.Ej1(6, 5, 3)
    Ej16.Ej2(5)

    // Punto 17
    Ej17.Ej1(6, 5, 3)
    Ej17.Ej2(5)

    // Punto 18
    Ej18.Ej1(10, 12)

    // Punto 19
    Ej19.Ej1(termino = 3, num = 5)

    // Punto 20
    Ej20.Ej1()

    // Punto 21
    Ej21.Ej1()

    // Punto 22
    Ej22.Ej1()

    // Punto 23
    Ej23.inicializar()
    Ej23.imprimir()
    Ej23.mostrarEstado()

    // Punto 24
    Ej24_1.imprimir()
    Ej24_1.mostrarEstado()

    println("Esta en el cuadrante ${Ej24_2.retornarCuadrante()}")

    // Punto 25
    Ej25.cargar()

    //Punto 26
    Ej26.mayorAntiguedad()

    // Punto 27
    Ej27.imprimir()
    Ej27.mostrarMayor()
    Ej27.mostrarMenor()

    // Punto 28
    Ej28.imprimir()
    println(Ej28.nombre)
    println(Ej28.sueldo)

    Ej28.nombre = "Pepito"
    Ej28.sueldo = 1499.99
    Ej28.imprimir()

    // Punto 29
    println(Ej29)
    println(Ej29.toString())
    // Eso ultimo es prueba mia
    print(Ej29.valor)

    // Punto 30
    println(Ej30)
    println(Ej30.habitantes)

    // Punto 31
    println(Ej31.maximo(4, 5))
    println(Ej31.maximo(15.5f, 5.3f))
    println(Ej31.maximo(70.35, 70.34))

    // Punto 32
    Ej32_1.tirar()
    Ej32_1.imprimir()

    Ej32_2.tirar()
    Ej32_2.imprimir()

    // Punto 33
    Ej33_1.imprimir()

    Ej33_2.imprimir()

    // Punto 34
    Ej34_1.imprimir()

    Ej34_2.imprimir()

    // Punto 35
    val articulos: Array<Articulo> = arrayOf(Articulo(1, "PC", 999.99f),
        Articulo(2, "portatiles", 899.99f),
        Articulo(1, "plato", 12.50f),
        Articulo(1, "puerta", 210.99f))
    Ej35.imprimir(articulos)
    Ej35.aumentarPrecio(articulos)
    Ej35.imprimir(articulos)
}

