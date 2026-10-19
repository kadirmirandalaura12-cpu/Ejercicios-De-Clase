abstract class Empleado(
    val nombre: String,
    val salarioBase: Double
) {
    def salarioTotal: Double
}

class Desarrollador(
    nombre: String,
    salarioBase: Double,
    val bonoFijo: Double
) extends Empleado(nombre, salarioBase) {
    
    override def salarioTotal: Double = salarioBase + bonoFijo
}
class Vendedor(
    nombre: String,
    salarioBase: Double,
    val totalVentas: Double,
    val comisionPorcentaje: Double
) extends Empleado(nombre, salarioBase) {
    
    override def salarioTotal: Double = salarioBase + (totalVentas * comisionPorcentaje)
}

class Gerente(
    nombre: String,
    salarioBase: Double,
    val bonoPorcentaje: Double
) extends Empleado(nombre, salarioBase) {
    
    override def salarioTotal: Double = salarioBase + (salarioBase * bonoPorcentaje)
}

object TestEmpleados {
    def mostrarSalario(empleado: Empleado): Unit = {
        println(s"Persona: ${empleado.nombre}, Salario Total: ${empleado.salarioTotal}")
    }

    def main(args: Array[String]): Unit = {
        val developer = new Desarrollador("Mauricio", 3300, 500)
        val vendedor = new Vendedor("Rodo", 2200, 1000, 0.30)
        val gerente = new Gerente("Diego", 8000, 0.20)

        mostrarSalario(developer)      
        mostrarSalario(vendedor) 
        mostrarSalario(gerente)
    }
}