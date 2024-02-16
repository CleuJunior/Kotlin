import java.time.LocalDate
import java.time.LocalDateTime

private const val GIGASECONDS = 1_000_000_000L

class Gigasecond {

    var date: LocalDateTime? = null

    constructor(startDate: LocalDate) {
        date = startDate.atStartOfDay().plusSeconds(GIGASECONDS)
    }

    constructor(startDate: LocalDateTime) {
        date = startDate.plusSeconds(GIGASECONDS)
    }

}
