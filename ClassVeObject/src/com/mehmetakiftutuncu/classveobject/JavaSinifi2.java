package com.mehmetakiftutuncu.classveobject;

/**
 * Created by akif on 05/01/16.
 */
public class JavaSinifi2 {
    public String isim;
    public int yas;

    public JavaSinifi2() {
        this("", 0);
    }

    public JavaSinifi2(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    @Override public String toString() {
        return isim + " (" + yas + ")";
    }
}
