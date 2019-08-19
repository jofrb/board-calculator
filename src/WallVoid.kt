abstract class WallVoid {

    abstract val height: Int
    abstract val width: Int
    abstract val toFloor: Int

    fun wallMaterialAboveAndBeneth(boardType: BoardType, ceilingHeight: Int): Int{
        val heightOver = ceilingHeight - (toFloor + height)
        var lenghtToCoverOver = width
        var lengthToCoverUnder = width

        if (heightOver > toFloor) // Take above first
    }

    fun coverWall(boardType: BoardType, height: Int, width: Int){
        while (width > 0){
            if (boardType.waste.any { it > height } boardType)
        }
    }

}