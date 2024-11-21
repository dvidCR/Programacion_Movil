package ej.POO.arraysConObjetos

class Main {

    fun imprimir(articulos: Array<Articulo>) {
        for(articulo in articulos)
            println("Código: ${articulo.codigo} - Descripción ${articulo.descripcion} Precio: ${articulo.precio}")
    }

    fun aumentarPrecio(articulos: Array<Articulo>) {
        for(articulo in articulos)
            articulo.precio = articulo.precio + (articulo.precio * 0.10f)
    }
}