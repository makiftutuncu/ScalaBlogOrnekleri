package com.mehmetakiftutuncu.traitvecaseclass

class Ahmet extends Gitarist {
  override val isim: String = "Ahmet"
  override val tecrube: Int = 1
}

class Mehmet extends Gitarist with Virtuoz {
  override val isim: String = "Mehmet"
}

class Ali extends Muzisyen with Muhendis {
  override val isim: String = "Ali"

  override val enstrumanAdi: String = "piyano"
  override val tecrube: Int = 5

  override val alan: String = "bilgisayar"

  override def sorunuCoz(sorunAlani: String): Boolean = {
    println(s"Ben $isim ve $alan mühendisiyim.")

    if (sorunAlani != "bilgisayar") {
      println(s"$sorunAlani alanındaki sorunu çözemiyorum.")
      false
    } else {
      println(s"$sorunAlani alanındaki sorun çözüldü.")
      true
    }
  }
}
