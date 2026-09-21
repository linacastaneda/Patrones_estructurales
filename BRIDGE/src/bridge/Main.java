package bridge;

public class Main {

    private static void separar(String titulo) {
        System.out.println();
        System.out.println(
                "==================================================");
        System.out.println(titulo);
        System.out.println(
                "==================================================");
    }

    public static void main(String[] args) {

        CanalEnvio email =
                new CanalEmail("smtp.tienda.com");

        CanalEnvio sms =
                new CanalSMS("Twilio");

        CanalEnvio whatsApp =
                new CanalWhatsApp("+57 300 555 0101");

        CanalEnvio push =
                new CanalPush("TiendaApp");

        separar("1. PEDIDO POR EMAIL");

        Notificacion pedido = new NotificacionPedido(
                email,
                "lina@email.com",
                "PED-2026-1048");

        pedido.enviar();

        separar("2. PROMOCIÓN POR WHATSAPP");

        Notificacion promocion = new NotificacionPromocion(
                whatsApp,
                "+57 310 222 3344",
                25);

        promocion.enviar();

        separar("3. ALERTA DE SEGURIDAD POR SMS");

        Notificacion alerta = new AlertaSeguridad(
                sms,
                "+57 315 888 9900",
                "Inicio de sesión desde un dispositivo nuevo");

        alerta.enviar();

        separar("4. RECUPERACIÓN DE CONTRASEÑA POR PUSH");

        Notificacion recuperacion =
                new RecuperacionContrasena(
                        push,
                        "dispositivo-usuario-784",
                        "RC-849271");

        recuperacion.enviar();

        separar("5. CAMBIO DE CANAL");

        System.out.println(
                "El mismo pedido cambia de EMAIL a SMS.");

        pedido.cambiarCanal(
        sms,
        "+57 300 123 4567");

pedido.enviar();
    }
}