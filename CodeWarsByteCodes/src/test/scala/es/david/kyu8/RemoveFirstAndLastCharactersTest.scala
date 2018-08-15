package es.david.kyu8

import es.david.kyu8.RemoveFirstAndLastCharacters.removeChars
import org.scalatest.{FlatSpec, Matchers}

class RemoveFirstAndLastCharactersTest extends FlatSpec with Matchers {

  "removeChars(eloquent)" should "return loquen" in {
    removeChars("eloquent") should be("loquen")
  }

  "removeChars(country)" should "return ountr" in {
    removeChars("country") should be("ountr")
  }
  "removeChars(person)" should "return erso" in {
    removeChars("person") should be("erso")
  }
  "removeChars(place)" should "return lac" in {
    removeChars("place") should be("lac")
  }

}
