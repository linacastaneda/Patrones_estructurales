/**
 * Adaptado (Adaptee) — SDK externo con una interfaz incompatible
 * con ProcesadorPago.
 */
public class StripeSDK {
    public StripeCharge crearCargo(int amount, String currency, String source) {
        // Simulación de la lógica interna real de Stripe.
        System.out.println("[StripeSDK] Cobrando " + amount + " " + currency + " al token " + source);
        String id = "ch_" + Integer.toHexString((int) (Math.random() * 100000000));
        return new StripeCharge(id, "succeeded");
    }
}
