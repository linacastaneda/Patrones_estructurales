/**
 * Segundo Adapter — mismo patrón para un proveedor distinto (PayPal).
 * Demuestra por qué el patrón escala: agregar un proveedor nuevo no
 * requiere tocar el cliente ni la interfaz.
 */
public class PayPalAdapter implements ProcesadorPago {
    private final PayPalSDK paypal;

    public PayPalAdapter() {
        this.paypal = new PayPalSDK();
    }

    public PayPalAdapter(PayPalSDK paypal) {
        this.paypal = paypal;
    }

    @Override
    public ResultadoPago pagar(int montoEnCentavos, String moneda) {
        String total = String.format("%.2f", montoEnCentavos / 100.0);
        PayPalResponse respuesta = paypal.ejecutarPago(total, moneda);

        boolean exitoso = respuesta.getEstado().equals("COMPLETED");
        return new ResultadoPago(exitoso, respuesta.getReferencia());
    }
}
