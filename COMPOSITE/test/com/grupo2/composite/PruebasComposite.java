package com.grupo2.Composite;

/** Comprobaciones sin librerias externas */
public class PruebasComposite {
    public static void main(String[] args) {
        Caja papeleria = new Caja("Papeleria");
        comprobar(0, papeleria.calcularPrecio(), "Caja vacia");
        Producto lapicero = new Producto("Lapicero", 3000);
        comprobar(3000, lapicero.calcularPrecio(), "Precio de una hoja");
        papeleria.agregar(new Producto("Cuaderno", 12000));
        papeleria.agregar(lapicero);
        Caja regalo = new Caja("Regalo");
        regalo.agregar(papeleria);
        Producto usb = new Producto("USB", 25000);
        regalo.agregar(usb);
        Caja pedido = new Caja("Pedido");
        pedido.agregar(new Producto("Audifonos", 60000));
        pedido.agregar(regalo);
        Componente total = pedido;
        comprobar(100000, total.calcularPrecio(), "Pedido con cajas anidadas");
        regalo.quitar(usb);
        comprobar(75000, total.calcularPrecio(), "Quitar un producto actualiza el total");
        regalo.agregar(usb);
        papeleria.agregar(new Producto("Borrador", 1000));
        comprobar(101000, total.calcularPrecio(), "Cambiar una caja interna actualiza el total");
        try {
            new Producto("Invalido", -1);
            throw new AssertionError("Se acepto un precio negativo");
        } catch (IllegalArgumentException esperado) {
            System.out.println("OK: precio negativo rechazado");
        }
        System.out.println("Todas las comprobaciones pasaron.");
    }

    private static void comprobar(int esperado, int real, String caso) {
        if (esperado != real) {
            throw new AssertionError(caso + ": se esperaba " + esperado + " y se obtuvo " + real);
        }
        System.out.println("OK: " + caso);
    }
}
