fun main(args: Array<String>) {
    println("Hola Calculadora")

    var result = calculadora(1,2,3,::multiplicar)
    println("Resultado: $result")



}

fun calculadora(a: Int, b: Int, c: Int, operacion:(Int, Int, Int) -> Int): Int {
    return operacion(a,b,c)
}

fun sumar(a: Int, b: Int, c: Int) = a+b+c;
fun multiplicar(a: Int, b: Int, c: Int) = a*b*c;