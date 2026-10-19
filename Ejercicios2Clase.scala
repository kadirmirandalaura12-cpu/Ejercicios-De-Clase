abstract class Animal (
    val nombre: String
) {
    def sonido(): String
}

trait Nadador {
    def nadar(): String = "Estoy nadando"
}

trait Volador {
    def volar(): String = "Estoy volando"
}

class Perro(nombre: String) extends Animal(nombre) {
    def sonido(): String = "wau wau"
}

class Pato(nombre: String) extends Animal(nombre) with Volador with Nadador {
    def sonido(): String = "Duck duck"
}

class Pez(nombre: String) extends Animal(nombre) with Nadador {
    def sonido(): String = "glugluglu"
}

object TestSonidos {
    def emitirSonido(animal: Animal): Unit = {
        println(s"${animal.sonido()}")
    }

    def main (args: Array[String]): Unit = {
        val perro = new Perro("Pipoca")
        emitirSonido(perro)

        val pato = new Pato("Perry")
        emitirSonido(pato)  

        val pez = new Pez("Nemo")
        emitirSonido(pez)   
    }
}