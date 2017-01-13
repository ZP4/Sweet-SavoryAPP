package com.sweetsavoryapp;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ZP4 on 1/6/2017.
 */


// CHANGES FONTS
public class FontChanger {
    private Typeface typeface;

    public FontChanger(Typeface typeface)
    {
        this.typeface = typeface;
    }

    public FontChanger(AssetManager assets, String assetsFontFileName) {
        typeface = Typeface.createFromAsset(assets, assetsFontFileName);
    }

    public void replaceFonts(ViewGroup viewTree) {
        View child;
        for(int i = 0; i < viewTree.getChildCount(); ++i) {
            child = viewTree.getChildAt(i);
            if(child instanceof ViewGroup) {
                replaceFonts((ViewGroup)child);
            }
            else if(child instanceof TextView) {
                ((TextView) child).setTypeface(typeface);
            }
        }
    }
}
