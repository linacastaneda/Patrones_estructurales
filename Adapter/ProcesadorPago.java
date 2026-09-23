/**
 * Interfaz objetivo (Target) — lo que espera nuestra aplicación
 * para procesar un pago, sin importar el proveedor subyacente.
 */
public interface ProcesadorPago {
    ResultadoPago pagar(int montoEnCentavos, String moneda);
}
