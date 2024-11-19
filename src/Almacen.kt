class Almacen {
    private val filas = 5
    private val columnas = 5
    private val estanteria = Array(filas) { arrayOfNulls<Bebida>(columnas) } // Matriz de bebidas

    // Agregar una bebida en la primera posición vacía
    fun AgregarBebida(bebida: Bebida): Boolean {
        for (i in 0 until filas) {
            for (j in 0 until columnas) {
                if (estanteria[i][j] == null) { // Encontrar espacio vacío
                    estanteria[i][j] = bebida
                    return true
                }
            }
        }
        return false // No hay espacio disponible
    }

    // Eliminar una bebida por ID
    fun EliminarBebida(id: Int): Boolean {
        for (i in 0 until filas) {
            for (j in 0 until columnas) {
                if (estanteria[i][j]?.id == id) { // Encontrar la bebida por ID
                    estanteria[i][j] = null
                    return true
                }
            }
        }
        return false // Bebida no encontrada
    }

    // Mostrar todas las bebidas en la estantería
    fun MostrarBebida() {
        for (i in 0 until filas) {
            for (j in 0 until columnas) {
                val bebida = estanteria[i][j]
                if (bebida != null) {
                    println("Posición [$i][$j]: ID: ${bebida.id}, Marca: ${bebida.marca}, Litros: ${bebida.litros}, Precio: ${bebida.calcularPrecio()}")
                } else {
                    println("Posición [$i][$j]: Vacío")
                }
            }
        }
    }

    // Calcular el precio total de todas las bebidas
    fun CalcularPrecioTotal(): Double {
        var total = 0.0
        for (i in 0 until filas) {
            for (j in 0 until columnas) {
                total += estanteria[i][j]?.calcularPrecio() ?: 0.0
            }
        }
        return total
    }

    // Calcular el precio total de una marca específica
    fun CalcularPrecioMarca(marca: String): Double {
        var total = 0.0
        for (i in 0 until filas) {
            for (j in 0 until columnas) {
                val bebida = estanteria[i][j]
                if (bebida != null && bebida.marca.equals(marca, ignoreCase = true)) {
                    total += bebida.calcularPrecio()
                }
            }
        }
        return total
    }

    // Calcular el precio total de una columna específica
    fun CalcularPrecioColumna(columna: Int): Double {
        if (columna < 0 || columna >= columnas) {
            throw IllegalArgumentException("Columna fuera de rango")
        }

        var total = 0.0
        for (i in 0 until filas) {
            total += estanteria[i][columna]?.calcularPrecio() ?: 0.0
        }
        return total
    }
}
