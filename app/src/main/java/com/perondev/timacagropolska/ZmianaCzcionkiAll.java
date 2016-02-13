package com.perondev.timacagropolska;

import android.content.Context;
import android.graphics.Typeface;

import java.lang.reflect.Field;

/**
 * Created by ave on 26.12.2015.
 */
public class ZmianaCzcionkiAll {
    static public void zmienStandardowaCzcionke (Context context, String nazwaZmienianiejCzcionki, String nazwaNowejCzcionkiAssets) {
        Typeface mojaCzcionkaAll = Typeface.createFromAsset(context.getAssets(), nazwaNowejCzcionkiAssets);
        zmienCzcionke(nazwaZmienianiejCzcionki, mojaCzcionkaAll);
        
    }

    private static void zmienCzcionke(String nazwaZmienianiejCzcionki, Typeface mojaCzcionkaAll) {
        try {
            Field myfield = Typeface.class.getDeclaredField(nazwaZmienianiejCzcionki);
            myfield.setAccessible(true);
            myfield.set(null, mojaCzcionkaAll);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
