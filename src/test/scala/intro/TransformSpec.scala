package intro
import org.scalatest.{FunSuite, Matchers}

class TransformSpec extends FunSuite with Matchers {

  val range = 0 until 10
  val even: Int => Boolean = (i: Int) => i % 2 == 0
  val double: Int => Int = _ * 2

  test("map & filter") {
    val xs = range
      .filter(even)
      .map(double)
    xs should contain inOrderOnly (0, 4, 8, 12, 16)
  }

  test("map & filter for expression sugar") {
    val xs = for {
      i <- range
      if even(i)
    } yield double(i)
    xs should contain inOrderOnly (0, 4, 8, 12, 16)
  }

  test("some more point-free example") {
    val xs = range
      .filter(even)
      .take(3)
      .reverse
      .map(double)
    xs should contain inOrderOnly (8, 4, 0)
  }

}
