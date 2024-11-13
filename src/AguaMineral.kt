class AguaMineral(
    id: Int,
    litros: Double,
    precio: Double,
    marca: String,
    private val origen: String
) : Bebida(id, litros, precio, marca) {

    override fun calcularPrecio(): Double = precio


}
