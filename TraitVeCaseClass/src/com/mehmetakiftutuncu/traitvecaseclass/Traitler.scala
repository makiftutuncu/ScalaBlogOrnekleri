package com.mehmetakiftutuncu.traitvecaseclass

trait Insan {
  val isim: String
}

trait Muzisyen extends Insan {
  val enstrumanAdi: String
  val tecrube: Int

  def cal(): Unit = {
    println(s"Merhaba, ben $isim.")
    println(s"$tecrube yıllık müzisyenim ve size $enstrumanAdi çalacağım.")
  }
}

trait Gitarist extends Muzisyen {
  override val enstrumanAdi: String = "gitar"
}

trait Virtuoz extends Muzisyen {
  override val tecrube: Int = 20
}

trait Muhendis {
  val alan: String

  def sorunuCoz(sorunAlani: String): Boolean
}
