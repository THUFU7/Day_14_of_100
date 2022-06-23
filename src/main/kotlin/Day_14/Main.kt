package Day_14
fun main(args: Array<String>) {
    val game = Game()
    println(game.path)
    game.east()
    game.south()
    game.north()
    game.west()
    game.end()
    println(game.path)
}