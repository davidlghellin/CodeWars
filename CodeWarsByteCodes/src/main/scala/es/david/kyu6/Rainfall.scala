package es.david.kyu6

object Rainfall {

  def mean(town: String, strng: String): Double = {
    val arrayDatos: Array[Float] = getDatos(strng, town)
    arrayDatos.sum / arrayDatos.length
  }

  def variance(town: String, strng: String): Double = {

    val arrayDatos: Array[Float] = getDatos(strng, town)

    val avg = arrayDatos.sum / arrayDatos.length

    arrayDatos.map(_.toDouble).map(a => math.pow(a - avg, 2)).sum / arrayDatos.size
  }

  def getDatos(listCiudades: String, ciudad: String) = {
    val lista: Array[String] = listCiudades.split("\n")
    lista.foreach(println)

    val datosCiudad = lista.filter(x => x.startsWith(ciudad))(0)
    println("----------")

    val mesData: String = datosCiudad.split(":")(1)
    val arrayMesData: Array[String] = mesData.split(",")
    val arrayDatos: Array[Float] = arrayMesData.map(x => x.split(" ")(1).toFloat)
    arrayDatos
  }

}
