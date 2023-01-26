import kotlin.math.abs

class Squares(private var numSquare: Int) {

    fun sumOfSquares(): Int = (1..this.numSquare).sumOf { it * it }

    fun squareOfSum(): Int = (1..this.numSquare).sum().let { it * it }

    fun difference(): Int = abs(squareOfSum() - sumOfSquares())

}
