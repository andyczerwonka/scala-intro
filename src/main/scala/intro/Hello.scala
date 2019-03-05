package intro

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}

class Friendly extends Greeting {
  override lazy val greeting: String = "hello sir"
}
