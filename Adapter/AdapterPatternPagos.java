/**
 * Ejemplo del patrón Adapter aplicado a un sistema de pagos.
 *
 * Problema: nuestra aplicación define una interfaz propia para procesar
 * pagos, pero el SDK de Stripe (y potencialmente otros proveedores como
 * PayPal) exponen una API distinta. El Adapter traduce entre ambas sin
 * que el resto del sistema tenga que conocer los detalles de cada proveedor.
 */
public class AdapterPatternPagos {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        System.out.println("--- Pago con Stripe ---");
        checkout.procesarCompra(new StripeAdapter(), 5000, "USD");

        System.out.println("--- Pago con PayPal ---");
        checkout.procesarCompra(new PayPalAdapter(), 3200, "USD");
    }
}
