class AnimalVide: Animal {
    override fun quisuisje() {
        println("entrez nouvel animal")
        val nouvelanimal = readLine()!!
        println("votre animal est un(e) $nouvelanimal")
    }

    override fun Parler() {
        println("entrez nouvel cri")
        val nouveauCri = readLine()!!
        println("votre animal fait $nouveauCri")
    }
}