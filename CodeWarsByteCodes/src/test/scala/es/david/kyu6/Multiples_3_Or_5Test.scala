// https://www.codewars.com/kata/multiples-of-3-or-5/scala
package es.david.kyu6

import org.scalatest.FunSpec

class Multiples_3_Or_5Test extends FunSpec {

  import es.david.kyu6.Multiples_3_Or_5._

  describe("Multiples of 3 or 5") {
    it("should handle basic cases") {
      assert(solution(10) === 23L)
      assert(solution(20) === 78L)
    }
  }
}
