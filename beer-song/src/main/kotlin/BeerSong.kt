private const val NO_MORE_BOTTLES = "No more bottles of beer on the wall, no more bottles of beer." +
        "\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"

private const val ONE_BOTTLE = "1 bottle of beer on the wall, 1 bottle of beer." +
        "\nTake it down and pass it around, no more bottles of beer on the wall.\n"

private const val TWO_BOTTLES = "2 bottles of beer on the wall, 2 bottles of beer." +
        "\nTake one down and pass it around, 1 bottle of beer on the wall.\n"

object BeerSong {

    fun verses(startBottles: Int, takeDown: Int): String{

        return (startBottles downTo takeDown).joinToString("\n") { verse(it) }
    }

    private fun verse(n: Int): String {
        return when (n) {
            0 -> NO_MORE_BOTTLES
            1 -> ONE_BOTTLE
            2 -> TWO_BOTTLES
            else -> "$n bottles of beer on the wall, $n bottles of beer." +
                    "\nTake one down and pass it around, ${n - 1} bottles of beer on the wall.\n"
        }
    }
}
