package com.mehmetakiftutuncu.classveobject

/**
  * Created by akif on 05/01/16.
  */
class ScalaSinifi1 {
  private var isim: String = ""

  def this(isim: String) {
    this()
    this.isim = isim
  }

  def getIsim: String = isim

  def setIsim(isim: String): Unit = {
    this.isim = isim
  }
}
