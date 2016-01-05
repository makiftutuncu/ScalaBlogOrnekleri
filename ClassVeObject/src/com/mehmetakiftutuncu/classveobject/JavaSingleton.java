package com.mehmetakiftutuncu.classveobject;

/**
  * Created by akif on 05/01/16.
  */
public class JavaSingleton {
    private static JavaSingleton ornek;

    private JavaSingleton() {}

    public static JavaSingleton getOrnek() {
        if (ornek == null) {
            ornek = new JavaSingleton();
        }

        return ornek;
    }

    public void selam() {
        System.out.println("Java: Selam!");
    }
}
