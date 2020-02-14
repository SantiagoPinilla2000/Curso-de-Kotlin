const val nombreCompleto =
    "SantiagoPinilla" //son variables globales unchangeable y se utilizan en tiempo de compilacion.

fun main(args: Array<String>) {
    println("Hola Mundo, por devcamilo, :3")
    //var es un tipo de variable changeable, mientras que val es unchangeable y se utilizan en tiempo de ejecucion.
    val a = 10
    val b = 5

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    /*Formas de declarar un tipo de dato en una variable*/
    val name = "Santiago"
    val apellido: String = "Pinilla"

    if (name == "Santiago") {
        println("Nombre: $name.\nNombre completo: $nombreCompleto.")
    } else {
        println("Error, nombre incorrecto")
    }
    val parrafo: String = """
        Hola, vamos a aprender Kotlin para poder presentarnos 
        dignamente a worldskills :)
    """.trimIndent()
    println("\n$parrafo")
    //Rangos
    val listaNumeros = 1..5
    for (i in listaNumeros) {
        println(i)
    }

    val num2 = 10

    when (num2) {
        in 1..5 -> println("El numero se encuentra del 1 al 5.")
        in 6..10 -> println("El numero esta fuera del rango permitido")
        else -> println("No se encuentra en ningun rango")
    }

    var bucle = 1

    while (bucle <= 6) {
        println("Intento: $bucle")
        bucle++
    }
    println("Intentos agotados...fin.")

    var days = listOf("Lunes", "Martes", "Miercoles")

    for ((index, day) in days.withIndex()) {
        println("$index :$day")
    }
    for (i in 1..3) {
        println("i: $i")
        if (i.equals(3)) break
        println("Intento numero: $i")
    }
    //Valores null en kotlin.
    var compute: String?
    compute = null
    var longitud: Int? = compute?.length
    println("Longitud: $longitud")

    val listWithNulls: List<Int?> = listOf<Int?>(7, null, null, 4)
    println(listWithNulls)

    val listWithoutNulls: List<Int?> = listWithNulls.filterNotNull()
    println(listWithoutNulls)
    //Convertir Arrays a datosde tipo primitivo
    var arrayObject: Array<Int> = arrayOf(1, 2, 3)
    var arrayInt: IntArray = arrayObject.toIntArray()
    //Agregar un dato a un array

    arrayObject = arrayObject.plus(4)
    for (n in arrayObject) {
        println("Array : $n")
    }
    var x = 5
    var mens = "El valor de x es $x"
    x++
    println("${mens.replace("es", "fue")}, El valor de x ahora es $x")

    //lambdas vendrian siendo una forma de declarar funciones

    var suma = { a: Int, b: Int, c: Int -> a + b + c }
}