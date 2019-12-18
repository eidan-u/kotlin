fun main(){
    val animalerie = Animalerie()

    animalerie.ajouterAnimal(peroquet())
    animalerie.ajouterAnimal(chien())
    animalerie.ajouterAnimal(chat())
    animalerie.ajouterAnimal(AnimalVide())


    for (moyen in animalerie.list){
        moyen.quisuisje()
    }
    for (moyen in animalerie.list){
        moyen.Parler()
    }










}