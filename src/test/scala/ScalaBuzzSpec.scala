import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ScalaBuzzSpec extends AnyFlatSpec with should.Matchers {

  var ScalaBuzz = new ScalaBuzz

  "ScalaBuzz" should "return n, if not %3 or %5" in {
    ScalaBuzz.evaluate(1) should be("1")
    ScalaBuzz.evaluate(2) should be("2")
  }

  "ScalaBuzz" should "return Fizz for multiples of 3" in {
    ScalaBuzz.evaluate(3) should be("Fizz")
    ScalaBuzz.evaluate(6) should be("Fizz")
  }

  "ScalaBuzz" should "return Buzz for multiples of 5" in {
    ScalaBuzz.evaluate(5) should be("Buzz")
    ScalaBuzz.evaluate(10) should be("Buzz")
  }

  "ScalaBuzz" should "return FizzBuzz for multiples of 3 & 5" in {
    ScalaBuzz.evaluate(15) should be("FizzBuzz")
    ScalaBuzz.evaluate(30) should be("FizzBuzz")
  }
}