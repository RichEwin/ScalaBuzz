import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ScalaBuzzSpec extends AnyFlatSpec with should.Matchers {

  "ScalaBuzz" should "return n, if not %3 or %5" in {
    var ScalaBuzz = new ScalaBuzz
    ScalaBuzz.evaluate(1) should be("1")
  }
}