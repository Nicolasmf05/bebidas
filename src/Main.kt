fun main() {

    val almacen = Almacen()


    val agua1 = AguaMineral(1, 1.5, 10.0, "Nestlé", "Manantial Alpino")
    val agua2 = AguaMineral(2, 0.5, 5.0, "Evian", "Manantial Natural")
    val bebida1 = BebidaAzucarada(3, 1.0, 12.0, "Coca-Cola", 10.0, true)
    val bebida2 = BebidaAzucarada(4, 2.0, 20.0, "Pepsi", 8.0, false)


    println("Agregando bebidas...")
    almacen.AgregarBebida(agua1)
    almacen.AgregarBebida(agua2)
    almacen.AgregarBebida(bebida1)
    almacen.AgregarBebida(bebida2)


    println("\nInventario inicial:")
    almacen.MostrarBebida()


    val precioTotal = almacen.CalcularPrecioTotal()
    println("Precio total de todas las bebidas: $precioTotal")


    val precioCocaCola = almacen.CalcularPrecioMarca("Coca-Cola")
    println("Precio total de las bebidas de la marca Coca-Cola: $precioCocaCola")

    println("Eliminando la bebida con ID " + 2)
    val eliminada = almacen.EliminarBebida(2)
    println("¿Eliminada con éxito? $eliminada")


    println("\nInventario después de eliminar:")
    almacen.MostrarBebida()


    println("\nCalculando el precio total de la columna " + 0)
    val precioColumna0 = almacen.CalcularPrecioColumna(0)
    println("Precio total de la columna 0: $precioColumna0")
}
