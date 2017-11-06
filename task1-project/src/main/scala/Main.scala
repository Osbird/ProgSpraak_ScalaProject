object Main extends App {

  def thread(body: => Unit): Thread = {
      val t = new Thread {
        override def run() = body
      }
      t.start

      //println(assert (acc.getBalanceAmount == 250))
      t
    }
    
  // Write a few transaction examples using Threads

}
