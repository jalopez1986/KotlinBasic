import model.Camera
import model.Movie
import model.Shoe

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


    //for
    var daysOfWeek = listOf("Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")
    for (day in daysOfWeek) {
        println(day)
    }

    //acceder al indice
    for ((index,day) in daysOfWeek.withIndex()) {
        println("$index :$day")
    }

    //foreach lo mismo que for pero con una sintaxis mas simplificada
    println("Foreach")
    daysOfWeek.forEach{
        println(it)
    }

    daysOfWeek.forEachIndexed { index, day ->
        println("$index :$day")
    }

    var msg: String?
    msg = null

    var len = msg?.length

    println(len)

    if (len == null) {
        println("El valor de len es null")
    }

    println("Despues del length")

    //operador elvis una mejor forma de llevar el control del flujo
    len = msg?.length ?: -1

    println("El tamaño de la cadena es $len")

    //Listas con valores nulos
    val listWithNull: List<Int?> = listOf(7,null,null,7)
    println("Lista con Null: ${listWithNull}")

    val listWithoutNull: List<Int?> = listWithNull.filterNotNull()
    println("Lista sin Null: ${listWithoutNull}")


    //Convertir un array de tipo objeto a primitivo
    var arrayObject = arrayOf(1,2,3)
    var intPrimitive: IntArray = arrayObject.toIntArray()

    //sumar elementos de un arreglo
    val suma = arrayObject.sum()
    println("La suma es: $suma")
    
    //agregar elemento al arreglo
    arrayObject = arrayObject.plus(4)
    for (o in arrayObject) {
        println("Elemento: $o")
    }

    //colocar al reves un arreglo
    arrayObject = arrayObject.reversedArray()
    for (o in arrayObject) {
        println("Elemento: $o")
    }


    //expresiones vs valores
    var x = 5
    println("X es igual a 5? ${x==5}")

    var mensaje = "El valor de x es $x"
    x++
    println("${mensaje.replace("es", "fue")}, x es igual a: $x")

    //funciones
    //llamar una funcion propia de kotlin
    println("Raiz cuadrada de: ${Math.sqrt(4.0)}")

    //llamar una funcion
    //array
    val numbers = intArrayOf(3,4,10,5,9,15,25)
    println(averageNumbers(numbers))

    nameAndCity("Jorge", "Cali")
    nameAndCity("Alberto")

    //lambdas
    val saludo = {println("Hola mundo")}
    saludo()

    //val suma = {instrucciones -> sentencias}
    val plus = {a: Int, b: Int, c: Int -> a+b+c}
    val result = plus(3,4,5)
    println(result)

    //llamar lambda de inmediato
    println({a: Int, b: Int, c: Int -> a+b+c}(7,8,9))

    val calculateNumber = { n: Int ->
        when(n) {
            in 1..3 -> println("Tu numero esta entre 1 y 3")
            in 4..7 -> println("Tu numero esta entre 4 y 7")
            in 8..10 -> println("Tu numero esta entre 8 y 10")
        }
    }

    println(calculateNumber(6))

    //clases
    val camera = Camera()
    camera.turnOn()
    println(camera.getCameraStatus())

    //getter y setter provistor por el programador
    println("Resolution: ${camera.getResolution()}")
    camera.setResolution(1080)
    println("Resolution: ${camera.getResolution()}")

    //show example
    var shoe = Shoe("Shoe", "Blue shoe",12345, "praga")
    shoe.size = 33
    println(shoe.size) //imprime 34
    shoe.size = 37
    println(shoe.size) // imprime 37

    shoe.model = "Charol"
    println(shoe.model)
    shoe.model = "Tenis"
    println(shoe.model)
    println(shoe.toString())



    //data class
    val movie = Movie("coco", "pixar", 120)
    println("Movie")
    println(movie.tittle)
    println(movie.creator)
    println("${movie.duration} min.")
    println(movie.toString())  //ya es un toString que tiene por defecto el data clas






}

//funciones propias
fun averageNumbers(numbers: IntArray): Int {
    var sum = 0
    numbers.forEach {
        sum = sum.plus(it)
    }

    return sum.div(numbers.size)
}

//parametro por defecto
fun nameAndCity(name: String, city:String = "Pereira") {
    println("Hola ${name} tu ciudad de origen es: ${city}")
}
