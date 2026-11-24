package com.metrica.inventario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    void registrarProductoCorrectamente() {

        Producto producto = new Producto(
                "P001",
                "Taladro",
                "Herramientas",
                10
        );

        assertEquals("P001", producto.getCodigo());
        assertEquals("Taladro", producto.getNombre());
        assertEquals("Herramientas", producto.getCategoria());
        assertEquals(10, producto.getCantidad());
    }

    @Test
    void rechazarCantidadNegativa() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Producto(
                    "P002",
                    "Martillo",
                    "Herramientas",
                    -5
            );
        });
    }
}
