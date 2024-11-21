package ej.POO.Colaboracion

// Plantear una clase Club y otra clase Socio.
// La clase Club debe tener como propiedades 3 objetos de la clase Socio.
// Definir un metodo en la clase Club para imprimir el nombre del socio con mayor antigüedad en el club.
class Club {

    val socio1 = Socio("Paco", 30)
    val socio2 = Socio("Sebastian", 3)
    val socio3 = Socio("Dolores", 8)

    fun mayorAntiguedad() {
        socio1.imprimir()
        socio2.imprimir()
        socio3.imprimir()
        print("El socio con mayor antiguedad es ")
        when {
            socio1.antiguedad > socio2.antiguedad && socio1.antiguedad > socio3.antiguedad -> print(socio1.nombre)
            socio2.antiguedad > socio3.antiguedad -> print(socio2.nombre)
            else -> print(socio3.nombre)
        }
    }
}