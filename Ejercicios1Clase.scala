trait Figura {
    def area: Double
}
class Rectangulo(
    val base: Double, 
    val altura: Double
    ) extends Figura {
    override def area: Double = base * altura
}
class Circulo(
    val radio: Double
    ) extends Figura {
    override def area: Double = 3.1416 * radio * radio
}
class Triangulo(
    val base: Double, 
    val altura: Double
    ) extends Figura {
    override def area: Double = (base * altura) / 2
}
object TestFiguras {
    
    def mostrarArea(figura: Figura): Double = {
        figura.area
    }

    def main(args: Array[String]): Unit = {
        val rectangulo = new Rectangulo(5, 3)
        val circulo = new Circulo(2)
        val triangulo = new Triangulo(4, 6)
        println(mostrarArea(rectangulo))
        println(mostrarArea(circulo))
        println(mostrarArea(triangulo))
    }
}



