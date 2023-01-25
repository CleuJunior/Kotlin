import java.util.*

object Pangram {
    private const val ALPHABET = "abcdefghijklmnopqrstuvwxyz"

    fun isPangram(input: String): Boolean {
        val checkPangram = stdStringCompare(input)
        return ALPHABET == checkPangram
    }

    private fun stdStringCompare(string: String) : String {
        return string.replace("[^A-Za-z]".toRegex(), "")
                .lowercase(Locale.getDefault())
                .toCharArray()
                .distinct()
                .sorted()
                .joinToString("")
    }
}
