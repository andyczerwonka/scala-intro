package intro
import org.scalatest.{FunSuite, Matchers}

class CallByValueSpec extends FunSuite with Matchers {
  import CallByValue.time

  test("test out the timing dsl") {
    time("Running the test") {
      (for (x <- 0 until 1000000) yield x + 1) should not be empty
    }
  }

}
