abstract class Vehiculo(
    val marca: String,
    val velocidadMax: Double
) {
    def descripcion(): String
}
trait Electrico {
    def tipoEnergia(): String = "Usa electricidad"
}
trait Recargable {
    def recargar(): String = "Recargando..."
}

class Automovil(marca: String, velocidadMax: Double) 
    extends Vehiculo(marca, velocidadMax) with Recargable{
    
    def descripcion(): String = s"Auto $marca con una velocidad max de: $velocidadMax km/h"
}

class Motocicleta(marca: String, velocidadMax: Double) 
    extends Vehiculo(marca, velocidadMax) with Recargable{
    
    def descripcion(): String = s"Moto $marca con una velocidad max de: $velocidadMax km/h"
}
class AutoElectrico(marca: String, velocidadMax: Double) 
    extends Vehiculo(marca, velocidadMax) 
    with Electrico 
    with Recargable {
    
    def descripcion(): String = s"Auto electrico $marca con una velocidad maxima de: $velocidadMax km/h"
}

object TestVehiculos {
    def main(args: Array[String]): Unit = {
        val auto = new Automovil("Toyota", 180)
        val moto = new Motocicleta("Yamaha", 150)
        val tesla = new AutoElectrico("Tesla", 250)

        println(auto.descripcion())
        println(moto.descripcion())
        println(tesla.descripcion())

        println(tesla.tipoEnergia())
        println(tesla.recargar())
        println(auto.recargar())
        println(moto.recargar())
    }
}