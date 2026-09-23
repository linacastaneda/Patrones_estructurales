/**
 * Resultado uniforme de un intento de pago, independientemente
 * del proveedor que lo haya procesado.
 */
public class ResultadoPago {
    private final boolean exitoso;
    private final String idTransaccion;

    public ResultadoPago(boolean exitoso, String idTransaccion) {
        this.exitoso = exitoso;
        this.idTransaccion = idTransaccion;
    }

    public boolean isExitoso() {
        return exitoso;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }
}
