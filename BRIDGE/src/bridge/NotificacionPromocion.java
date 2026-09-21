package bridge;

public class NotificacionPromocion extends Notificacion {

    private double porcentajeDescuento;

    public NotificacionPromocion(
            CanalEnvio canal,
            String destinatario,
            double porcentajeDescuento) {

        super(canal, destinatario);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    protected String crearContenido() {
        return "Tienes un descuento especial del "
                + porcentajeDescuento
                + "% en tu próxima compra.";
    }
}