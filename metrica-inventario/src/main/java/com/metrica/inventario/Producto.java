package com.metrica.inventario;

public class Producto {

    private String codigo;
    private String nombre;
    private String categoria;
    private int cantidad;

    public Producto(String codigo, String nombre,
                    String categoria, int cantidad) {

        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException(
                    "El código es obligatorio");
        }

        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre es obligatorio");
        }

        if (categoria == null || categoria.isBlank()) {
            throw new IllegalArgumentException(
                    "La categoría es obligatoria");
        }

        if (cantidad < 0) {
            throw new IllegalArgumentException(
                    "La cantidad no puede ser negativa");
        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getCantidad() {
        return cantidad;
    }
}
