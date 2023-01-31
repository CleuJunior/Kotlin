class BankAccount {
    var balance = 0L

    @Volatile
    private var isClosed = false

    @Synchronized
    fun adjustBalance(amount: Long) {
        if(isClosed)  throw  IllegalStateException("Account is closed")

        this.balance += amount
    }

    @Synchronized
    fun close() {
        this.isClosed = true
    }
}
