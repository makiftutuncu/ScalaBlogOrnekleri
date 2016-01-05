package com.mehmetakiftutuncu.classveobject

/**
  * Created by akif on 05/01/16.
  */
object Main {
  def main(args: Array[String]) {
    val java1 = new JavaSinifi1("Mehmet")
    val scala1 = new ScalaSinifi1("Akif")

    println("Java isim: " + java1.getIsim())
    println("Scala isim: " + scala1.getIsim)

    println()

    println("Java: " + new JavaSinifi2("Hasan", 20))
    println("Scala: " + new ScalaSinifi2("Hüseyin", 30))

    println()

    JavaSingleton.getOrnek.selam()
    ScalaSingleton.selam()

    println()

    val javaDunyasi1  = new JavaDunyasi()
    val javaDunyasi2  = new JavaDunyasi(8)

    JavaDunyasi.selam()
    println(javaDunyasi1)
    println(javaDunyasi2)

    val scalaDunyasi1 = ScalaDunyasi()
    val scalaDunyasi2 = new ScalaDunyasi(2)

    ScalaDunyasi.selam()
    println(scalaDunyasi1)
    println(scalaDunyasi2)
  }
}
