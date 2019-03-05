package intro

object Loops {

  def imperativeSum(xs: Seq[Int]): Int = {
    var sum = 0
    for (i <- xs.indices) {
      sum = sum + xs(i)
    }
    sum
  }

  def recursiveSum(xs: Seq[Int]): Int = xs match {
    case Nil          => 0
    case head :: tail => head + recursiveSum(tail)
  }

  def tailRecursiveSum(xs: Seq[Int]): Int = {
    def loop(xs: Seq[Int], accumulator: Int): Int = xs match {
      case Nil          => accumulator
      case head :: tail => loop(tail, head + accumulator)
    }
    loop(xs, 0)
  }

}
