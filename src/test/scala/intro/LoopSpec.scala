package intro
import org.scalatest.{FunSuite, Matchers}

class LoopSpec extends FunSuite with Matchers {
  import intro.Loops._

  val xs = List(0, 1, 2, 3, 4)

  test("imperative sum with index") {
    imperativeSum(xs) shouldBe 10
  }

  test("recursive sum") {
    recursiveSum(xs) shouldBe 10
  }

  test("recursive sum blow stack") {
    assertThrows[StackOverflowError] {
      val xs = 1 to 100000
      recursiveSum(xs.toList) shouldBe 705082704
    }
  }

  test("tail recursive sum using accumulator on stack") {
    val xs = 1 to 100000
    tailRecursiveSum(xs.toList) shouldBe 705082704
  }

}
