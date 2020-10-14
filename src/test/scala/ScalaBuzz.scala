case class ScalaBuzz() {
  def evaluate(n: Int): String = {
    if (n % 3 == 0) {
      "Fizz"
    } else if (n % 5 == 0) {
      "Buzz"
    } else {
      n.toString
    }
  }
}
