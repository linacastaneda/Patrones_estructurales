/**
 * Representa la respuesta nativa del SDK de Stripe a un cargo.
 * Forma parte del Adaptee: su forma no coincide con ResultadoPago.
 */
public class StripeCharge {
    private final String id;
    private final String status;

    public StripeCharge(String id, String status) {
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}
