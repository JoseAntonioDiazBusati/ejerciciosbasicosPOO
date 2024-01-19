import java.awt.geom.Area

/**
 * Ejercicio 4.1
 *
 * Crear una clase Persona que tenga nombre, peso (en kg con decimales), altura (en metros con decimales) y su imc.
 *
 * Crear un constructor primario con todos los atributos, excepto nombre e imc. Este último atributo se calcula en función del peso
 * y la altura. Por tanto no se debe poder modificar, pero si consultar.
 *
 * Crear un constructor secundario que también incluya el nombre de la persona cómo parámetro.
 *
 * Implementa el método toString, representación del objeto en forma de String: override fun toString() = "". (Pulsa Ctrl+o)
 *
 * En el main() a) crear 3 personas diferentes (la primera sin nombre) utilizando el constructor primario y secundario
 * y b) mostrarlas por consola. A continuación, realizar lo siguiente:
 *
 * Sobre la persona 1: a) modificar su nombre y para ello debes solicitarlo al usuario por consola.
 * No puede ser nulo o vacio. b) Mostrar por consola sólo el nombre, peso y altura.
 * Sobre la persona 3: a) Mostrar el peso, altura y imc. b) Modificar la altura, por ejemplo a 1.80 c) Mostrar el peso, altura y imc.
 * Sobre la persona 2; a) Modificar la altura para que tenga el mismo valor que la persona 3. b) Mostrar la persona 2 y persona 3.
 * c) Comparar si las dos personas son iguales, y mostrar el resultado. d) Implementa el método equals():boolean (Pulsa Ctrl+o). e) Ejecutar la comparación.
 */
class Persona(peso:Double, altura:Double){
    var nombre:String = ""
    var altura:Double = 0.0
    var peso:Double = 0.0
    var imc:Double = 0.0
    init {
        this.imc = peso / (altura * altura)
    }
    constructor(nombre:String,peso: Double,altura: Double):this(altura = altura, peso = peso){
        this.nombre = nombre
        this.altura = altura
        this.peso = peso
    }
}
fun ejercicio1(){
    val persona1 = Persona(nombre = "Pakote", peso = 80.5, altura = 1.79)
    println("${persona1.nombre} de ${persona1.altura}m y de ${persona1.peso}kg con un imc de ${"%.2f".format(persona1.imc)}")

    val persona2 = Persona(nombre = "Peter", peso = 69.69, altura = 1.86)
    println("${persona2.nombre} de ${persona2.altura}m y de ${persona2.peso}kg con un imc de ${"%.2f".format(persona2.imc)}")

    val persona3 = Persona(nombre = "Julio", peso = 10.69, altura = 1.46)
    println("${persona3.nombre} de ${persona3.altura}m y de ${persona3.peso}kg con un imc de ${"%.2f".format(persona3.imc)}")
}
/**
 * Ejercicio 4.2
 *
 * Actualizar el ejercicio 1 para añadir a la clase el siguiente comportamiento:
 *
 * Debe retornar un saludo con su nombre... saludar():String
 * Debe retornar si altura por encima de la media (solo si altura >= 1.75)... alturaEncimaMedia():Boolean
 * Debe retornar si peso por encima de la media (solo si peso >= 70)... alturaEncimaMedia():Boolean
 * Sería conveniente añadir también un método obtenerDescImc() para usar en mostrarDesc(), que implemente el retorno de la descripción
 * del rango de tipo de imc al que equivale su cálculo.
 * Nota: * Si el IMC es menos de 18.5, se encuentra dentro del rango de "peso insuficiente".
 * * Si el IMC está entre 18.5 y 24.9, se encuentra dentro del rango de "peso saludable".
 * * Si el IMC está entre 25.0 y 29.9, se encuentra dentro del rango de "sobrepeso". * Si el IMC es 30.0 o superior, se encuentra dentro del rango de "obesidad".
 *
 * Debe implementar también un método que muestre una descripción completa de la persona... mostrarDesc():String. Por ejemplo, este método mostrará por pantalla algo así:
 *
 * "Julia con una altura de 1.72m (Por debajo de la media) y un peso 64.7kg (Por encima de la media) tiene un IMC de 21,87 (peso saludable)".
 *
 * Crear en el main() una estructura de datos con 4 o 5 personas más, recorrer la estructura y
 * por cada persona debe saludar y mostrar su descripción completa.
 * Finalmente, revisa el IDE e intenta actualizar el modificador de visibilidad de los métodos de tu clase
 * cómo os estará indicando... veréis que los métodos que realmente no van a ser llamados desde fuera de la clase
 * te recomienda que sean privados a la misma. De esta manera estamos encapsulando estos métodos para que se puedan utilizar
 * olo desde dentro de la clase y no sean públicos.
 */
fun ejercicio2(){}

/**
 * Ejercicio 4.3
 *
 * Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y
 * los métodos para calcular el area y el perimetro. Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.
 *
 *  Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo: override fun toString() = "". (Pulsa Ctrl+o)
 *
 * En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.
 */
fun ejercicio3() {
    val rectangulo1 = Rectangulo(14.76, 73.03)
    comprobarRectangulo()
    println("Este rectangulo tiene ${rectangulo1.base}cm de base y ${rectangulo1.altura}cm de altura, cuya area es de ${"%.2f".format(rectangulo1.area)}cm y su perimetro es de ${"%.2f".format(rectangulo1.perimetro)}cm.")

    val rectangulo2 = Rectangulo(134.76, 373.03)
    comprobarRectangulo()
    println("Este rectangulo tiene ${rectangulo2.base}cm de base y ${rectangulo2.altura}cm de altura, cuya area es de ${"%.2f".format(rectangulo2.area)}cm y su perimetro es de ${"%.2f".format(rectangulo2.perimetro)}cm.")

    val rectangulo3 = Rectangulo(914.76, 723.03)
    comprobarRectangulo()
    println("Este rectangulo tiene ${rectangulo3.base}cm de base y ${rectangulo3.altura}cm de altura, cuya area es de ${"%.2f".format(rectangulo3.area)}cm y su perimetro es de ${"%.2f".format(rectangulo3.perimetro)}cm.")
}

fun comprobarRectangulo() {
    try {
        val rectangulo1 = Rectangulo(0.0, 0.0)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}

/**
 *Ejercicio 4.4
 *
 * Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo,
 * el número de caballos, el número de puertas y la matrícula. Crear el constructor del coche, así como los métodos estándar: getters, setters y toString().
 *
 * Para realizar getters y setters, añade el modificador private a los atributos de la clase y
 * genera los métodos getColor(), setColor(), ..., así para todos los atributos.
 *
 * En el programa principal, instancia varios coches, muestra su información, cambia el color a algunos de ellos y vuelve a mostrarlos por pantalla.
 *
 * Realiza también una modificación al método setNumCaballos() para que no permita actualizar el atributo numCaballos
 * con un valor interior a 70, ni superior a 700.
 *
 * Realiza otra modificación al método setNumPuertas() para que no se pueda actualizar con
 * un valor inferior a 3, ni superior a 5... pero esta vez utiliza require.
 *
 * Para probar las modificaciones a los métodos anteriores, solicita al usuario el número de caballos para un coche y haz lo mismo para el número de puertas.
 */

/**
 * Ejercicio 4.5
 *Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser construida indicando los tres atributos,
 * sólo hora y minuto o sólo la hora (si no se indica, el valor de minuto o segundo será 0).
 *
 * Crear el método toString() para mostrar el tiempo en formato: XXh XXm XXs.
 *
 * En el programa principal, debe solicitar por teclado hora, minuto y segundo de forma que se puedan omitir
 * los segundos o los minutos (y segundos, claro) e instancie la clase Tiempo mostrando su valor.
 *
 * A tener en cuenta:
 *
 * Si segundos o minutos es mayor que 60, se tendrá que hacer las operaciones necesarios
 * para incrementar la magnitud superior por el resultado del modulo de 60, quedándose en segundos o minutos
 * con el resto. Es decir 65 segundos equivale a : 1 minuto y 5 segundos.
 * Hora siempre tendrá que ser menor que 24, si no, lanzará una excepción.
 */
fun main(){
    println("----------*******Ejercicio 4.1*******---------")
    //ejercicio1()
    println("----------*******Ejercicio 4.2*******---------")
    //ejercicio2()
    println("----------*******Ejercicio 4.3*******---------")
    ejercicio3()
    println("----------*******Ejercicio 4.4*******---------")
    println("----------*******Ejercicio 4.5*******---------")
}