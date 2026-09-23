/**
 * Representa la respuesta nativa del SDK de PayPal a una ejecución
 * de pago. Forma parte del Adaptee.
 */
public class PayPalResponse {
    private final String referencia;
    private final String estado;

    public PayPalResponse(String referencia, String estado) {
        this.referencia = referencia;
        this.estado = estado;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getEstado() {
        return estado;
    }
}
