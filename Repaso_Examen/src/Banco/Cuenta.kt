package Banco

abstract class Cuenta {
    abstract fun depositar(cantidad: Double)
    abstract fun retirar(cantidad: Double)
}