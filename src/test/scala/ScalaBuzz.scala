case class ScalaBuzz() {
  def evaluate(n: Int): String = {
    if (n % 3 == 0) {
      "Fizz"
    } else {
      n.toString
    }
  }
}
