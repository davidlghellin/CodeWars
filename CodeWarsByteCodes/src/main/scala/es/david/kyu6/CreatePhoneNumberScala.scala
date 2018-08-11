package es.david.kyu6

object CreatePhoneNumberScala {
  def createPhoneNumber(numbers: Seq[Int]) = {
    s"(${numbers(0)}${numbers(1)}${numbers(2)}) ${numbers(3)}${numbers(4)}${numbers(5)}-${numbers(6)}${numbers(7)}${numbers(8)}${numbers(9)}"
  }
}
