class BebidaAzucarada(
    id: Int,
    litros: Double,
    precio: Double,
    marca: String,
    private val porcentajeAzucar: Double,
    private val tienePromocion: Boolean
) : Bebida(id, litros, precio, marca) {

     override fun calcularPrecio(): Double {
        return if (tienePromocion) {
            precio * 0.9
        } else {
            precio
        }
    }

}
