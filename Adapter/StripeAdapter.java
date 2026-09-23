/**
 * Adapter — traduce entre ProcesadorPago (lo que espera la app)
 * y StripeSDK (lo que ofrece el proveedor).
 */
public class StripeAdapter implements ProcesadorPago {
    private final StripeSDK stripe;

    public StripeAdapter() {
        this.stripe = new StripeSDK();
    }

    public StripeAdapter(StripeSDK stripe) {
        this.stripe = stripe;
    }

    @Override
    public ResultadoPago pagar(int montoEnCentavos, String moneda) {
        StripeCharge cargo = stripe.crearCargo(montoEnCentavos, moneda, "tok_default");

        boolean exitoso = cargo.getStatus().equals("succeeded");
        return new ResultadoPago(exitoso, cargo.getId());
    }
}
