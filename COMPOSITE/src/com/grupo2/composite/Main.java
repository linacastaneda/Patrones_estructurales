package com.grupo2.Composite;

/** Cliente y demostracion. Todos los precios son datos ficticios. */
public class Main {
    public static void main(String[] args) {
        Producto lapicero = new Producto("Lapicero", 3000);
        Caja papeleria = new Caja("Papeleria");
        papeleria.agregar(new Producto("Cuaderno", 12000));
        papeleria.agregar(lapicero);

        Caja regalo = new Caja("Caja regalo");
        regalo.agregar(papeleria);
        regalo.agregar(new Producto("USB", 25000));

        Caja pedido = new Caja("Pedido");
        pedido.agregar(new Producto("Audifonos", 60000));
        pedido.agregar(regalo);

        System.out.println("ESTRUCTURA DEL PEDIDO");
        pedido.mostrar("");
        System.out.println();
        System.out.println("MISMO METODO, DISTINTOS COMPONENTES");
        mostrarPrecio(lapicero);
        mostrarPrecio(regalo);
        mostrarPrecio(pedido);
    }

    /** No necesita saber si recibe un Producto o una Caja. */
    private static void mostrarPrecio(Componente elemento) {
        System.out.println(elemento.getNombre() + ": COP " + elemento.calcularPrecio());
    }
}
