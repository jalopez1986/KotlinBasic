const val NAME = "NAME CONSTANT DECLARATION"
var n = "n" // mala practica tener var globales
val n2 = "n" //se usan mas en funciones locales. No se pueden cambiar despues de asiganas

fun main(args: Array<String>) {
    println("Hola Mundo")

    //Operaciones con datos primitivos
    println(1+1)
    println(3-1)
    println(2*2)
    println(4/2)
    println(7%2)

    //TODO: En kotlin todo es un objeto. Es mejor usar esto:

    val a = 4
    val b = 2

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.rem(b))

    //operador de negación
    var aux1 = true
    var aux2 = aux1.not();
    println("aux2: $aux2")

    println("Resultado: ${aux1.and(false)}")

    //a++
    println("a ${a.inc()}")

    //Strings
    val nombre = "Jorge"
    val apellido: String = "López"

    println("Tu nombre es: " + nombre + " " + apellido)
    println("Tu nombre es: $nombre $apellido")  //propio de Kotlin

    //raw String
    val parrafo: String = """
        Lorem Ipsum is simply dummy text of the printing
        and typesetting industry. Lorem Ipsum has been the industry's
        standard dummy text ever since the 1500s, when an unknown printer
        took a galley of type and scrambled it to make a type specimen book.
    """.trimIndent()

    println(parrafo)

    //Conversión de tipos de datos
    var variableEntera: Int = 5
    var variableLong: Long = variableEntera.toLong()

    println(variableLong + 6.0)  //suma como long

    var variableString = variableEntera.toString()
    println(variableString + 6)  //concatena como string


    //rangos
    //numericos
    val oneToHundred = 1..5
    for (i in oneToHundred) {
        println(i)
    }

    //Strings
    for (i in 'A'..'D') {
        println(i)
    }

    //Operadores
    //if igual que siempre
    val numero = 10
    if (numero.equals(2)) {
        println("Son iguales")
    } else {
        println("No son iguales")
    }

    when(numero) {
        10 -> println("Numero es igual a 10")
        in 1..3 -> println("Sí esta entre 1 y 3")
        in 1..5 -> println("Sí esta entre 1 y 5")
        else -> println("No está en alguno de los anteriores")
    }

}