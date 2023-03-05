class Suit(private val name: String, private var player1: Player, private var player2: Player) : Game(name) {

    private fun getPlayerChoice(player: Player, no: String): Player {
        while (player.choiceIndex < 0) {
            print("$no. Masukkan ${player.name}: ")
            readLine()?.let { player.choose(it) }
        }

        return player
    }

    override fun startGame() {
        super.printName()

        player1 = getPlayerChoice(player1, "1")
        player2 = getPlayerChoice(player2, "2")
    }

    override fun getResult() {
        var result = " MENANG"
        var diff = player1.choiceIndex - player2.choiceIndex

        result = when (diff) {
            -1,2 -> player1.name + result
            1, -2 -> player2.name + result
            else -> {
                "DRAW"
            }
        } + "!"

        println()
        println("Hasil:")
        println(result)
    }
}