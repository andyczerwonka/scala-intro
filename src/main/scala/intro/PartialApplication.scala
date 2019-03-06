package intro

object PartialApplication {

  private def wrap(prefix: String)(html: String)(suffix: String) :String = {
    prefix + html + suffix
  }

  val div = wrap("<div>")(_: String)("</div>")
  val p = wrap("<p>")(_: String)("</p>")

}
