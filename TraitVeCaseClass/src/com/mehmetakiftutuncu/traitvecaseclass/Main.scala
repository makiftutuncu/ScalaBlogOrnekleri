package com.mehmetakiftutuncu.traitvecaseclass

/**
  * Created by akif on 24/01/16.
  */
object Main {
  def main(args: Array[String]) {
    val ahmet = new Ahmet
    val mehmet = new Mehmet
    val ali = new Ali

    ahmet.cal()
    mehmet.cal()
    ali.cal()
    ali.sorunuCoz("kimya")
    ali.sorunuCoz("bilgisayar")
  }
}
