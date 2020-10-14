import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ScalaBuzzSpec extends AnyFlatSpec with should.Matchers {

  "ScalaBuzz" should "return n, if not %3 or %5" in {
    var ScalaBuzz = new ScalaBuzz
    ScalaBuzz.evaluate(1) should be("1")
    ScalaBuzz.evaluate(2) should be("2")
  }

  "ScalaBuzz" should "return Fizz for multiples of 3" in {
    var ScalaBuzz = new ScalaBuzz
    ScalaBuzz.evaluate(3) should be("Fizz")
  }
}