fun main(args: Array<String>) {
    do {
        val player1 = Player("pemain 1")
        val player2 = Player("pemain 2")
        val suit = Suit("GAME SUIT VERSI TERMINAL", player1, player2)

        suit.startGame()
        suit.getResult()

        println()
        print("Masukkan 'Y' untuk mengulang: ")
    } while (readLine()?.trim()?.uppercase() ?: "" == "Y")
}