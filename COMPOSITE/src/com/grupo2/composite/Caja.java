package com.grupo2.Composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Compuesto: agrupa productos y otras cajas mediante la interfaz Componente.
 * El cliente debe construir un arbol sin ciclos: ninguna caja puede contener
 * a sus antecesoras. Cada instancia representa un articulo del pedido.
 */
public class Caja implements Componente {
    private final String nombre;
    private final List<Componente> contenido = new ArrayList<>();

    public Caja(String nombre) {
        this.nombre = Objects.requireNonNull(nombre, "El nombre es obligatorio");
    }

    public void agregar(Componente componente) {
        contenido.add(Objects.requireNonNull(componente));
    }

    public void quitar(Componente componente) {
        contenido.remove(componente);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int calcularPrecio() {
        int total = 0;
        for (Componente hijo : contenido) {
            total += hijo.calcularPrecio();
        }
        return total;
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + "+ " + nombre + " (COP " + calcularPrecio() + ")");
        for (Componente hijo : contenido) {
            hijo.mostrar(sangria + "  ");
        }
    }
}
