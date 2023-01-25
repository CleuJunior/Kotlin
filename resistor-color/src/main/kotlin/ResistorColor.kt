object ResistorColor {
    private val colorValue = createColorValue()

    fun colorCode(input: String): Int {
        return colorValue[input]!!
    }

    fun colors(): List<String> {
        return colorValue.keys.toList()
    }

    private fun createColorValue(): Map<String, Int> {
        return mapOf(
                "black"  to 0,
                "brown"  to 1,
                "red"    to 2,
                "orange" to 3,
                "yellow" to 4,
                "green"  to 5,
                "blue"   to 6,
                "violet" to 7,
                "grey"   to 8,
                "white"  to 9
        )
    }

}
