object Series {

    fun slices(n: Int, s: String): List<List<Int>> {
        if (n > s.length || n <= 0)
            throw IllegalArgumentException("Invalid slice length")

        if (s.isEmpty())
            throw IllegalArgumentException("Invalid input string")


        val result = mutableListOf<List<Int>>()

        for (i in 0..s.length - n) {
            val subString = s.substring(i, i + n)
            result.add(subString.map { it.toString().toInt() })
        }
        return result
    }
}
