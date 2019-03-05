package intro

object CallByValue {

  def time[T](str: String)(thunk: => T): T = {
    print(s"$str... ")
    val t1 = System.currentTimeMillis
    val x = thunk
    val t2 = System.currentTimeMillis
    println(s"${t2 - t1} ms")
    x
  }

}
