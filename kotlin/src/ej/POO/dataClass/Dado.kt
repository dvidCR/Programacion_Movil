package ej.POO.dataClass

// Plantear un data class llamado Dado con una única propiedad llamada valor.
// Sobreescribir el mextodo toString para que muestre tantos asteriscos como indica la propiedad valor.
data class Dado (var valor: Int) {

    override fun toString(): String {
        var cadena = ""
        for(i in 1..valor)
            cadena = cadena +"*"
        return cadena
    }
}