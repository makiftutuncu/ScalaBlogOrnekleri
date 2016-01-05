package com.mehmetakiftutuncu.classveobject

/**
  * Created by akif on 05/01/16.
  */
class ScalaDunyasi(val surum: Int) {
  override def toString = ScalaDunyasi.dunyaAdi + " " + surum
}

object ScalaDunyasi {
  val dunyaAdi: String = "Scala"

  def apply(): ScalaDunyasi = {
    new ScalaDunyasi(1)
  }

  def apply(surum: Int): ScalaDunyasi = {
    new ScalaDunyasi(surum)
  }

  def selam(): Unit = {
    println("Selam " + dunyaAdi + "!")
  }
}
