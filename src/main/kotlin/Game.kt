abstract class Game(private val name: String) {

    fun printName() {
        println("========================")
        println(name)
        println("========================")
    }

    abstract fun startGame()

    abstract fun getResult()
}