package com.grupo2.Composite;

/** Contrato compartido por un producto y una caja. */
public interface Componente {
    String getNombre();

    /** Precio en pesos colombianos enteros, sin impuestos ni envio. */
    int calcularPrecio();

    /** Muestra el elemento y su contenido, si lo tiene. */
    void mostrar(String sangria);
}
