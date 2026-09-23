/**
 * Adaptado (Adaptee) — segundo proveedor externo, con una interfaz
 * propia distinta a la de Stripe y a la de ProcesadorPago.
 */
public class PayPalSDK {
    public PayPalResponse ejecutarPago(String total, String moneda) {
        System.out.println("[PayPalSDK] Ejecutando pago de " + total + " " + moneda);
        String referencia = "PP-" + (int) (Math.random() * 100000);
        return new PayPalResponse(referencia, "COMPLETED");
    }
}
