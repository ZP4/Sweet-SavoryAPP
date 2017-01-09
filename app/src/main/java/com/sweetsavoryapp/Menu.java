package com.sweetsavoryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import static com.sweetsavoryapp.R.id.rv;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
      List<FoodFormat> persons;


        persons = new ArrayList<>();
        Food food = new Food();
        HashMap<String, HashMap<String, HashMap<String,String>>> American = food.American;
        HashMap<String,HashMap<String, String>> App =  American.get("Appitizer");
        Collection aaa= American.values();
        ArrayList<String> hello = new ArrayList<String>(aaa);
        for (HashMap value : food.American.values()) {
            for (Object value2:value.values()) {
                persons.add(new FoodFormat(value.get("Appitizer").toString(), "Hello","123","5","6"));
            }



    }
        FoodAdapter ff = new FoodAdapter(persons,getApplicationContext());
        rv.setAdapter(ff);


    }
}
