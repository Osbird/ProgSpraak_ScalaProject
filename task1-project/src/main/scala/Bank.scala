import exceptions._

object Bank {

  private var idCounter: Int = 0

  def transaction(from: Account, to: Account, amount: Double): Unit = // Implement
    if (amount > from.getBalanceAmount) {throw new NoSufficientFundsException("Cannot send more money than in from account")}
    else if (amount <= 0) {throw new IllegalAmountException("amount must be positive")}
    else {
      val sum = from.getBalanceAmount + to.getBalanceAmount
      from.withdraw(amount)
      to.deposit(amount)
      //Assertion after alternation
      assert((from.getBalanceAmount + to.getBalanceAmount)==sum)
    }


  def getUniqueId: Int = {
    idCounter += 1 // Can this be improved?
    idCounter
  }

}
