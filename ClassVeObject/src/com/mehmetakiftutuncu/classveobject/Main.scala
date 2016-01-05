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
  }
}
