package com.androidegt.android.tipcal;

import android.app.Application;

/**
 * Created by Alex on 5/06/16.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://twitter.com/alexlopez_gt";

    public String getAboutUrl() {
        return ABOUT_URL;
    }

}
