package com.sweetsavoryapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void setContentView(View view) {
        super.setContentView(view);

        FontChanger fontChanger = new FontChanger(getAssets(), "fonts/BRUSHSCI.ttf");
        fontChanger.replaceFonts((ViewGroup)this.findViewById(android.R.id.content));
    }

    @Override
    public void onBackPressed() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Sweet N Savory");
        final ImageView image= (ImageView) findViewById(R.id.mainpic);

        final Intent americanIntent = new Intent(this, Menu.class);
        final Intent SouthernIntent = new Intent(this, South.class);
        final Intent brooklynIntent = new Intent(this, Brooklyn.class);
        final Intent hispanicIntent = new Intent(this, Hispanic.class);
        final Intent middleEastIntent = new Intent(this, MiddleEast.class);
        final Intent asiaIntent = new Intent(this, Asian.class);
        final Intent carribeanIntent = new Intent(this, Carribean.class);
        final Intent europeIntent = new Intent(this, European.class);
        final Intent africaIntent = new Intent(this, African.class);
        final Intent Drinks = new Intent(this, Drinks.class);
        final Intent contactUs = new Intent(this, ContactUs.class);
        //final Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));

                    //Toast.makeText(getConte)

    Button Drinks1 = (Button) findViewById(R.id.drinks);
        Drinks1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Drinks);
            }
        });
        Button Brooklyn =(Button) findViewById(R.id.button1);
        Brooklyn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //startActivity(browserIntent);
                startActivity(brooklynIntent);
            }
        });

        Button Hispanic =(Button) findViewById(R.id.button2);
        Hispanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(hispanicIntent);
            }
        });

        Button TheMiddleEast =(Button) findViewById(R.id.button3);
        TheMiddleEast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(middleEastIntent);
            }
        });

        Button Asia =(Button) findViewById(R.id.button4);
        Asia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(asiaIntent);
            }
        });

        Button Carribean =(Button) findViewById(R.id.button5);
        Carribean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(carribeanIntent);
            }
        });

        Button Europe =(Button) findViewById(R.id.button6);
        //Europe.setBackgroundColor(Color.WHITE);
        //Europe.setBackgroundResource(R.drawable.europe);
        Europe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(europeIntent);
            }
        });

        Button Africa =(Button) findViewById(R.id.button7);
        Africa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(africaIntent);
            }
        });
        Button America =(Button) findViewById(R.id.button8);
        America.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(americanIntent);
            }
        });
        Button SouthernConfort = (Button) findViewById(R.id.button9);
        SouthernConfort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(SouthernIntent);
            }
        });
        Button Contact =(Button) findViewById(R.id.button10);
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(contactUs);
            }
        });

    }

}
