fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 8
    val isBlessed = true
    val isImmortal = true
    var auracolor = "green"
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    if (auraVisible) {
        if(karma in 0..5)  auracolor ="red"
        if(karma in 6..10)  auracolor= "orange"
        if(karma in 11..15) auracolor="purple"
        if(karma in 16..20)  auracolor="green"
        println("Aura Color is $auracolor")
}}