import org.junit.jupiter.api.Test
class Test {
    @Test
    fun test_ej1() {
        val input = listOf("Alicante", "Almería", "Barcelona", "Bilbao", "Burgos", "Cádiz", "Cartagena", "Córdoba", "Gerona"
            , "Gijón", "Granada", "Huelva", "Tenerife", "Ibiza", "Jerez", "Madrid", "Málaga", "Marbella", "Murcia", "Oviedo"
            , "Pamplona", "Ronda", "Salamanca", "San Sebastián", "Santander", "Santiago", "Sevilla", "Tarragona", "Toledo",
            "Valencia", "Zaragoza")

        val outputEsperado = listOf("Alicante","Almería","Barcelona","Bilbao","Cartagena","Córdoba","Gerona","Granada","Huelva",
            "Ibiza","Madrid","Málaga","Marbella","Murcia","Pamplona","Ronda","Salamanca","San Sebastián","Santander",
            "Santiago","Sevilla","Tarragona","Valencia","Zaragoza",)

        val output = ejercicio1(input)
        assert(outputEsperado.containsAll(output) && output.containsAll(outputEsperado))
    }

    @Test
    fun test_ej2() {
        val input = listOf("Alicante", "Almería", "Barcelona", "Bilbao", "Burgos", "Cádiz", "Cartagena", "Córdoba", "Gerona"
            , "Gijón", "Granada", "Huelva", "Tenerife", "Ibiza", "Jerez", "Madrid", "Málaga", "Marbella", "Murcia", "Oviedo"
            , "Pamplona", "Ronda", "Salamanca", "San Sebastián", "Santander", "Santiago", "Sevilla", "Tarragona", "Toledo",
            "Valencia", "Zaragoza")
        val outputEsperado = listOf("ALICANTE","ALMERÍA","Barcelona","Bilbao","Cartagena","Córdoba","Gerona","Granada","Huelva",
            "Ibiza","Madrid","Málaga","Marbella","Murcia","Pamplona","Ronda","Salamanca","San Sebastián","Santander",
            "Santiago","Sevilla","Tarragona","Valencia","Zaragoza")
        val output = ejercicio2(input)
        assert(outputEsperado.containsAll(output) && output.containsAll(outputEsperado))
    }

    @Test
    fun test_ej3() {
        val input = listOf("Alicante", "Almería", "Barcelona", "Bilbao", "Burgos", "Cádiz", "Cartagena", "Córdoba", "Gerona"
            , "Gijón", "Granada", "Huelva", "Tenerife", "Ibiza", "Jerez", "Madrid", "Málaga", "Marbella", "Murcia", "Oviedo"
            , "Pamplona", "Ronda", "Salamanca", "San Sebastián", "Santander", "Santiago", "Sevilla", "Tarragona", "Toledo",
            "Valencia", "Zaragoza")
        val outputEsperado = listOf("Almería","Barcelona","Bilbao","Burgos","Cádiz","Cartagena","Córdoba","Gerona","Gijón",
            "Granada","Huelva","Ibiza","Jerez","Madrid","Málaga","Murcia","Oviedo","Ronda","Salamanca","San Sebastián",
            "Santander","Sevilla","Tarragona","Toledo",)
        val output = ejercicio3(input)
        assert(outputEsperado.containsAll(output) && output.containsAll(outputEsperado))
    }


    @Test
    fun test_ej4() {
        val input = listOf("Alicante", "Almería", "Barcelona", "Bilbao", "Burgos", "Cádiz", "Cartagena", "Córdoba", "Gerona"
            , "Gijón", "Granada", "Huelva", "Tenerife", "Ibiza", "Jerez", "Madrid", "Málaga", "Marbella", "Murcia", "Oviedo"
            , "Pamplona", "Ronda", "Salamanca", "San Sebastián", "Santander", "Santiago", "Sevilla", "Tarragona", "Toledo",
            "Valencia", "Zaragoza")
        val outputEsperado = listOf("Alicante","aíremlA","anolecraB","Bilbao","Burgos","zidáC","anegatraC","abodróC",
            "Gerona","nójiG","adanarG","Huelva","Tenerife","azibI","zereJ","Madrid","Málaga","Marbella","Murcia","Oviedo",
            "Pamplona","adnoR","acnamalaS","náitsabeS naS","rednatnaS","Santiago","alliveS","anogarraT","Toledo","Valencia",
            "Zaragoza")
        val output = ejercicio4(input)
        assert(outputEsperado.containsAll(output) && output.containsAll(outputEsperado))
    }
}