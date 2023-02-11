import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class CollatzSpec extends AnyFunSuite with Matchers:

    test("Collatz 6") {
        collatz(6) should be(3)
    }
    test("Collatz 7") {
        collatz(7) should be(22)
    }
    test("Collatz 1") {
        collatz(1) should be(4)
    }
    test("Collatz 2") {
        collatz(2) should be(1)
    }
    test("Collatz 42") {
        collatz(42) should be(21)
    }
    test("Collatz 101") {
        collatz(101) should be(304)
    }

    test("Collatz Count 1") {
        collatzCount(1) should be(0)
    }
    test("Collatz Count 101") {
        collatzCount(101) should be(25)
    }
    test("Collatz Count 1111") {
        collatzCount(1111) should be(31)
    }
    test("Collatz Count 267") {
        collatzCount(267) should be(21)
    }

end CollatzSpec
