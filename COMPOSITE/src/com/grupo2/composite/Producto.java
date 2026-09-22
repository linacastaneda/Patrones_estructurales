package com.grupo2.Composite;

import java.util.Objects;

/** Hoja del arbol: tiene precio propio y no contiene hijos. */
public class Producto implements Componente {
    private final String nombre;
    private final int precio;

    public Producto(String nombre, int precio) {
        this.nombre = Objects.requireNonNull(nombre, "El nombre es obligatorio");
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + "- " + nombre + " (COP " + precio + ")");
    }
}
