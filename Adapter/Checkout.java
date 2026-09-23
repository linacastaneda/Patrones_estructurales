/**
 * Cliente — no conoce a Stripe ni a PayPal, solo a ProcesadorPago.
 */
public class Checkout {
    public void procesarCompra(ProcesadorPago procesador, int montoEnCentavos, String moneda) {
        ResultadoPago resultado = procesador.pagar(montoEnCentavos, moneda);

        if (resultado.isExitoso()) {
            System.out.println("Pago confirmado. ID de transacción: " + resultado.getIdTransaccion());
        } else {
            System.out.println("El pago no pudo procesarse.");
        }
    }
}
