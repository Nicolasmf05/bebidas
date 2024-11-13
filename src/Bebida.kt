abstract class Bebida(
    val id: Int,
    val litros: Double,
    open val precio: Double,
    val marca: String
) {
    abstract fun calcularPrecio(): Double


}
