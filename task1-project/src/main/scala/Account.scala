class Account(initialBalance: Double, val uid: Int = Bank getUniqueId) {
  private var balance = initialBalance
  def withdraw(amount: Double): Unit = Account // Implement
    if (amount > 0) && amount <= balance): {
      balance = balance - amount
      balance
    } else throw new Error("insufficient funds")
    //balance = initialBalance - amount
    print(balance)





  def deposit(amount: Double): Unit = Account // Implement
    if (amount > 0){
      balance = balaance + amount
      balance
    }

  def getBalanceAmount: Double = ??? // Implement

  val acc = new Account(500)
  acc.withdraw(250)
  assert (acc.getBalanceAmount == 250)
}
