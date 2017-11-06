import exceptions._

class Account(initialBalance: Double, val uid: Int = Bank getUniqueId) {

//class Balance(var balance)

  private var balance = initialBalance

  def withdraw(amount: Double): Unit = this.synchronized { // Implement
    if (amount <= 0) throw new IllegalAmountException("Cannot withdraw negative amount")
    else if (amount > balance) throw new  NoSufficientFundsException("insufficient funds")
    else balance = balance - amount
  }

  def deposit(amount: Double): Unit = this.synchronized { // Implement
    if (amount > 0) balance = balance + amount
    else throw new IllegalAmountException("cannot deposit negative amount. Use withdraw instead");
  }

  def getBalanceAmount: Double = { // Implement
    balance
  }
}
