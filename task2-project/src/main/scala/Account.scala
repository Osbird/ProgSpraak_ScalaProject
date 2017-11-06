import exceptions._

class Account(val bank: Bank, initialBalance: Double) {

  class Balance(var amount: Double) {}

  val balance = new Balance(initialBalance)
  val uid = bank.generateAccountId


  def withdraw(amount: Double): Unit = this.synchronized { // Implement
    if (amount <= 0) throw new IllegalAmountException("Cannot withdraw negative amount")
    else if (amount > getBalanceAmount) throw new  NoSufficientFundsException("insufficient funds")
    else balance.amount -= amount
  }

  def deposit(amount: Double): Unit = this.synchronized { // Implement
    if (amount > 0) balance.amount += amount
    else throw new IllegalAmountException("cannot deposit negative amount. Use withdraw instead");
  }

  def getBalanceAmount: Double = { // Implement
    balance.amount
  }

 // Like in part 1

  def transferTo(account: Account, amount: Double) = {
    bank.addTransactionToQueue(this, account, amount)
  }


}
