const val T_MENU_PRINCIPAL =
    """
        
:: Bienvenido a Recipe Maker ::
Selecciona la opción deseada
1. Hacer una receta
2. Ver mis recetas
3. Salir"""

val INGREDIENTES = listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")


fun main(Args: Array<String>) {
    var input: String? = null
    val recetas = mutableListOf<List<String>>()

    println(T_MENU_PRINCIPAL)
    exitWhile@ while (input == null) {

        input = readLine() ?: "0"
        var inputInt: Int
        try {
            inputInt = input.toInt()
        } catch (e: Exception) {
            print("Error! Ingrese un número!: ")
            input = null
            continue
        }

        when (inputInt) {
            1 -> recetas.add(makeRecipe())
            2 -> watchRecipes(recetas)
            3 -> {
                println("Saliendo... "); break@exitWhile
            }
            else -> {
                print("Ingrese un numero entre 1 y 3: ")
                input = null
                continue@exitWhile
            }
        }
        input = null
        println(T_MENU_PRINCIPAL)
    }

}

fun makeRecipe(): List<String> {
    val receta = mutableListOf<String>()

    println("Los ingredientes son:")
    for ((i, ingrediente) in INGREDIENTES.withIndex())
        println("${i + 1}. $ingrediente")

    var input: String? = null

    println("Escribe el número del ingrediente que deseas agregar o 's' para salir al menu:")

    while (input == null) {
        input = readLine() ?: "0"

        if (input.equals("s"))
            break

        try {
            receta.add(INGREDIENTES[input.toInt() - 1])

            println("${INGREDIENTES[input.toInt() - 1]} agregado a la lista!")
            println("Ingresa otro numero de ingrediente o 's' para salir:")
            input = null
        } catch (e: Exception) {
            print("Ingresa un numero valido!: ")
            input = null
        }
    }

    return receta
}

fun watchRecipes(recetas: List<List<String>>) {
    if (recetas.size > 0) {
        println("-----------------------------")
        recetas.withIndex().forEach { (i, receta) ->
            println("Receta ${i+1}")
            receta.withIndex().forEach { (j, ingrediente) ->
                println("${j+1}. $ingrediente")
            }
            println("-----------------------------")
        }
    } else {
        println("Aun no hay aun ninguna receta!")
    }
}