fun main() {
    val ciudades = listOf("Alicante", "Almería", "Barcelona", "Bilbao", "Burgos", "Cádiz", "Cartagena", "Córdoba", "Gerona"
        , "Gijón", "Granada", "Huelva", "Tenerife", "Ibiza", "Jerez", "Madrid", "Málaga", "Marbella", "Murcia", "Oviedo"
        , "Pamplona", "Ronda", "Salamanca", "San Sebastián", "Santander", "Santiago", "Sevilla", "Tarragona", "Toledo",
        "Valencia", "Zaragoza")

    // Crea una lista con todas las ciudades que tengan la letra "a" mayúscula o minuscule
    ejercicio1(ciudades).forEach{
        print("\"$it\",")
    }
    println()
    // Crea una lista de todas las ciudades que tengan la letra "a" mayúscula o minúscula. Las que tengan una "A"
    // deber ser mostradas en mayúsculas todas las letras.
    ejercicio2(ciudades).forEach{
        print("\"$it\",")
    }
    println()

    // Elimina de ciudades todas las ciudades que tengan 8 letras. Recuerda que tu lista es no Mutable
    ejercicio3(ciudades).forEach{
        print("\"$it\",")
    }
    println()
    // Escribe la lista de ciudades. Aquellas ciudades con una cantidad de letras impar al revés. Ej. Ibiza - azibI
    // Resultado esperado: [Alicante, aíremlA, anolecraB, Bilbao, Burgos, zidáC, anegatraC, abodróC, Gerona, nójiG, adanarG, Huelva, Tenerife, azibI, zereJ, Madrid, Málaga, Marbella, Murcia, Oviedo, Pamplona, adnoR, acnamalaS, náitsabeS naS, rednatnaS, Santiago, alliveS, anogarraT, Toledo, Valencia, Zaragoza]
    ejercicio4(ciudades).forEach{
        print("\"$it\",")
    }
    println()}

fun ejercicio1(ciudades: List<String>): List<String> {
    // También se puede hacer con expresiones regulares
    return ciudades.filter { it.contains("a") || it.contains("A") }
}

fun ejercicio2(ciudades: List<String>) : List<String> {
    val result = ciudades.filter { it.contains("a") || it.contains("A") }.toMutableList()
    result.forEachIndexed { pos, item ->
        if (item.contains("A")) result[pos] = item.uppercase() }
    return result
}

fun ejercicio3(ciudades: List<String>): List<String> {
    return ciudades.filter { it.length != 8 }
}

fun ejercicio4(ciudades: List<String>): List<String> {
    val ciudadesMutable = ciudades.toMutableList()
    val ciudadesImpares = ciudades.filter { (it.length.rem(2) == 1) }
    ciudadesImpares.forEach { ciudadImpar: String ->  ciudadesMutable.forEachIndexed{ index: Int, ciudad: String ->  if (ciudad.contentEquals(ciudadImpar)) ciudadesMutable[index] = ciudadesMutable[index].reversed() }  }
    return ciudadesMutable
}






