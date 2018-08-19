package es.david.kyu6

import scala.util.{Failure, Success, Try}

object Rainfall {

  def mean(town: String, strng: String): Double = {

    val arrayDatos: Array[Float] = getDatos(strng, town)
    val len = arrayDatos.length

    len match {
      case a if a < 12 => -1.0
      case _ => arrayDatos.sum / arrayDatos.length
    }
  }

  def variance(town: String, strng: String): Double = {

    val arrayDatos: Array[Float] = getDatos(strng, town)
    val len = arrayDatos.length

    len match {
      case a if a < 12 => -1.0
      case _ => {
        val avg = arrayDatos.sum / arrayDatos.length

        arrayDatos.map(_.toDouble).map(a => math.pow(a - avg, 2)).sum / arrayDatos.size
      }
    }
  }

  def getDatos(listCiudades: String, ciudad: String): Array[Float] = {

    val lista: Array[String] = listCiudades.split("\n")
    val datosCiudad = Try {
      lista.filter(x => x.startsWith(ciudad))(0)
    } match {
      case Success(value) => value
      case Failure(_) => ""
    }

    datosCiudad.split(":").length match {
      case 1 => Array(-1.0f)
      case _ => {
        Try {
          val mesData: String = datosCiudad.split(":")(1)
          val arrayMesData: Array[String] = mesData.split(",")
          val arrayDatos: Array[Float] = arrayMesData.map(x => x.split(" ")(1).toFloat)
          arrayDatos
        } match {
          case Success(x) => x
          case Failure(_) => Array(-1.0f)
        }
      }
    }
  }

}
