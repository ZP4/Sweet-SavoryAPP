package com.sweetsavoryapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

/**
 * Created by ZP4 on 12/14/2016.
 */

public class StartActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        ActionBar myActionBar = getSupportActionBar();
        super.onCreate(savedInstanceState);
        setTitle("");
        myActionBar.hide();
        setContentView(R.layout.activity_start);



        final ImageView img = (ImageView) findViewById(R.id.startlogo);

        final Intent i = new Intent(this, MainActivity.class);
        fadeOutAndHideImage(img, i);

    }
    public void fadeOutAndHideImage(final ImageView img, final Intent x) {

        Animation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setInterpolator(new AccelerateInterpolator());
        fadeOut.setDuration(2500);

        fadeOut.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                img.setVisibility(View.GONE);
                startActivity(x);


            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });

        img.startAnimation(fadeOut);

    }

}

