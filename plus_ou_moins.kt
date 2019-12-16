fun main() {
    val ran = (0..100).random()

    var compte: Int = 0

    var Texte: String = "Veuillez entrer un nombre entre 0 et 100"
    println(Texte)

    val JoueurInt = null

    while (JoueurInt != ran ) {
        var joueur = readLine()!!
        val JoueurInt =  joueur.toInt()
        if (JoueurInt < ran) {
            Texte = "hé non le resultat est plus haut"
            println(Texte)
            println("Veuillez re essayer")
            compte++
            println("Vous avez fait $compte essais")
        } else if (JoueurInt > ran) {
            Texte = "hé non le resultat est plus bas"
            println(Texte)
            println("Veuillez re essayer")
            compte++
            println("Vous avez fait $compte essais")
        } else {
            Texte = ("Vous avez gagné mashallah")
            println(Texte.toUpperCase())
            compte++
            println("Vous avez fait $compte essais")
            break
        }


    }

}