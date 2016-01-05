package com.mehmetakiftutuncu.classveobject;

/**
  * Created by akif on 05/01/16.
  */
public class JavaDunyasi {
    public static final String dunyaAdi = "Java";

    public final int surum;

    public JavaDunyasi() {
        this(1);
    }

    public JavaDunyasi(int surum) {
        this.surum = surum;
    }

    public static void selam() {
        System.out.println("Selam " + dunyaAdi + "!");
    }

    @Override public String toString() {
        return dunyaAdi + " " + surum;
    }
}
