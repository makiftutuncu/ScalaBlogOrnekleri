package com.mehmetakiftutuncu.ideaileilkscalaprojesi

/**
  * Created by akif on 19/12/15.
  */
object IlkScalaProjesi {
  def main(args: Array[String]) {
    val isimler: Array[String] = Array("Ali", "Veli", "Ahmet", "Hüseyin", "Akif")

    val secilenIsimler: Array[String] = for (isim <- isimler if isim.startsWith("A") && isim.length > 3) yield {
      println("Seçilen isim: " + isim)
      isim
    }
  }
}
