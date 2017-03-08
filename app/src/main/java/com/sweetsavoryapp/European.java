package com.sweetsavoryapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class European extends AppCompatActivity {

    @Override
    public void setContentView(View view) {
        super.setContentView(view);

        FontChanger fontChanger = new FontChanger(getAssets(), "fonts/BRUSHSCI.ttf");
        fontChanger.replaceFonts((ViewGroup)this.findViewById(android.R.id.content));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setTitle("European");

        LinearLayout ll = (LinearLayout)findViewById(R.id.linear);
        //Typeface s = Typeface.createFromAsset(getAssets(), "fonts/BRUSHSCI.ttf");
        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        List<FoodFormat> persons;
        rv.setBackgroundResource(R.drawable.menueurope);


        persons = new ArrayList<>();
        Food foodList = new Food();
        //HashMap<String, HashMap<String, HashMap<String,String>>> American = foodList.American;
        //HashMap<String,HashMap<String, String>> App =  American.get("Appitizer");
        //HashMap<String, String> app2 = App.get("Fred Mac N Cheese Balls");
        //System.out.println(app2.values());
        //Collection aaa= American.values();
        //ArrayList<String> hello = new ArrayList<String>(aaa);
      /*  TextView tv = new TextView(this);
        tv.setText("hello");
        tv.setTextSize(50);
        *///ll.addView(tv);
        for (Map.Entry<String, HashMap<String, HashMap<String, String>>> all : foodList.Europe.entrySet()) {

            persons .add(new FoodFormat(all.getKey(),"  ","  ","  ","  ",true,""));


            for (Map.Entry< String, HashMap<String, String>>b:all.getValue().entrySet()) {
                persons .add(new FoodFormat(b.getValue().get("Title"), b.getValue().get("Description"),b.getValue().get("Price"), b.getValue().get("Servings"), b.getValue().get("ID"),false, b.getValue().get("URL")));
                //for (Map.Entry<String, String> c : b.getValue().entrySet()) {
                //System.out.println(c.toString());
                    //persons.add(new FoodFormat(c.getValue(), "Hello", "123", "5", "6"));
                //}
            }



    }
        System.out.println(persons.get(1).getId().toString());
        FoodAdapter ff = new FoodAdapter(persons, getApplicationContext());
        ff.notifyItemRangeChanged(0, ff.getItemCount());
        rv.setAdapter(ff);


    }
}
