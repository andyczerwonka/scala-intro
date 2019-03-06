package intro
import org.scalatest.{FunSuite, Matchers}

class PartialApplicationSpec extends FunSuite with Matchers {
  import intro.PartialApplication._

  test("html example") {
    div(p("Hello")) shouldBe "<div><p>Hello</p></div>"
  }

}
