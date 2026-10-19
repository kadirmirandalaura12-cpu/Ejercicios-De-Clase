trait Notificacion {
    def enviar(
        mensaje: String
        ): String
}

class Email extends Notificacion {
    def enviar(mensaje: String): String = s"Enviando correo: $mensaje"
}

class SMS extends Notificacion {
    def enviar(mensaje: String): String = s"Enviando SMS: $mensaje"
}

class Push extends Notificacion {
    def enviar(mensaje: String): String = s"Enviando notificacion: $mensaje"
}

object TestNotificaciones {
    def procesarNotis(notificacion: Notificacion, mensaje: String): String = {
        notificacion.enviar(mensaje)
    }

    def main(args: Array[String]): Unit = {
        val correo = new Email()
        val sms = new SMS()
        val push = new Push()
        println(procesarNotis(correo, "Hola Ing"))
        println(procesarNotis(sms, "Hola gente"))
        println(procesarNotis(push, "Hola git"))
    }
}