class Player(val name: String) {

    private val choices = arrayOf("BATU", "GUNTING", "KERTAS")
    var choiceIndex = -1

    fun choose(choice: String) {
        choiceIndex = choices.indexOf(choice.uppercase())

        if (choiceIndex < 0) {
            println("Input yang diterima: batu | kertas | gunting")
        }
    }
}