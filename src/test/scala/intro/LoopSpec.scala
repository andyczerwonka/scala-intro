package intro
import org.scalatest.{FunSuite, Matchers}

class LoopSpec extends FunSuite with Matchers {

  val xs = List(0, 1, 2, 3, 4)

  test("sum the easy way") {
    xs.sum shouldBe 10
  }

  test("sum the raw functional way") {
    xs.foldLeft(0)(_ + _) shouldBe 10

  }

}
