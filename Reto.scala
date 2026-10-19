abstract class Cuenta(
  val titular: String,
  val saldo: Double
) {

  def depositar(
    monto: Double
  ): Cuenta

  def retirar(
    monto: Double
  ): Cuenta
}