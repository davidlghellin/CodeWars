package es.david.kyu6

import org.scalatest.{FunSpec, FunSuite}

class CreatePhoneNumberScalaTest extends FunSpec {
  it(s"should correctly create phone numbers") {
    assert(CreatePhoneNumberScala.createPhoneNumber(Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)) == "(123) 456-7890")
  }
}
