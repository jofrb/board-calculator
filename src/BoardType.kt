class BoardType(val width: Int, val thickness: Int, val lenght: Int) {

    internal var numberOfBoardsUsed: Int = 0
    get() = field

    val waste = mutableListOf<Int>()

    fun incrementBoard(){
    numberOfBoardsUsed++
    }
}